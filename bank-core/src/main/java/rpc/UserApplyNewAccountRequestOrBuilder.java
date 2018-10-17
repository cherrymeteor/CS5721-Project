// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserApplyNewAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.UserApplyNewAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string first_name = 1;</code>
   */
  String getFirstName();
  /**
   * <code>string first_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 2;</code>
   */
  String getLastName();
  /**
   * <code>string last_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>int32 gender = 3;</code>
   */
  int getGender();

  /**
   * <code>int32 identity_id_type = 4;</code>
   */
  int getIdentityIdType();

  /**
   * <code>string identity_id = 5;</code>
   */
  String getIdentityId();
  /**
   * <code>string identity_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getIdentityIdBytes();

  /**
   * <code>int32 account_type = 6;</code>
   */
  int getAccountType();

  /**
   * <code>int32 card_type = 7;</code>
   */
  int getCardType();

  /**
   * <code>.google.protobuf.Timestamp graduate_date = 8;</code>
   */
  boolean hasGraduateDate();
  /**
   * <code>.google.protobuf.Timestamp graduate_date = 8;</code>
   */
  com.google.protobuf.Timestamp getGraduateDate();
  /**
   * <code>.google.protobuf.Timestamp graduate_date = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getGraduateDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp birth_date = 9;</code>
   */
  boolean hasBirthDate();
  /**
   * <code>.google.protobuf.Timestamp birth_date = 9;</code>
   */
  com.google.protobuf.Timestamp getBirthDate();
  /**
   * <code>.google.protobuf.Timestamp birth_date = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBirthDateOrBuilder();

  /**
   * <code>string address = 10;</code>
   */
  String getAddress();
  /**
   * <code>string address = 10;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string email = 11;</code>
   */
  String getEmail();
  /**
   * <code>string email = 11;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string phone = 12;</code>
   */
  String getPhone();
  /**
   * <code>string phone = 12;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string university_name = 13;</code>
   */
  String getUniversityName();
  /**
   * <code>string university_name = 13;</code>
   */
  com.google.protobuf.ByteString
      getUniversityNameBytes();

  /**
   * <code>string student_id = 14;</code>
   */
  String getStudentId();
  /**
   * <code>string student_id = 14;</code>
   */
  com.google.protobuf.ByteString
      getStudentIdBytes();

  /**
   * <code>int64 parent_id = 15;</code>
   */
  long getParentId();

  /**
   * <code>string parent_first_name = 16;</code>
   */
  String getParentFirstName();
  /**
   * <code>string parent_first_name = 16;</code>
   */
  com.google.protobuf.ByteString
      getParentFirstNameBytes();

  /**
   * <code>string parent_last_name = 17;</code>
   */
  String getParentLastName();
  /**
   * <code>string parent_last_name = 17;</code>
   */
  com.google.protobuf.ByteString
      getParentLastNameBytes();
}