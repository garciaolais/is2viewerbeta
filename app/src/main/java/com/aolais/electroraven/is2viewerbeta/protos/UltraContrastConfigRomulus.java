// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ULTRACONTRAST_CONFIG_ROMULUS.proto

package com.aolais.electroraven.is2viewerbeta.protos;

public final class UltraContrastConfigRomulus {
  private UltraContrastConfigRomulus() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ULTRACONTRAST_CONFIG_ROMULUSOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ULTRACONTRAST_CONFIG_ROMULUS)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
     */
    boolean hasUltraContrastLogLinMixTempMaxMin();
    /**
     * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
     */
    int getUltraContrastLogLinMixTempMaxMin();

    /**
     * <code>required int32 ultraContrastLogLinMix = 2;</code>
     */
    boolean hasUltraContrastLogLinMix();
    /**
     * <code>required int32 ultraContrastLogLinMix = 2;</code>
     */
    int getUltraContrastLogLinMix();

    /**
     * <code>required int32 ultraContrastParamA = 3;</code>
     */
    boolean hasUltraContrastParamA();
    /**
     * <code>required int32 ultraContrastParamA = 3;</code>
     */
    int getUltraContrastParamA();

    /**
     * <code>required int32 ultraContrastParamB = 4;</code>
     */
    boolean hasUltraContrastParamB();
    /**
     * <code>required int32 ultraContrastParamB = 4;</code>
     */
    int getUltraContrastParamB();

    /**
     * <code>required int32 ultraContrastSpare1 = 5;</code>
     */
    boolean hasUltraContrastSpare1();
    /**
     * <code>required int32 ultraContrastSpare1 = 5;</code>
     */
    int getUltraContrastSpare1();

    /**
     * <code>required int32 ultraContrastSpare2 = 6;</code>
     */
    boolean hasUltraContrastSpare2();
    /**
     * <code>required int32 ultraContrastSpare2 = 6;</code>
     */
    int getUltraContrastSpare2();
  }
  /**
   * Protobuf type {@code ULTRACONTRAST_CONFIG_ROMULUS}
   */
  public static final class ULTRACONTRAST_CONFIG_ROMULUS extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ULTRACONTRAST_CONFIG_ROMULUS)
      ULTRACONTRAST_CONFIG_ROMULUSOrBuilder {
    // Use ULTRACONTRAST_CONFIG_ROMULUS.newBuilder() to construct.
    private ULTRACONTRAST_CONFIG_ROMULUS(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ULTRACONTRAST_CONFIG_ROMULUS(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ULTRACONTRAST_CONFIG_ROMULUS defaultInstance;
    public static ULTRACONTRAST_CONFIG_ROMULUS getDefaultInstance() {
      return defaultInstance;
    }

    public ULTRACONTRAST_CONFIG_ROMULUS getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ULTRACONTRAST_CONFIG_ROMULUS(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              ultraContrastLogLinMixTempMaxMin_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              ultraContrastLogLinMix_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              ultraContrastParamA_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              ultraContrastParamB_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              ultraContrastSpare1_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              ultraContrastSpare2_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.internal_static_ULTRACONTRAST_CONFIG_ROMULUS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.class, com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.Builder.class);
    }

    public static com.google.protobuf.Parser<ULTRACONTRAST_CONFIG_ROMULUS> PARSER =
        new com.google.protobuf.AbstractParser<ULTRACONTRAST_CONFIG_ROMULUS>() {
      public ULTRACONTRAST_CONFIG_ROMULUS parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ULTRACONTRAST_CONFIG_ROMULUS(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ULTRACONTRAST_CONFIG_ROMULUS> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ULTRACONTRASTLOGLINMIXTEMPMAXMIN_FIELD_NUMBER = 1;
    private int ultraContrastLogLinMixTempMaxMin_;
    /**
     * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
     */
    public boolean hasUltraContrastLogLinMixTempMaxMin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
     */
    public int getUltraContrastLogLinMixTempMaxMin() {
      return ultraContrastLogLinMixTempMaxMin_;
    }

    public static final int ULTRACONTRASTLOGLINMIX_FIELD_NUMBER = 2;
    private int ultraContrastLogLinMix_;
    /**
     * <code>required int32 ultraContrastLogLinMix = 2;</code>
     */
    public boolean hasUltraContrastLogLinMix() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 ultraContrastLogLinMix = 2;</code>
     */
    public int getUltraContrastLogLinMix() {
      return ultraContrastLogLinMix_;
    }

    public static final int ULTRACONTRASTPARAMA_FIELD_NUMBER = 3;
    private int ultraContrastParamA_;
    /**
     * <code>required int32 ultraContrastParamA = 3;</code>
     */
    public boolean hasUltraContrastParamA() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 ultraContrastParamA = 3;</code>
     */
    public int getUltraContrastParamA() {
      return ultraContrastParamA_;
    }

    public static final int ULTRACONTRASTPARAMB_FIELD_NUMBER = 4;
    private int ultraContrastParamB_;
    /**
     * <code>required int32 ultraContrastParamB = 4;</code>
     */
    public boolean hasUltraContrastParamB() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 ultraContrastParamB = 4;</code>
     */
    public int getUltraContrastParamB() {
      return ultraContrastParamB_;
    }

    public static final int ULTRACONTRASTSPARE1_FIELD_NUMBER = 5;
    private int ultraContrastSpare1_;
    /**
     * <code>required int32 ultraContrastSpare1 = 5;</code>
     */
    public boolean hasUltraContrastSpare1() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 ultraContrastSpare1 = 5;</code>
     */
    public int getUltraContrastSpare1() {
      return ultraContrastSpare1_;
    }

    public static final int ULTRACONTRASTSPARE2_FIELD_NUMBER = 6;
    private int ultraContrastSpare2_;
    /**
     * <code>required int32 ultraContrastSpare2 = 6;</code>
     */
    public boolean hasUltraContrastSpare2() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 ultraContrastSpare2 = 6;</code>
     */
    public int getUltraContrastSpare2() {
      return ultraContrastSpare2_;
    }

    private void initFields() {
      ultraContrastLogLinMixTempMaxMin_ = 0;
      ultraContrastLogLinMix_ = 0;
      ultraContrastParamA_ = 0;
      ultraContrastParamB_ = 0;
      ultraContrastSpare1_ = 0;
      ultraContrastSpare2_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUltraContrastLogLinMixTempMaxMin()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUltraContrastLogLinMix()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUltraContrastParamA()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUltraContrastParamB()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUltraContrastSpare1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUltraContrastSpare2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, ultraContrastLogLinMixTempMaxMin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, ultraContrastLogLinMix_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, ultraContrastParamA_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, ultraContrastParamB_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, ultraContrastSpare1_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, ultraContrastSpare2_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, ultraContrastLogLinMixTempMaxMin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ultraContrastLogLinMix_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, ultraContrastParamA_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, ultraContrastParamB_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, ultraContrastSpare1_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, ultraContrastSpare2_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ULTRACONTRAST_CONFIG_ROMULUS}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ULTRACONTRAST_CONFIG_ROMULUS)
        com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUSOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.internal_static_ULTRACONTRAST_CONFIG_ROMULUS_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.class, com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.Builder.class);
      }

      // Construct using com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        ultraContrastLogLinMixTempMaxMin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        ultraContrastLogLinMix_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        ultraContrastParamA_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        ultraContrastParamB_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        ultraContrastSpare1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        ultraContrastSpare2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS getDefaultInstanceForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.getDefaultInstance();
      }

      public com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS build() {
        com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS buildPartial() {
        com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS result = new com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ultraContrastLogLinMixTempMaxMin_ = ultraContrastLogLinMixTempMaxMin_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ultraContrastLogLinMix_ = ultraContrastLogLinMix_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ultraContrastParamA_ = ultraContrastParamA_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ultraContrastParamB_ = ultraContrastParamB_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.ultraContrastSpare1_ = ultraContrastSpare1_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.ultraContrastSpare2_ = ultraContrastSpare2_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS) {
          return mergeFrom((com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS other) {
        if (other == com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS.getDefaultInstance()) return this;
        if (other.hasUltraContrastLogLinMixTempMaxMin()) {
          setUltraContrastLogLinMixTempMaxMin(other.getUltraContrastLogLinMixTempMaxMin());
        }
        if (other.hasUltraContrastLogLinMix()) {
          setUltraContrastLogLinMix(other.getUltraContrastLogLinMix());
        }
        if (other.hasUltraContrastParamA()) {
          setUltraContrastParamA(other.getUltraContrastParamA());
        }
        if (other.hasUltraContrastParamB()) {
          setUltraContrastParamB(other.getUltraContrastParamB());
        }
        if (other.hasUltraContrastSpare1()) {
          setUltraContrastSpare1(other.getUltraContrastSpare1());
        }
        if (other.hasUltraContrastSpare2()) {
          setUltraContrastSpare2(other.getUltraContrastSpare2());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUltraContrastLogLinMixTempMaxMin()) {
          
          return false;
        }
        if (!hasUltraContrastLogLinMix()) {
          
          return false;
        }
        if (!hasUltraContrastParamA()) {
          
          return false;
        }
        if (!hasUltraContrastParamB()) {
          
          return false;
        }
        if (!hasUltraContrastSpare1()) {
          
          return false;
        }
        if (!hasUltraContrastSpare2()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.aolais.electroraven.is2viewerbeta.protos.UltraContrastConfigRomulus.ULTRACONTRAST_CONFIG_ROMULUS) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int ultraContrastLogLinMixTempMaxMin_ ;
      /**
       * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
       */
      public boolean hasUltraContrastLogLinMixTempMaxMin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
       */
      public int getUltraContrastLogLinMixTempMaxMin() {
        return ultraContrastLogLinMixTempMaxMin_;
      }
      /**
       * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
       */
      public Builder setUltraContrastLogLinMixTempMaxMin(int value) {
        bitField0_ |= 0x00000001;
        ultraContrastLogLinMixTempMaxMin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastLogLinMixTempMaxMin = 1;</code>
       */
      public Builder clearUltraContrastLogLinMixTempMaxMin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ultraContrastLogLinMixTempMaxMin_ = 0;
        onChanged();
        return this;
      }

      private int ultraContrastLogLinMix_ ;
      /**
       * <code>required int32 ultraContrastLogLinMix = 2;</code>
       */
      public boolean hasUltraContrastLogLinMix() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 ultraContrastLogLinMix = 2;</code>
       */
      public int getUltraContrastLogLinMix() {
        return ultraContrastLogLinMix_;
      }
      /**
       * <code>required int32 ultraContrastLogLinMix = 2;</code>
       */
      public Builder setUltraContrastLogLinMix(int value) {
        bitField0_ |= 0x00000002;
        ultraContrastLogLinMix_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastLogLinMix = 2;</code>
       */
      public Builder clearUltraContrastLogLinMix() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ultraContrastLogLinMix_ = 0;
        onChanged();
        return this;
      }

      private int ultraContrastParamA_ ;
      /**
       * <code>required int32 ultraContrastParamA = 3;</code>
       */
      public boolean hasUltraContrastParamA() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 ultraContrastParamA = 3;</code>
       */
      public int getUltraContrastParamA() {
        return ultraContrastParamA_;
      }
      /**
       * <code>required int32 ultraContrastParamA = 3;</code>
       */
      public Builder setUltraContrastParamA(int value) {
        bitField0_ |= 0x00000004;
        ultraContrastParamA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastParamA = 3;</code>
       */
      public Builder clearUltraContrastParamA() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ultraContrastParamA_ = 0;
        onChanged();
        return this;
      }

      private int ultraContrastParamB_ ;
      /**
       * <code>required int32 ultraContrastParamB = 4;</code>
       */
      public boolean hasUltraContrastParamB() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 ultraContrastParamB = 4;</code>
       */
      public int getUltraContrastParamB() {
        return ultraContrastParamB_;
      }
      /**
       * <code>required int32 ultraContrastParamB = 4;</code>
       */
      public Builder setUltraContrastParamB(int value) {
        bitField0_ |= 0x00000008;
        ultraContrastParamB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastParamB = 4;</code>
       */
      public Builder clearUltraContrastParamB() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ultraContrastParamB_ = 0;
        onChanged();
        return this;
      }

      private int ultraContrastSpare1_ ;
      /**
       * <code>required int32 ultraContrastSpare1 = 5;</code>
       */
      public boolean hasUltraContrastSpare1() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 ultraContrastSpare1 = 5;</code>
       */
      public int getUltraContrastSpare1() {
        return ultraContrastSpare1_;
      }
      /**
       * <code>required int32 ultraContrastSpare1 = 5;</code>
       */
      public Builder setUltraContrastSpare1(int value) {
        bitField0_ |= 0x00000010;
        ultraContrastSpare1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastSpare1 = 5;</code>
       */
      public Builder clearUltraContrastSpare1() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ultraContrastSpare1_ = 0;
        onChanged();
        return this;
      }

      private int ultraContrastSpare2_ ;
      /**
       * <code>required int32 ultraContrastSpare2 = 6;</code>
       */
      public boolean hasUltraContrastSpare2() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 ultraContrastSpare2 = 6;</code>
       */
      public int getUltraContrastSpare2() {
        return ultraContrastSpare2_;
      }
      /**
       * <code>required int32 ultraContrastSpare2 = 6;</code>
       */
      public Builder setUltraContrastSpare2(int value) {
        bitField0_ |= 0x00000020;
        ultraContrastSpare2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ultraContrastSpare2 = 6;</code>
       */
      public Builder clearUltraContrastSpare2() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ultraContrastSpare2_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ULTRACONTRAST_CONFIG_ROMULUS)
    }

    static {
      defaultInstance = new ULTRACONTRAST_CONFIG_ROMULUS(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ULTRACONTRAST_CONFIG_ROMULUS)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ULTRACONTRAST_CONFIG_ROMULUS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ULTRACONTRAST_CONFIG_ROMULUS.proto\"\334\001\n" +
      "\034ULTRACONTRAST_CONFIG_ROMULUS\022(\n ultraCo" +
      "ntrastLogLinMixTempMaxMin\030\001 \002(\005\022\036\n\026ultra" +
      "ContrastLogLinMix\030\002 \002(\005\022\033\n\023ultraContrast" +
      "ParamA\030\003 \002(\005\022\033\n\023ultraContrastParamB\030\004 \002(" +
      "\005\022\033\n\023ultraContrastSpare1\030\005 \002(\005\022\033\n\023ultraC" +
      "ontrastSpare2\030\006 \002(\005BJ\n,com.aolais.electr" +
      "oraven.is2viewerbeta.protosB\032UltraContra" +
      "stConfigRomulus"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ULTRACONTRAST_CONFIG_ROMULUS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ULTRACONTRAST_CONFIG_ROMULUS_descriptor,
        new java.lang.String[] { "UltraContrastLogLinMixTempMaxMin", "UltraContrastLogLinMix", "UltraContrastParamA", "UltraContrastParamB", "UltraContrastSpare1", "UltraContrastSpare2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
