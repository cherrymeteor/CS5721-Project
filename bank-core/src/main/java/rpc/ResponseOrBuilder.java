// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface ResponseOrBuilder extends
        // @@protoc_insertion_point(interface_extends:rpc.Response)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 status_code = 1;</code>
     */
    int getStatusCode();

    /**
     * <code>string description = 2;</code>
     */
    String getDescription();

    /**
     * <code>string description = 2;</code>
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();

    /**
     * <code>int32 page_number = 3;</code>
     */
    int getPageNumber();

    /**
     * <code>int32 total_number = 4;</code>
     */
    int getTotalNumber();

    /**
     * <code>int32 result_per_page = 5;</code>
     */
    int getResultPerPage();

    /**
     * <code>.rpc.UserCustomerTransReply user_customer_trans = 6;</code>
     */
    boolean hasUserCustomerTrans();

    /**
     * <code>.rpc.UserCustomerTransReply user_customer_trans = 6;</code>
     */
    UserCustomerTransReply getUserCustomerTrans();

    /**
     * <code>.rpc.UserCustomerTransReply user_customer_trans = 6;</code>
     */
    UserCustomerTransReplyOrBuilder getUserCustomerTransOrBuilder();

    /**
     * <code>.rpc.UserLoginReply user_login = 7;</code>
     */
    boolean hasUserLogin();

    /**
     * <code>.rpc.UserLoginReply user_login = 7;</code>
     */
    UserLoginReply getUserLogin();

    /**
     * <code>.rpc.UserLoginReply user_login = 7;</code>
     */
    UserLoginReplyOrBuilder getUserLoginOrBuilder();

    /**
     * <code>.rpc.UserCustomerLogsReply user_customer_logs = 8;</code>
     */
    boolean hasUserCustomerLogs();

    /**
     * <code>.rpc.UserCustomerLogsReply user_customer_logs = 8;</code>
     */
    UserCustomerLogsReply getUserCustomerLogs();

    /**
     * <code>.rpc.UserCustomerLogsReply user_customer_logs = 8;</code>
     */
    UserCustomerLogsReplyOrBuilder getUserCustomerLogsOrBuilder();
}