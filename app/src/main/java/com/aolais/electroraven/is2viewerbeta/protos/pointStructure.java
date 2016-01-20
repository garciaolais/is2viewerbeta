// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PointStructure.proto

package com.aolais.electroraven.is2viewerbeta.protos;

public final class pointStructure {
  private pointStructure() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PointStructureOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PointStructure)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 1;</code>
     */
    int getX();

    /**
     * <code>required int32 y = 2;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 2;</code>
     */
    int getY();
  }
  /**
   * Protobuf type {@code PointStructure}
   */
  public static final class PointStructure extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PointStructure)
      PointStructureOrBuilder {
    // Use PointStructure.newBuilder() to construct.
    private PointStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PointStructure(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PointStructure defaultInstance;
    public static PointStructure getDefaultInstance() {
      return defaultInstance;
    }

    public PointStructure getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PointStructure(
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
              x_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              y_ = input.readInt32();
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
      return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.internal_static_PointStructure_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.internal_static_PointStructure_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.class, com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.Builder.class);
    }

    public static com.google.protobuf.Parser<PointStructure> PARSER =
        new com.google.protobuf.AbstractParser<PointStructure>() {
      public PointStructure parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PointStructure(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PointStructure> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int X_FIELD_NUMBER = 1;
    private int x_;
    /**
     * <code>required int32 x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 x = 1;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    /**
     * <code>required int32 y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 y = 2;</code>
     */
    public int getY() {
      return y_;
    }

    private void initFields() {
      x_ = 0;
      y_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
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
        output.writeInt32(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, y_);
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
          .computeInt32Size(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
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

    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure prototype) {
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
     * Protobuf type {@code PointStructure}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PointStructure)
        com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructureOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.internal_static_PointStructure_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.internal_static_PointStructure_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.class, com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.Builder.class);
      }

      // Construct using com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.newBuilder()
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
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.internal_static_PointStructure_descriptor;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure getDefaultInstanceForType() {
        return com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.getDefaultInstance();
      }

      public com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure build() {
        com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure buildPartial() {
        com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure result = new com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure) {
          return mergeFrom((com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure other) {
        if (other == com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.aolais.electroraven.is2viewerbeta.protos.pointStructure.PointStructure) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int x_ ;
      /**
       * <code>required int32 x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>required int32 y = 2;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PointStructure)
    }

    static {
      defaultInstance = new PointStructure(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PointStructure)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PointStructure_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PointStructure_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024PointStructure.proto\"&\n\016PointStructure" +
      "\022\t\n\001x\030\001 \002(\005\022\t\n\001y\030\002 \002(\005B>\n,com.aolais.ele" +
      "ctroraven.is2viewerbeta.protosB\016pointStr" +
      "ucture"
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
    internal_static_PointStructure_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PointStructure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PointStructure_descriptor,
        new java.lang.String[] { "X", "Y", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
