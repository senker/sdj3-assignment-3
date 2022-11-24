// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Slaughterhouse.proto

package via.sdj3.slaughterhouseapi.protobuf;

/**
 * Protobuf type {@code Trays}
 */
public final class Trays extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Trays)
    TraysOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Trays.newBuilder() to construct.
  private Trays(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Trays() {
    partType_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Trays();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Trays(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              partType_ = new java.util.ArrayList<via.sdj3.slaughterhouseapi.protobuf.AnimalPart>();
              mutable_bitField0_ |= 0x00000001;
            }
            partType_.add(
                input.readMessage(via.sdj3.slaughterhouseapi.protobuf.AnimalPart.parser(), extensionRegistry));
            break;
          }
          case 17: {

            maximumWeight_ = input.readDouble();
            break;
          }
          case 24: {

            trayNr_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        partType_ = java.util.Collections.unmodifiableList(partType_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseOuterClass.internal_static_Trays_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseOuterClass.internal_static_Trays_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhouseapi.protobuf.Trays.class, via.sdj3.slaughterhouseapi.protobuf.Trays.Builder.class);
  }

  public static final int PARTTYPE_FIELD_NUMBER = 1;
  private java.util.List<via.sdj3.slaughterhouseapi.protobuf.AnimalPart> partType_;
  /**
   * <code>repeated .AnimalPart partType = 1;</code>
   */
  @java.lang.Override
  public java.util.List<via.sdj3.slaughterhouseapi.protobuf.AnimalPart> getPartTypeList() {
    return partType_;
  }
  /**
   * <code>repeated .AnimalPart partType = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder> 
      getPartTypeOrBuilderList() {
    return partType_;
  }
  /**
   * <code>repeated .AnimalPart partType = 1;</code>
   */
  @java.lang.Override
  public int getPartTypeCount() {
    return partType_.size();
  }
  /**
   * <code>repeated .AnimalPart partType = 1;</code>
   */
  @java.lang.Override
  public via.sdj3.slaughterhouseapi.protobuf.AnimalPart getPartType(int index) {
    return partType_.get(index);
  }
  /**
   * <code>repeated .AnimalPart partType = 1;</code>
   */
  @java.lang.Override
  public via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder getPartTypeOrBuilder(
      int index) {
    return partType_.get(index);
  }

  public static final int MAXIMUMWEIGHT_FIELD_NUMBER = 2;
  private double maximumWeight_;
  /**
   * <code>double maximumWeight = 2;</code>
   * @return The maximumWeight.
   */
  @java.lang.Override
  public double getMaximumWeight() {
    return maximumWeight_;
  }

  public static final int TRAYNR_FIELD_NUMBER = 3;
  private int trayNr_;
  /**
   * <code>int32 trayNr = 3;</code>
   * @return The trayNr.
   */
  @java.lang.Override
  public int getTrayNr() {
    return trayNr_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < partType_.size(); i++) {
      output.writeMessage(1, partType_.get(i));
    }
    if (java.lang.Double.doubleToRawLongBits(maximumWeight_) != 0) {
      output.writeDouble(2, maximumWeight_);
    }
    if (trayNr_ != 0) {
      output.writeInt32(3, trayNr_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < partType_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, partType_.get(i));
    }
    if (java.lang.Double.doubleToRawLongBits(maximumWeight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, maximumWeight_);
    }
    if (trayNr_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, trayNr_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.slaughterhouseapi.protobuf.Trays)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhouseapi.protobuf.Trays other = (via.sdj3.slaughterhouseapi.protobuf.Trays) obj;

    if (!getPartTypeList()
        .equals(other.getPartTypeList())) return false;
    if (java.lang.Double.doubleToLongBits(getMaximumWeight())
        != java.lang.Double.doubleToLongBits(
            other.getMaximumWeight())) return false;
    if (getTrayNr()
        != other.getTrayNr()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPartTypeCount() > 0) {
      hash = (37 * hash) + PARTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPartTypeList().hashCode();
    }
    hash = (37 * hash) + MAXIMUMWEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaximumWeight()));
    hash = (37 * hash) + TRAYNR_FIELD_NUMBER;
    hash = (53 * hash) + getTrayNr();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouseapi.protobuf.Trays parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sdj3.slaughterhouseapi.protobuf.Trays prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Trays}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Trays)
      via.sdj3.slaughterhouseapi.protobuf.TraysOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseOuterClass.internal_static_Trays_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseOuterClass.internal_static_Trays_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhouseapi.protobuf.Trays.class, via.sdj3.slaughterhouseapi.protobuf.Trays.Builder.class);
    }

    // Construct using via.sdj3.slaughterhouseapi.protobuf.Trays.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPartTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (partTypeBuilder_ == null) {
        partType_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        partTypeBuilder_.clear();
      }
      maximumWeight_ = 0D;

      trayNr_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhouseapi.protobuf.SlaughterhouseOuterClass.internal_static_Trays_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouseapi.protobuf.Trays getDefaultInstanceForType() {
      return via.sdj3.slaughterhouseapi.protobuf.Trays.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhouseapi.protobuf.Trays build() {
      via.sdj3.slaughterhouseapi.protobuf.Trays result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouseapi.protobuf.Trays buildPartial() {
      via.sdj3.slaughterhouseapi.protobuf.Trays result = new via.sdj3.slaughterhouseapi.protobuf.Trays(this);
      int from_bitField0_ = bitField0_;
      if (partTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          partType_ = java.util.Collections.unmodifiableList(partType_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partType_ = partType_;
      } else {
        result.partType_ = partTypeBuilder_.build();
      }
      result.maximumWeight_ = maximumWeight_;
      result.trayNr_ = trayNr_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.slaughterhouseapi.protobuf.Trays) {
        return mergeFrom((via.sdj3.slaughterhouseapi.protobuf.Trays)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhouseapi.protobuf.Trays other) {
      if (other == via.sdj3.slaughterhouseapi.protobuf.Trays.getDefaultInstance()) return this;
      if (partTypeBuilder_ == null) {
        if (!other.partType_.isEmpty()) {
          if (partType_.isEmpty()) {
            partType_ = other.partType_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartTypeIsMutable();
            partType_.addAll(other.partType_);
          }
          onChanged();
        }
      } else {
        if (!other.partType_.isEmpty()) {
          if (partTypeBuilder_.isEmpty()) {
            partTypeBuilder_.dispose();
            partTypeBuilder_ = null;
            partType_ = other.partType_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partTypeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartTypeFieldBuilder() : null;
          } else {
            partTypeBuilder_.addAllMessages(other.partType_);
          }
        }
      }
      if (other.getMaximumWeight() != 0D) {
        setMaximumWeight(other.getMaximumWeight());
      }
      if (other.getTrayNr() != 0) {
        setTrayNr(other.getTrayNr());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.slaughterhouseapi.protobuf.Trays parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhouseapi.protobuf.Trays) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<via.sdj3.slaughterhouseapi.protobuf.AnimalPart> partType_ =
      java.util.Collections.emptyList();
    private void ensurePartTypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partType_ = new java.util.ArrayList<via.sdj3.slaughterhouseapi.protobuf.AnimalPart>(partType_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sdj3.slaughterhouseapi.protobuf.AnimalPart, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder, via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder> partTypeBuilder_;

    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public java.util.List<via.sdj3.slaughterhouseapi.protobuf.AnimalPart> getPartTypeList() {
      if (partTypeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partType_);
      } else {
        return partTypeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public int getPartTypeCount() {
      if (partTypeBuilder_ == null) {
        return partType_.size();
      } else {
        return partTypeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public via.sdj3.slaughterhouseapi.protobuf.AnimalPart getPartType(int index) {
      if (partTypeBuilder_ == null) {
        return partType_.get(index);
      } else {
        return partTypeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder setPartType(
        int index, via.sdj3.slaughterhouseapi.protobuf.AnimalPart value) {
      if (partTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartTypeIsMutable();
        partType_.set(index, value);
        onChanged();
      } else {
        partTypeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder setPartType(
        int index, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder builderForValue) {
      if (partTypeBuilder_ == null) {
        ensurePartTypeIsMutable();
        partType_.set(index, builderForValue.build());
        onChanged();
      } else {
        partTypeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder addPartType(via.sdj3.slaughterhouseapi.protobuf.AnimalPart value) {
      if (partTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartTypeIsMutable();
        partType_.add(value);
        onChanged();
      } else {
        partTypeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder addPartType(
        int index, via.sdj3.slaughterhouseapi.protobuf.AnimalPart value) {
      if (partTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartTypeIsMutable();
        partType_.add(index, value);
        onChanged();
      } else {
        partTypeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder addPartType(
        via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder builderForValue) {
      if (partTypeBuilder_ == null) {
        ensurePartTypeIsMutable();
        partType_.add(builderForValue.build());
        onChanged();
      } else {
        partTypeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder addPartType(
        int index, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder builderForValue) {
      if (partTypeBuilder_ == null) {
        ensurePartTypeIsMutable();
        partType_.add(index, builderForValue.build());
        onChanged();
      } else {
        partTypeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder addAllPartType(
        java.lang.Iterable<? extends via.sdj3.slaughterhouseapi.protobuf.AnimalPart> values) {
      if (partTypeBuilder_ == null) {
        ensurePartTypeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, partType_);
        onChanged();
      } else {
        partTypeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder clearPartType() {
      if (partTypeBuilder_ == null) {
        partType_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partTypeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public Builder removePartType(int index) {
      if (partTypeBuilder_ == null) {
        ensurePartTypeIsMutable();
        partType_.remove(index);
        onChanged();
      } else {
        partTypeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder getPartTypeBuilder(
        int index) {
      return getPartTypeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder getPartTypeOrBuilder(
        int index) {
      if (partTypeBuilder_ == null) {
        return partType_.get(index);  } else {
        return partTypeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public java.util.List<? extends via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder> 
         getPartTypeOrBuilderList() {
      if (partTypeBuilder_ != null) {
        return partTypeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partType_);
      }
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder addPartTypeBuilder() {
      return getPartTypeFieldBuilder().addBuilder(
          via.sdj3.slaughterhouseapi.protobuf.AnimalPart.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder addPartTypeBuilder(
        int index) {
      return getPartTypeFieldBuilder().addBuilder(
          index, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalPart partType = 1;</code>
     */
    public java.util.List<via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder> 
         getPartTypeBuilderList() {
      return getPartTypeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sdj3.slaughterhouseapi.protobuf.AnimalPart, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder, via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder> 
        getPartTypeFieldBuilder() {
      if (partTypeBuilder_ == null) {
        partTypeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            via.sdj3.slaughterhouseapi.protobuf.AnimalPart, via.sdj3.slaughterhouseapi.protobuf.AnimalPart.Builder, via.sdj3.slaughterhouseapi.protobuf.AnimalPartOrBuilder>(
                partType_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        partType_ = null;
      }
      return partTypeBuilder_;
    }

    private double maximumWeight_ ;
    /**
     * <code>double maximumWeight = 2;</code>
     * @return The maximumWeight.
     */
    @java.lang.Override
    public double getMaximumWeight() {
      return maximumWeight_;
    }
    /**
     * <code>double maximumWeight = 2;</code>
     * @param value The maximumWeight to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumWeight(double value) {
      
      maximumWeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double maximumWeight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaximumWeight() {
      
      maximumWeight_ = 0D;
      onChanged();
      return this;
    }

    private int trayNr_ ;
    /**
     * <code>int32 trayNr = 3;</code>
     * @return The trayNr.
     */
    @java.lang.Override
    public int getTrayNr() {
      return trayNr_;
    }
    /**
     * <code>int32 trayNr = 3;</code>
     * @param value The trayNr to set.
     * @return This builder for chaining.
     */
    public Builder setTrayNr(int value) {
      
      trayNr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 trayNr = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrayNr() {
      
      trayNr_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Trays)
  }

  // @@protoc_insertion_point(class_scope:Trays)
  private static final via.sdj3.slaughterhouseapi.protobuf.Trays DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhouseapi.protobuf.Trays();
  }

  public static via.sdj3.slaughterhouseapi.protobuf.Trays getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Trays>
      PARSER = new com.google.protobuf.AbstractParser<Trays>() {
    @java.lang.Override
    public Trays parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Trays(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Trays> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Trays> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhouseapi.protobuf.Trays getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

