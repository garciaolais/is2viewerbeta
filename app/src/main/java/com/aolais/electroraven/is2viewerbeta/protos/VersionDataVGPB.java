// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoFiles/CameraInfo/VERSION_DATA_VGPB.proto

package com.aolais.electroraven.is2viewerbeta.protos;

public final class VersionDataVGPB {
  private VersionDataVGPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VERSION_DATA_VGPBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VERSION_DATA_VGPB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 versionMajor = 1;</code>
     */
    boolean hasVersionMajor();
    /**
     * <code>required int32 versionMajor = 1;</code>
     */
    int getVersionMajor();

    /**
     * <code>required int32 versionMid = 2;</code>
     */
    boolean hasVersionMid();
    /**
     * <code>required int32 versionMid = 2;</code>
     */
    int getVersionMid();

    /**
     * <code>required int32 versionMin = 3;</code>
     */
    boolean hasVersionMin();
    /**
     * <code>required int32 versionMin = 3;</code>
     */
    int getVersionMin();
  }
  /**
   * Protobuf type {@code VERSION_DATA_VGPB}
   */
  public static final class VERSION_DATA_VGPB extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:VERSION_DATA_VGPB)
      VERSION_DATA_VGPBOrBuilder {
    // Use VERSION_DATA_VGPB.newBuilder() to construct.
    private VERSION_DATA_VGPB(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private VERSION_DATA_VGPB(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final VERSION_DATA_VGPB defaultInstance;
    public static VERSION_DATA_VGPB getDefaultInstance() {
      return defaultInstance;
    }

    public VERSION_DATA_VGPB getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private VERSION_DATA_VGPB(
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
              versionMajor_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              versionMid_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              versionMin_ = input.readInt32();
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
      return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.internal_static_VERSION_DATA_VGPB_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.internal_static_VERSION_DATA_VGPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.class, com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.Builder.class);
    }

    public static com.google.protobuf.Parser<VERSION_DATA_VGPB> PARSER =
        new com.google.protobuf.AbstractParser<VERSION_DATA_VGPB>() {
      public VERSION_DATA_VGPB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VERSION_DATA_VGPB(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<VERSION_DATA_VGPB> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int VERSIONMAJOR_FIELD_NUMBER = 1;
    private int versionMajor_;
    /**
     * <code>required int32 versionMajor = 1;</code>
     */
    public boolean hasVersionMajor() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 versionMajor = 1;</code>
     */
    public int getVersionMajor() {
      return versionMajor_;
    }

    public static final int VERSIONMID_FIELD_NUMBER = 2;
    private int versionMid_;
    /**
     * <code>required int32 versionMid = 2;</code>
     */
    public boolean hasVersionMid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 versionMid = 2;</code>
     */
    public int getVersionMid() {
      return versionMid_;
    }

    public static final int VERSIONMIN_FIELD_NUMBER = 3;
    private int versionMin_;
    /**
     * <code>required int32 versionMin = 3;</code>
     */
    public boolean hasVersionMin() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 versionMin = 3;</code>
     */
    public int getVersionMin() {
      return versionMin_;
    }

    private void initFields() {
      versionMajor_ = 0;
      versionMid_ = 0;
      versionMin_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasVersionMajor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersionMid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersionMin()) {
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
        output.writeInt32(1, versionMajor_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, versionMid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, versionMin_);
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
          .computeInt32Size(1, versionMajor_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, versionMid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, versionMin_);
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

    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB prototype) {
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
     * Protobuf type {@code VERSION_DATA_VGPB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VERSION_DATA_VGPB)
        com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.internal_static_VERSION_DATA_VGPB_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.internal_static_VERSION_DATA_VGPB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.class, com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.Builder.class);
      }

      // Construct using com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.newBuilder()
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
        versionMajor_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        versionMid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        versionMin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.internal_static_VERSION_DATA_VGPB_descriptor;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB getDefaultInstanceForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.getDefaultInstance();
      }

      public com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB build() {
        com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB buildPartial() {
        com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB result = new com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.versionMajor_ = versionMajor_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.versionMid_ = versionMid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.versionMin_ = versionMin_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB) {
          return mergeFrom((com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB other) {
        if (other == com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB.getDefaultInstance()) return this;
        if (other.hasVersionMajor()) {
          setVersionMajor(other.getVersionMajor());
        }
        if (other.hasVersionMid()) {
          setVersionMid(other.getVersionMid());
        }
        if (other.hasVersionMin()) {
          setVersionMin(other.getVersionMin());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasVersionMajor()) {
          
          return false;
        }
        if (!hasVersionMid()) {
          
          return false;
        }
        if (!hasVersionMin()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.aolais.electroraven.is2viewerbeta.protos.VersionDataVGPB.VERSION_DATA_VGPB) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int versionMajor_ ;
      /**
       * <code>required int32 versionMajor = 1;</code>
       */
      public boolean hasVersionMajor() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 versionMajor = 1;</code>
       */
      public int getVersionMajor() {
        return versionMajor_;
      }
      /**
       * <code>required int32 versionMajor = 1;</code>
       */
      public Builder setVersionMajor(int value) {
        bitField0_ |= 0x00000001;
        versionMajor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 versionMajor = 1;</code>
       */
      public Builder clearVersionMajor() {
        bitField0_ = (bitField0_ & ~0x00000001);
        versionMajor_ = 0;
        onChanged();
        return this;
      }

      private int versionMid_ ;
      /**
       * <code>required int32 versionMid = 2;</code>
       */
      public boolean hasVersionMid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 versionMid = 2;</code>
       */
      public int getVersionMid() {
        return versionMid_;
      }
      /**
       * <code>required int32 versionMid = 2;</code>
       */
      public Builder setVersionMid(int value) {
        bitField0_ |= 0x00000002;
        versionMid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 versionMid = 2;</code>
       */
      public Builder clearVersionMid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        versionMid_ = 0;
        onChanged();
        return this;
      }

      private int versionMin_ ;
      /**
       * <code>required int32 versionMin = 3;</code>
       */
      public boolean hasVersionMin() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 versionMin = 3;</code>
       */
      public int getVersionMin() {
        return versionMin_;
      }
      /**
       * <code>required int32 versionMin = 3;</code>
       */
      public Builder setVersionMin(int value) {
        bitField0_ |= 0x00000004;
        versionMin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 versionMin = 3;</code>
       */
      public Builder clearVersionMin() {
        bitField0_ = (bitField0_ & ~0x00000004);
        versionMin_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:VERSION_DATA_VGPB)
    }

    static {
      defaultInstance = new VERSION_DATA_VGPB(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:VERSION_DATA_VGPB)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VERSION_DATA_VGPB_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_VERSION_DATA_VGPB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-ProtoFiles/CameraInfo/VERSION_DATA_VGP" +
      "B.proto\"Q\n\021VERSION_DATA_VGPB\022\024\n\014versionM" +
      "ajor\030\001 \002(\005\022\022\n\nversionMid\030\002 \002(\005\022\022\n\nversio" +
      "nMin\030\003 \002(\005B?\n,com.aolais.electroraven.is" +
      "2viewerbeta.protosB\017VersionDataVGPB"
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
    internal_static_VERSION_DATA_VGPB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VERSION_DATA_VGPB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_VERSION_DATA_VGPB_descriptor,
        new java.lang.String[] { "VersionMajor", "VersionMid", "VersionMin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
