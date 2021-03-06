// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/more.proto

package unknown;

public final class More {
  private More() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SiteOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string name = 1;
    boolean hasName();
    String getName();
    
    // optional string url = 2;
    boolean hasUrl();
    String getUrl();
  }
  public static final class Site extends
      com.google.protobuf.GeneratedMessage
      implements SiteOrBuilder {
    // Use Site.newBuilder() to construct.
    private Site(Builder builder) {
      super(builder);
    }
    private Site(boolean noInit) {}
    
    private static final Site defaultInstance;
    public static Site getDefaultInstance() {
      return defaultInstance;
    }
    
    public Site getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return unknown.More.internal_static_unknown_Site_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return unknown.More.internal_static_unknown_Site_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string url = 2;
    public static final int URL_FIELD_NUMBER = 2;
    private java.lang.Object url_;
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          url_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      name_ = "";
      url_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUrlBytes());
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUrlBytes());
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
    
    public static unknown.More.Site parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static unknown.More.Site parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Site parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static unknown.More.Site parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Site parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static unknown.More.Site parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Site parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static unknown.More.Site parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static unknown.More.Site parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static unknown.More.Site parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(unknown.More.Site prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements unknown.More.SiteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return unknown.More.internal_static_unknown_Site_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return unknown.More.internal_static_unknown_Site_fieldAccessorTable;
      }
      
      // Construct using unknown.More.Site.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return unknown.More.Site.getDescriptor();
      }
      
      public unknown.More.Site getDefaultInstanceForType() {
        return unknown.More.Site.getDefaultInstance();
      }
      
      public unknown.More.Site build() {
        unknown.More.Site result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private unknown.More.Site buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        unknown.More.Site result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public unknown.More.Site buildPartial() {
        unknown.More.Site result = new unknown.More.Site(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.url_ = url_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof unknown.More.Site) {
          return mergeFrom((unknown.More.Site)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(unknown.More.Site other) {
        if (other == unknown.More.Site.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasUrl()) {
          setUrl(other.getUrl());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              url_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // optional string url = 2;
      private java.lang.Object url_ = "";
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUrl(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        url_ = value;
        onChanged();
        return this;
      }
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000002);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      void setUrl(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        url_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:unknown.Site)
    }
    
    static {
      defaultInstance = new Site(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:unknown.Site)
  }
  
  public interface MoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string name = 1;
    boolean hasName();
    String getName();
    
    // optional int64 id = 2;
    boolean hasId();
    long getId();
    
    // optional .unknown.Site site = 3;
    boolean hasSite();
    unknown.More.Site getSite();
    unknown.More.SiteOrBuilder getSiteOrBuilder();
  }
  public static final class Mo extends
      com.google.protobuf.GeneratedMessage
      implements MoOrBuilder {
    // Use Mo.newBuilder() to construct.
    private Mo(Builder builder) {
      super(builder);
    }
    private Mo(boolean noInit) {}
    
    private static final Mo defaultInstance;
    public static Mo getDefaultInstance() {
      return defaultInstance;
    }
    
    public Mo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return unknown.More.internal_static_unknown_Mo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return unknown.More.internal_static_unknown_Mo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 id = 2;
    public static final int ID_FIELD_NUMBER = 2;
    private long id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getId() {
      return id_;
    }
    
    // optional .unknown.Site site = 3;
    public static final int SITE_FIELD_NUMBER = 3;
    private unknown.More.Site site_;
    public boolean hasSite() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public unknown.More.Site getSite() {
      return site_;
    }
    public unknown.More.SiteOrBuilder getSiteOrBuilder() {
      return site_;
    }
    
    private void initFields() {
      name_ = "";
      id_ = 0L;
      site_ = unknown.More.Site.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, site_);
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, site_);
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
    
    public static unknown.More.Mo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static unknown.More.Mo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Mo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static unknown.More.Mo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Mo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static unknown.More.Mo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static unknown.More.Mo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static unknown.More.Mo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static unknown.More.Mo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static unknown.More.Mo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(unknown.More.Mo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements unknown.More.MoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return unknown.More.internal_static_unknown_Mo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return unknown.More.internal_static_unknown_Mo_fieldAccessorTable;
      }
      
      // Construct using unknown.More.Mo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSiteFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (siteBuilder_ == null) {
          site_ = unknown.More.Site.getDefaultInstance();
        } else {
          siteBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return unknown.More.Mo.getDescriptor();
      }
      
      public unknown.More.Mo getDefaultInstanceForType() {
        return unknown.More.Mo.getDefaultInstance();
      }
      
      public unknown.More.Mo build() {
        unknown.More.Mo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private unknown.More.Mo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        unknown.More.Mo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public unknown.More.Mo buildPartial() {
        unknown.More.Mo result = new unknown.More.Mo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (siteBuilder_ == null) {
          result.site_ = site_;
        } else {
          result.site_ = siteBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof unknown.More.Mo) {
          return mergeFrom((unknown.More.Mo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(unknown.More.Mo other) {
        if (other == unknown.More.Mo.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasSite()) {
          mergeSite(other.getSite());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt64();
              break;
            }
            case 26: {
              unknown.More.Site.Builder subBuilder = unknown.More.Site.newBuilder();
              if (hasSite()) {
                subBuilder.mergeFrom(getSite());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setSite(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // optional int64 id = 2;
      private long id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getId() {
        return id_;
      }
      public Builder setId(long value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0L;
        onChanged();
        return this;
      }
      
      // optional .unknown.Site site = 3;
      private unknown.More.Site site_ = unknown.More.Site.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          unknown.More.Site, unknown.More.Site.Builder, unknown.More.SiteOrBuilder> siteBuilder_;
      public boolean hasSite() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public unknown.More.Site getSite() {
        if (siteBuilder_ == null) {
          return site_;
        } else {
          return siteBuilder_.getMessage();
        }
      }
      public Builder setSite(unknown.More.Site value) {
        if (siteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          site_ = value;
          onChanged();
        } else {
          siteBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setSite(
          unknown.More.Site.Builder builderForValue) {
        if (siteBuilder_ == null) {
          site_ = builderForValue.build();
          onChanged();
        } else {
          siteBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeSite(unknown.More.Site value) {
        if (siteBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              site_ != unknown.More.Site.getDefaultInstance()) {
            site_ =
              unknown.More.Site.newBuilder(site_).mergeFrom(value).buildPartial();
          } else {
            site_ = value;
          }
          onChanged();
        } else {
          siteBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearSite() {
        if (siteBuilder_ == null) {
          site_ = unknown.More.Site.getDefaultInstance();
          onChanged();
        } else {
          siteBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public unknown.More.Site.Builder getSiteBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSiteFieldBuilder().getBuilder();
      }
      public unknown.More.SiteOrBuilder getSiteOrBuilder() {
        if (siteBuilder_ != null) {
          return siteBuilder_.getMessageOrBuilder();
        } else {
          return site_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          unknown.More.Site, unknown.More.Site.Builder, unknown.More.SiteOrBuilder> 
          getSiteFieldBuilder() {
        if (siteBuilder_ == null) {
          siteBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              unknown.More.Site, unknown.More.Site.Builder, unknown.More.SiteOrBuilder>(
                  site_,
                  getParentForChildren(),
                  isClean());
          site_ = null;
        }
        return siteBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:unknown.Mo)
    }
    
    static {
      defaultInstance = new Mo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:unknown.Mo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_unknown_Site_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_unknown_Site_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_unknown_Mo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_unknown_Mo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020proto/more.proto\022\007unknown\"!\n\004Site\022\014\n\004n" +
      "ame\030\001 \001(\t\022\013\n\003url\030\002 \001(\t\";\n\002Mo\022\014\n\004name\030\001 \001" +
      "(\t\022\n\n\002id\030\002 \001(\003\022\033\n\004site\030\003 \001(\0132\r.unknown.S" +
      "ite"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_unknown_Site_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_unknown_Site_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_unknown_Site_descriptor,
              new java.lang.String[] { "Name", "Url", },
              unknown.More.Site.class,
              unknown.More.Site.Builder.class);
          internal_static_unknown_Mo_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_unknown_Mo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_unknown_Mo_descriptor,
              new java.lang.String[] { "Name", "Id", "Site", },
              unknown.More.Mo.class,
              unknown.More.Mo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
