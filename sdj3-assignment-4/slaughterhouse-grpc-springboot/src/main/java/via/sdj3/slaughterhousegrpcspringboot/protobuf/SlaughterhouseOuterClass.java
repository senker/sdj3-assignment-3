// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Slaughterhouse.proto

package via.sdj3.slaughterhousegrpcspringboot.protobuf;

public final class SlaughterhouseOuterClass {
  private SlaughterhouseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AliveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AliveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Animal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Animal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalPart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Animals_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Animals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Trays_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Trays_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductPacks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductPacks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductPackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductPackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductPacksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductPacksResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024Slaughterhouse.proto\"\007\n\005Empty\"\035\n\rAlive" +
      "Response\022\014\n\004text\030\001 \003(\t\"8\n\006Animal\022\016\n\006weig" +
      "ht\030\001 \001(\001\022\020\n\010animalNr\030\002 \001(\005\022\014\n\004type\030\003 \001(\t" +
      "\"^\n\nAnimalPart\022\022\n\npartWeight\030\001 \001(\001\022\022\n\npa" +
      "rtNumber\030\002 \001(\005\022\032\n\tanimalRef\030\003 \001(\0132\007.Anim" +
      "al\022\014\n\004type\030\004 \001(\t\"#\n\007Animals\022\030\n\007animals\030\001" +
      " \003(\0132\007.Animal\"M\n\005Trays\022\035\n\010partType\030\001 \003(\013" +
      "2\013.AnimalPart\022\025\n\rmaximumWeight\030\002 \001(\001\022\016\n\006" +
      "trayNr\030\003 \001(\005\"7\n\014ProductPacks\022\016\n\006packNr\030\001" +
      " \001(\005\022\027\n\007trayRef\030\002 \003(\0132\006.Trays\" \n\022Product" +
      "PackRequest\022\n\n\002id\030\001 \001(\005\"\033\n\rAnimalRequest" +
      "\022\n\n\002id\030\001 \001(\005\"-\n\024ProductPacksResponse\022\025\n\r" +
      "productPackId\030\001 \003(\0052\325\001\n\016Slaughterhouse\022 " +
      "\n\014createAnimal\022\007.Animal\032\007.Animal\022;\n\032getA" +
      "llAnimalRegNrInProduct\022\023.ProductPackRequ" +
      "est\032\010.Animals\022@\n\027getAllProductFromAnimal" +
      "\022\016.AnimalRequest\032\025.ProductPacksResponse\022" +
      "\"\n\010getAlive\022\006.Empty\032\016.AliveResponseB2\n.v" +
      "ia.sdj3.slaughterhousegrpcspringboot.pro" +
      "tobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_AliveResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AliveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AliveResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_Animal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Animal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Animal_descriptor,
        new java.lang.String[] { "Weight", "AnimalNr", "Type", });
    internal_static_AnimalPart_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AnimalPart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalPart_descriptor,
        new java.lang.String[] { "PartWeight", "PartNumber", "AnimalRef", "Type", });
    internal_static_Animals_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Animals_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Animals_descriptor,
        new java.lang.String[] { "Animals", });
    internal_static_Trays_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Trays_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Trays_descriptor,
        new java.lang.String[] { "PartType", "MaximumWeight", "TrayNr", });
    internal_static_ProductPacks_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ProductPacks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductPacks_descriptor,
        new java.lang.String[] { "PackNr", "TrayRef", });
    internal_static_ProductPackRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ProductPackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductPackRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_AnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_AnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_ProductPacksResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ProductPacksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductPacksResponse_descriptor,
        new java.lang.String[] { "ProductPackId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
