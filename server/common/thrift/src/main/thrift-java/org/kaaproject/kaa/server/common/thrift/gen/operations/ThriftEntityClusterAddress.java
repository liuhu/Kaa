/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-15")
public class ThriftEntityClusterAddress implements org.apache.thrift.TBase<ThriftEntityClusterAddress, ThriftEntityClusterAddress._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftEntityClusterAddress> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftEntityClusterAddress");

  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TENANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationToken", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ENTITY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("entityType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ENTITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("entityId", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftEntityClusterAddressStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftEntityClusterAddressTupleSchemeFactory());
  }

  public String nodeId; // required
  public String tenantId; // required
  public String applicationToken; // required
  /**
   * 
   * @see ThriftClusterEntityType
   */
  public ThriftClusterEntityType entityType; // required
  public ByteBuffer entityId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "nodeId"),
    TENANT_ID((short)2, "tenantId"),
    APPLICATION_TOKEN((short)3, "applicationToken"),
    /**
     * 
     * @see ThriftClusterEntityType
     */
    ENTITY_TYPE((short)4, "entityType"),
    ENTITY_ID((short)5, "entityId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NODE_ID
          return NODE_ID;
        case 2: // TENANT_ID
          return TENANT_ID;
        case 3: // APPLICATION_TOKEN
          return APPLICATION_TOKEN;
        case 4: // ENTITY_TYPE
          return ENTITY_TYPE;
        case 5: // ENTITY_ID
          return ENTITY_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TENANT_ID, new org.apache.thrift.meta_data.FieldMetaData("tenantId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "tenant_id")));
    tmpMap.put(_Fields.APPLICATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("applicationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "application_token")));
    tmpMap.put(_Fields.ENTITY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("entityType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftClusterEntityType.class)));
    tmpMap.put(_Fields.ENTITY_ID, new org.apache.thrift.meta_data.FieldMetaData("entityId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftEntityClusterAddress.class, metaDataMap);
  }

  public ThriftEntityClusterAddress() {
  }

  public ThriftEntityClusterAddress(
    String nodeId,
    String tenantId,
    String applicationToken,
    ThriftClusterEntityType entityType,
    ByteBuffer entityId)
  {
    this();
    this.nodeId = nodeId;
    this.tenantId = tenantId;
    this.applicationToken = applicationToken;
    this.entityType = entityType;
    this.entityId = org.apache.thrift.TBaseHelper.copyBinary(entityId);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftEntityClusterAddress(ThriftEntityClusterAddress other) {
    if (other.isSetNodeId()) {
      this.nodeId = other.nodeId;
    }
    if (other.isSetTenantId()) {
      this.tenantId = other.tenantId;
    }
    if (other.isSetApplicationToken()) {
      this.applicationToken = other.applicationToken;
    }
    if (other.isSetEntityType()) {
      this.entityType = other.entityType;
    }
    if (other.isSetEntityId()) {
      this.entityId = org.apache.thrift.TBaseHelper.copyBinary(other.entityId);
    }
  }

  public ThriftEntityClusterAddress deepCopy() {
    return new ThriftEntityClusterAddress(this);
  }

  @Override
  public void clear() {
    this.nodeId = null;
    this.tenantId = null;
    this.applicationToken = null;
    this.entityType = null;
    this.entityId = null;
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public ThriftEntityClusterAddress setNodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  public void unsetNodeId() {
    this.nodeId = null;
  }

  /** Returns true if field nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeId() {
    return this.nodeId != null;
  }

  public void setNodeIdIsSet(boolean value) {
    if (!value) {
      this.nodeId = null;
    }
  }

  public String getTenantId() {
    return this.tenantId;
  }

  public ThriftEntityClusterAddress setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public void unsetTenantId() {
    this.tenantId = null;
  }

  /** Returns true if field tenantId is set (has been assigned a value) and false otherwise */
  public boolean isSetTenantId() {
    return this.tenantId != null;
  }

  public void setTenantIdIsSet(boolean value) {
    if (!value) {
      this.tenantId = null;
    }
  }

  public String getApplicationToken() {
    return this.applicationToken;
  }

  public ThriftEntityClusterAddress setApplicationToken(String applicationToken) {
    this.applicationToken = applicationToken;
    return this;
  }

  public void unsetApplicationToken() {
    this.applicationToken = null;
  }

  /** Returns true if field applicationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationToken() {
    return this.applicationToken != null;
  }

  public void setApplicationTokenIsSet(boolean value) {
    if (!value) {
      this.applicationToken = null;
    }
  }

  /**
   * 
   * @see ThriftClusterEntityType
   */
  public ThriftClusterEntityType getEntityType() {
    return this.entityType;
  }

  /**
   * 
   * @see ThriftClusterEntityType
   */
  public ThriftEntityClusterAddress setEntityType(ThriftClusterEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  public void unsetEntityType() {
    this.entityType = null;
  }

  /** Returns true if field entityType is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityType() {
    return this.entityType != null;
  }

  public void setEntityTypeIsSet(boolean value) {
    if (!value) {
      this.entityType = null;
    }
  }

  public byte[] getEntityId() {
    setEntityId(org.apache.thrift.TBaseHelper.rightSize(entityId));
    return entityId == null ? null : entityId.array();
  }

  public ByteBuffer bufferForEntityId() {
    return org.apache.thrift.TBaseHelper.copyBinary(entityId);
  }

  public ThriftEntityClusterAddress setEntityId(byte[] entityId) {
    this.entityId = entityId == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(entityId, entityId.length));
    return this;
  }

  public ThriftEntityClusterAddress setEntityId(ByteBuffer entityId) {
    this.entityId = org.apache.thrift.TBaseHelper.copyBinary(entityId);
    return this;
  }

  public void unsetEntityId() {
    this.entityId = null;
  }

  /** Returns true if field entityId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityId() {
    return this.entityId != null;
  }

  public void setEntityIdIsSet(boolean value) {
    if (!value) {
      this.entityId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((String)value);
      }
      break;

    case TENANT_ID:
      if (value == null) {
        unsetTenantId();
      } else {
        setTenantId((String)value);
      }
      break;

    case APPLICATION_TOKEN:
      if (value == null) {
        unsetApplicationToken();
      } else {
        setApplicationToken((String)value);
      }
      break;

    case ENTITY_TYPE:
      if (value == null) {
        unsetEntityType();
      } else {
        setEntityType((ThriftClusterEntityType)value);
      }
      break;

    case ENTITY_ID:
      if (value == null) {
        unsetEntityId();
      } else {
        setEntityId((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return getNodeId();

    case TENANT_ID:
      return getTenantId();

    case APPLICATION_TOKEN:
      return getApplicationToken();

    case ENTITY_TYPE:
      return getEntityType();

    case ENTITY_ID:
      return getEntityId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_ID:
      return isSetNodeId();
    case TENANT_ID:
      return isSetTenantId();
    case APPLICATION_TOKEN:
      return isSetApplicationToken();
    case ENTITY_TYPE:
      return isSetEntityType();
    case ENTITY_ID:
      return isSetEntityId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftEntityClusterAddress)
      return this.equals((ThriftEntityClusterAddress)that);
    return false;
  }

  public boolean equals(ThriftEntityClusterAddress that) {
    if (that == null)
      return false;

    boolean this_present_nodeId = true && this.isSetNodeId();
    boolean that_present_nodeId = true && that.isSetNodeId();
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (!this.nodeId.equals(that.nodeId))
        return false;
    }

    boolean this_present_tenantId = true && this.isSetTenantId();
    boolean that_present_tenantId = true && that.isSetTenantId();
    if (this_present_tenantId || that_present_tenantId) {
      if (!(this_present_tenantId && that_present_tenantId))
        return false;
      if (!this.tenantId.equals(that.tenantId))
        return false;
    }

    boolean this_present_applicationToken = true && this.isSetApplicationToken();
    boolean that_present_applicationToken = true && that.isSetApplicationToken();
    if (this_present_applicationToken || that_present_applicationToken) {
      if (!(this_present_applicationToken && that_present_applicationToken))
        return false;
      if (!this.applicationToken.equals(that.applicationToken))
        return false;
    }

    boolean this_present_entityType = true && this.isSetEntityType();
    boolean that_present_entityType = true && that.isSetEntityType();
    if (this_present_entityType || that_present_entityType) {
      if (!(this_present_entityType && that_present_entityType))
        return false;
      if (!this.entityType.equals(that.entityType))
        return false;
    }

    boolean this_present_entityId = true && this.isSetEntityId();
    boolean that_present_entityId = true && that.isSetEntityId();
    if (this_present_entityId || that_present_entityId) {
      if (!(this_present_entityId && that_present_entityId))
        return false;
      if (!this.entityId.equals(that.entityId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodeId = true && (isSetNodeId());
    list.add(present_nodeId);
    if (present_nodeId)
      list.add(nodeId);

    boolean present_tenantId = true && (isSetTenantId());
    list.add(present_tenantId);
    if (present_tenantId)
      list.add(tenantId);

    boolean present_applicationToken = true && (isSetApplicationToken());
    list.add(present_applicationToken);
    if (present_applicationToken)
      list.add(applicationToken);

    boolean present_entityType = true && (isSetEntityType());
    list.add(present_entityType);
    if (present_entityType)
      list.add(entityType.getValue());

    boolean present_entityId = true && (isSetEntityId());
    list.add(present_entityId);
    if (present_entityId)
      list.add(entityId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftEntityClusterAddress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(other.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, other.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTenantId()).compareTo(other.isSetTenantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTenantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tenantId, other.tenantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationToken()).compareTo(other.isSetApplicationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationToken, other.applicationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityType()).compareTo(other.isSetEntityType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityType, other.entityType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityId()).compareTo(other.isSetEntityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityId, other.entityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftEntityClusterAddress(");
    boolean first = true;

    sb.append("nodeId:");
    if (this.nodeId == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tenantId:");
    if (this.tenantId == null) {
      sb.append("null");
    } else {
      sb.append(this.tenantId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationToken:");
    if (this.applicationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityType:");
    if (this.entityType == null) {
      sb.append("null");
    } else {
      sb.append(this.entityType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityId:");
    if (this.entityId == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.entityId, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftEntityClusterAddressStandardSchemeFactory implements SchemeFactory {
    public ThriftEntityClusterAddressStandardScheme getScheme() {
      return new ThriftEntityClusterAddressStandardScheme();
    }
  }

  private static class ThriftEntityClusterAddressStandardScheme extends StandardScheme<ThriftEntityClusterAddress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nodeId = iprot.readString();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TENANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tenantId = iprot.readString();
              struct.setTenantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationToken = iprot.readString();
              struct.setApplicationTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENTITY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.entityType = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftClusterEntityType.findByValue(iprot.readI32());
              struct.setEntityTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ENTITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entityId = iprot.readBinary();
              struct.setEntityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeId != null) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeString(struct.nodeId);
        oprot.writeFieldEnd();
      }
      if (struct.tenantId != null) {
        oprot.writeFieldBegin(TENANT_ID_FIELD_DESC);
        oprot.writeString(struct.tenantId);
        oprot.writeFieldEnd();
      }
      if (struct.applicationToken != null) {
        oprot.writeFieldBegin(APPLICATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.applicationToken);
        oprot.writeFieldEnd();
      }
      if (struct.entityType != null) {
        oprot.writeFieldBegin(ENTITY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.entityType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.entityId != null) {
        oprot.writeFieldBegin(ENTITY_ID_FIELD_DESC);
        oprot.writeBinary(struct.entityId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftEntityClusterAddressTupleSchemeFactory implements SchemeFactory {
    public ThriftEntityClusterAddressTupleScheme getScheme() {
      return new ThriftEntityClusterAddressTupleScheme();
    }
  }

  private static class ThriftEntityClusterAddressTupleScheme extends TupleScheme<ThriftEntityClusterAddress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNodeId()) {
        optionals.set(0);
      }
      if (struct.isSetTenantId()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationToken()) {
        optionals.set(2);
      }
      if (struct.isSetEntityType()) {
        optionals.set(3);
      }
      if (struct.isSetEntityId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetNodeId()) {
        oprot.writeString(struct.nodeId);
      }
      if (struct.isSetTenantId()) {
        oprot.writeString(struct.tenantId);
      }
      if (struct.isSetApplicationToken()) {
        oprot.writeString(struct.applicationToken);
      }
      if (struct.isSetEntityType()) {
        oprot.writeI32(struct.entityType.getValue());
      }
      if (struct.isSetEntityId()) {
        oprot.writeBinary(struct.entityId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.nodeId = iprot.readString();
        struct.setNodeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tenantId = iprot.readString();
        struct.setTenantIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationToken = iprot.readString();
        struct.setApplicationTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.entityType = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftClusterEntityType.findByValue(iprot.readI32());
        struct.setEntityTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.entityId = iprot.readBinary();
        struct.setEntityIdIsSet(true);
      }
    }
  }

}

