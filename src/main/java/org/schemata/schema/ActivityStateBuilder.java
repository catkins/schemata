// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.schemata.schema;

public final class ActivityStateBuilder {
  private ActivityStateBuilder() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code org.schemata.schema.ActivityType}
   */
  public enum ActivityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CREATED = 0;</code>
     */
    CREATED(0),
    /**
     * <code>DELETED = 1;</code>
     */
    DELETED(1),
    /**
     * <code>UPDATED = 2;</code>
     */
    UPDATED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CREATED = 0;</code>
     */
    public static final int CREATED_VALUE = 0;
    /**
     * <code>DELETED = 1;</code>
     */
    public static final int DELETED_VALUE = 1;
    /**
     * <code>UPDATED = 2;</code>
     */
    public static final int UPDATED_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActivityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ActivityType forNumber(int value) {
      switch (value) {
        case 0: return CREATED;
        case 1: return DELETED;
        case 2: return UPDATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ActivityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ActivityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ActivityType>() {
            public ActivityType findValueByNumber(int number) {
              return ActivityType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.schemata.schema.ActivityStateBuilder.getDescriptor().getEnumTypes().get(0);
    }

    private static final ActivityType[] VALUES = values();

    public static ActivityType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ActivityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.schemata.schema.ActivityType)
  }

  /**
   * Protobuf enum {@code org.schemata.schema.TimeUnit}
   */
  public enum TimeUnit
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SECONDS = 0;</code>
     */
    SECONDS(0),
    /**
     * <code>MINUTES = 1;</code>
     */
    MINUTES(1),
    /**
     * <code>HOURS = 2;</code>
     */
    HOURS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SECONDS = 0;</code>
     */
    public static final int SECONDS_VALUE = 0;
    /**
     * <code>MINUTES = 1;</code>
     */
    public static final int MINUTES_VALUE = 1;
    /**
     * <code>HOURS = 2;</code>
     */
    public static final int HOURS_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TimeUnit valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TimeUnit forNumber(int value) {
      switch (value) {
        case 0: return SECONDS;
        case 1: return MINUTES;
        case 2: return HOURS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TimeUnit>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TimeUnit> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TimeUnit>() {
            public TimeUnit findValueByNumber(int number) {
              return TimeUnit.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.schemata.schema.ActivityStateBuilder.getDescriptor().getEnumTypes().get(1);
    }

    private static final TimeUnit[] VALUES = values();

    public static TimeUnit valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TimeUnit(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.schemata.schema.TimeUnit)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\023org.schemata.schema*5\n\014A" +
      "ctivityType\022\013\n\007CREATED\020\000\022\013\n\007DELETED\020\001\022\013\n" +
      "\007UPDATED\020\002*/\n\010TimeUnit\022\013\n\007SECONDS\020\000\022\013\n\007M" +
      "INUTES\020\001\022\t\n\005HOURS\020\002B+\n\023org.schemata.sche" +
      "maB\024ActivityStateBuilderb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
