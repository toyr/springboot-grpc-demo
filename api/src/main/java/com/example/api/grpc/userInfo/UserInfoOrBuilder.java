// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userInfo.proto

package com.example.api.grpc.userInfo;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string sex = 3;</code>
   * @return The sex.
   */
  java.lang.String getSex();
  /**
   * <code>string sex = 3;</code>
   * @return The bytes for sex.
   */
  com.google.protobuf.ByteString
      getSexBytes();

  /**
   * <code>string addr = 4;</code>
   * @return The addr.
   */
  java.lang.String getAddr();
  /**
   * <code>string addr = 4;</code>
   * @return The bytes for addr.
   */
  com.google.protobuf.ByteString
      getAddrBytes();
}
