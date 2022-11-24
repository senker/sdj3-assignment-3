// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Slaughterhouse.proto

package via.sdj3.slaughterhouseapi.protobuf;

public interface AnimalPartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnimalPart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double partWeight = 1;</code>
   * @return The partWeight.
   */
  double getPartWeight();

  /**
   * <code>int32 partNumber = 2;</code>
   * @return The partNumber.
   */
  int getPartNumber();

  /**
   * <code>.Animal animalRef = 3;</code>
   * @return Whether the animalRef field is set.
   */
  boolean hasAnimalRef();
  /**
   * <code>.Animal animalRef = 3;</code>
   * @return The animalRef.
   */
  via.sdj3.slaughterhouseapi.protobuf.Animal getAnimalRef();
  /**
   * <code>.Animal animalRef = 3;</code>
   */
  via.sdj3.slaughterhouseapi.protobuf.AnimalOrBuilder getAnimalRefOrBuilder();

  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
