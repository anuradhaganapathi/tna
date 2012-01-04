/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package tutorial;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Structs are the basic complex data structures. They are comprised of fields
 * which each have an integer identifier, a type, a symbolic name, and an
 * optional default value.
 * 
 * Fields can be declared "optional", which ensures they will not be included
 * in the serialized output if they aren't set.  Note that this requires some
 * manual management in some languages.
 */
public class Work implements org.apache.thrift.TBase<Work, Work._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Work");

  private static final org.apache.thrift.protocol.TField NUM1_FIELD_DESC = new org.apache.thrift.protocol.TField("num1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM2_FIELD_DESC = new org.apache.thrift.protocol.TField("num2", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)4);

  public int num1;
  public int num2;
  /**
   * 
   * @see Operation
   */
  public Operation op;
  public String comment;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM1((short)1, "num1"),
    NUM2((short)2, "num2"),
    /**
     * 
     * @see Operation
     */
    OP((short)3, "op"),
    COMMENT((short)4, "comment");

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
        case 1: // NUM1
          return NUM1;
        case 2: // NUM2
          return NUM2;
        case 3: // OP
          return OP;
        case 4: // COMMENT
          return COMMENT;
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
  private static final int __NUM1_ISSET_ID = 0;
  private static final int __NUM2_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM1, new org.apache.thrift.meta_data.FieldMetaData("num1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM2, new org.apache.thrift.meta_data.FieldMetaData("num2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Operation.class)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Work.class, metaDataMap);
  }

  public Work() {
    this.num1 = 0;

  }

  public Work(
    int num1,
    int num2,
    Operation op)
  {
    this();
    this.num1 = num1;
    setNum1IsSet(true);
    this.num2 = num2;
    setNum2IsSet(true);
    this.op = op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Work(Work other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.num1 = other.num1;
    this.num2 = other.num2;
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
  }

  public Work deepCopy() {
    return new Work(this);
  }

  @Override
  public void clear() {
    this.num1 = 0;

    setNum2IsSet(false);
    this.num2 = 0;
    this.op = null;
    this.comment = null;
  }

  public int getNum1() {
    return this.num1;
  }

  public Work setNum1(int num1) {
    this.num1 = num1;
    setNum1IsSet(true);
    return this;
  }

  public void unsetNum1() {
    __isset_bit_vector.clear(__NUM1_ISSET_ID);
  }

  /** Returns true if field num1 is set (has been assigned a value) and false otherwise */
  public boolean isSetNum1() {
    return __isset_bit_vector.get(__NUM1_ISSET_ID);
  }

  public void setNum1IsSet(boolean value) {
    __isset_bit_vector.set(__NUM1_ISSET_ID, value);
  }

  public int getNum2() {
    return this.num2;
  }

  public Work setNum2(int num2) {
    this.num2 = num2;
    setNum2IsSet(true);
    return this;
  }

  public void unsetNum2() {
    __isset_bit_vector.clear(__NUM2_ISSET_ID);
  }

  /** Returns true if field num2 is set (has been assigned a value) and false otherwise */
  public boolean isSetNum2() {
    return __isset_bit_vector.get(__NUM2_ISSET_ID);
  }

  public void setNum2IsSet(boolean value) {
    __isset_bit_vector.set(__NUM2_ISSET_ID, value);
  }

  /**
   * 
   * @see Operation
   */
  public Operation getOp() {
    return this.op;
  }

  /**
   * 
   * @see Operation
   */
  public Work setOp(Operation op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  public String getComment() {
    return this.comment;
  }

  public Work setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM1:
      if (value == null) {
        unsetNum1();
      } else {
        setNum1((Integer)value);
      }
      break;

    case NUM2:
      if (value == null) {
        unsetNum2();
      } else {
        setNum2((Integer)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((Operation)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM1:
      return new Integer(getNum1());

    case NUM2:
      return new Integer(getNum2());

    case OP:
      return getOp();

    case COMMENT:
      return getComment();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM1:
      return isSetNum1();
    case NUM2:
      return isSetNum2();
    case OP:
      return isSetOp();
    case COMMENT:
      return isSetComment();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Work)
      return this.equals((Work)that);
    return false;
  }

  public boolean equals(Work that) {
    if (that == null)
      return false;

    boolean this_present_num1 = true;
    boolean that_present_num1 = true;
    if (this_present_num1 || that_present_num1) {
      if (!(this_present_num1 && that_present_num1))
        return false;
      if (this.num1 != that.num1)
        return false;
    }

    boolean this_present_num2 = true;
    boolean that_present_num2 = true;
    if (this_present_num2 || that_present_num2) {
      if (!(this_present_num2 && that_present_num2))
        return false;
      if (this.num2 != that.num2)
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Work other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Work typedOther = (Work)other;

    lastComparison = Boolean.valueOf(isSetNum1()).compareTo(typedOther.isSetNum1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num1, typedOther.num1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum2()).compareTo(typedOther.isSetNum2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num2, typedOther.num2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOp()).compareTo(typedOther.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, typedOther.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComment()).compareTo(typedOther.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, typedOther.comment);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NUM1
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.num1 = iprot.readI32();
            setNum1IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NUM2
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.num2 = iprot.readI32();
            setNum2IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // OP
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.op = Operation.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // COMMENT
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.comment = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(NUM1_FIELD_DESC);
    oprot.writeI32(this.num1);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NUM2_FIELD_DESC);
    oprot.writeI32(this.num2);
    oprot.writeFieldEnd();
    if (this.op != null) {
      oprot.writeFieldBegin(OP_FIELD_DESC);
      oprot.writeI32(this.op.getValue());
      oprot.writeFieldEnd();
    }
    if (this.comment != null) {
      if (isSetComment()) {
        oprot.writeFieldBegin(COMMENT_FIELD_DESC);
        oprot.writeString(this.comment);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Work(");
    boolean first = true;

    sb.append("num1:");
    sb.append(this.num1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num2:");
    sb.append(this.num2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

