// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: book.trading.proto
// Protobuf Java Version: 4.30.2

package com.shoyeb;

public final class BookProto {
  private BookProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 2,
      /* suffix= */ "",
      BookProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shoyeb_BookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_shoyeb_BookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shoyeb_BookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_shoyeb_BookResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022book.trading.proto\022\ncom.shoyeb\" \n\013Book" +
      "Request\022\021\n\tbookTitle\030\001 \001(\t\"T\n\014BookRespon" +
      "se\022\016\n\006bookId\030\001 \001(\003\022\021\n\tbookTitle\030\002 \001(\t\022\016\n" +
      "\006author\030\003 \001(\t\022\021\n\tbookPrice\030\004 \001(\0012S\n\013Book" +
      "Service\022D\n\017findBookByTitle\022\027.com.shoyeb." +
      "BookRequest\032\030.com.shoyeb.BookResponseB\031\n" +
      "\ncom.shoyebB\tBookProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_shoyeb_BookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_shoyeb_BookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_shoyeb_BookRequest_descriptor,
        new java.lang.String[] { "BookTitle", });
    internal_static_com_shoyeb_BookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_shoyeb_BookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_shoyeb_BookResponse_descriptor,
        new java.lang.String[] { "BookId", "BookTitle", "Author", "BookPrice", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
