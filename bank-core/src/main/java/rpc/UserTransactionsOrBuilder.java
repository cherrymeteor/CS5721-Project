// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserTransactionsOrBuilder extends
        // @@protoc_insertion_point(interface_extends:rpc.UserTransactions)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 user_id = 1;</code>
     */
    long getUserId();

    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    boolean hasDate();

    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    com.google.protobuf.Timestamp getDate();

    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    com.google.protobuf.TimestampOrBuilder getDateOrBuilder();

    /**
     * <code>string description = 3;</code>
     */
    String getDescription();

    /**
     * <code>string description = 3;</code>
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();

    /**
     * <code>string debit = 4;</code>
     */
    String getDebit();

    /**
     * <code>string debit = 4;</code>
     */
    com.google.protobuf.ByteString
    getDebitBytes();

    /**
     * <code>string credit = 5;</code>
     */
    String getCredit();

    /**
     * <code>string credit = 5;</code>
     */
    com.google.protobuf.ByteString
    getCreditBytes();

    /**
     * <code>double balance = 6;</code>
     */
    double getBalance();
}
