import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.ClientAuth;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;
import rpc.impl.UserCustomerImpl;
import rpc.impl.UserCustomerLoginImpl;
import rpc.impl.bank_staff.BankStaffAcceptApplysImpl;
import rpc.impl.bank_staff.BankStaffImpl;
import rpc.impl.bank_staff.BankStaffLoginImpl;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

import static Const.Server.*;

public class BankServer {
    private static final Logger logger = Logger.getLogger(BankServer.class.getName());
    private Server server;

    public static void main(String[] args) {
        final BankServer server = new BankServer();
        try {
            server.start();
            server.blockUntilShutdown();
        } catch (Exception e) {
            e.printStackTrace();
            logger.severe(e.getLocalizedMessage());
        }
    }

    private void start() throws IOException {
        server = NettyServerBuilder.forAddress(new InetSocketAddress(SERVER_HOST, SERVER_PORT)).sslContext(getSslContextBuilder().build())
                .addService(new UserCustomerLoginImpl())
                .addService(new UserCustomerImpl())
                .addService(new BankStaffLoginImpl())
                .addService(new BankStaffImpl())
                .addService(new BankStaffAcceptApplysImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + SERVER_PORT);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            BankServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private SslContextBuilder getSslContextBuilder() {
        SslContextBuilder sslClientContextBuilder = SslContextBuilder
                .forServer(new File("localhost".equals(SERVER_HOST) ? SERVER_CERT_CHAIN_LOCAL : SERVER_CERT_CHAIN), new File(SERVER_PRIVATE_KEY))
                .trustManager(new File(TRUST_CERT_COLLECTION))
                .clientAuth(ClientAuth.REQUIRE);

        return GrpcSslContexts.configure(sslClientContextBuilder,
                SslProvider.OPENSSL);
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}