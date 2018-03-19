package entity;

/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-03-20")
public class Student implements org.apache.thrift.TBase<Student, Student._Fields>, java.io.Serializable, Cloneable, Comparable<Student> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("entity.Student");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SURNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("surname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UNIVERCITY_FIELD_DESC = new org.apache.thrift.protocol.TField("univercity", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField SRBAL_FIELD_DESC = new org.apache.thrift.protocol.TField("srbal", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StudentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StudentTupleSchemeFactory();

  public String name; // required
  public String surname; // required
  public Univer univercity; // required
  public String srbal; // required
  public String number; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    SURNAME((short)2, "surname"),
    UNIVERCITY((short)3, "univercity"),
    SRBAL((short)4, "srbal"),
    NUMBER((short)5, "number");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // SURNAME
          return SURNAME;
        case 3: // UNIVERCITY
          return UNIVERCITY;
        case 4: // SRBAL
          return SRBAL;
        case 5: // NUMBER
          return NUMBER;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SURNAME, new org.apache.thrift.meta_data.FieldMetaData("surname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIVERCITY, new org.apache.thrift.meta_data.FieldMetaData("univercity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "entity.Univer")));
    tmpMap.put(_Fields.SRBAL, new org.apache.thrift.meta_data.FieldMetaData("srbal", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Student.class, metaDataMap);
  }

  public Student() {
  }

  public Student(
    String name,
    String surname,
    Univer univercity,
    String srbal,
    String number)
  {
    this();
    this.name = name;
    this.surname = surname;
    this.univercity = univercity;
    this.srbal = srbal;
    this.number = number;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Student(Student other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSurname()) {
      this.surname = other.surname;
    }
    if (other.isSetUnivercity()) {
      this.univercity = new Univer(other.univercity);
    }
    if (other.isSetSrbal()) {
      this.srbal = other.srbal;
    }
    if (other.isSetNumber()) {
      this.number = other.number;
    }
  }

  public Student deepCopy() {
    return new Student(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.surname = null;
    this.univercity = null;
    this.srbal = null;
    this.number = null;
  }

  public String getName() {
    return this.name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getSurname() {
    return this.surname;
  }

  public Student setSurname(String surname) {
    this.surname = surname;
    return this;
  }

  public void unsetSurname() {
    this.surname = null;
  }

  /** Returns true if field surname is set (has been assigned a value) and false otherwise */
  public boolean isSetSurname() {
    return this.surname != null;
  }

  public void setSurnameIsSet(boolean value) {
    if (!value) {
      this.surname = null;
    }
  }

  public Univer getUnivercity() {
    return this.univercity;
  }

  public Student setUnivercity(Univer univercity) {
    this.univercity = univercity;
    return this;
  }

  public void unsetUnivercity() {
    this.univercity = null;
  }

  /** Returns true if field univercity is set (has been assigned a value) and false otherwise */
  public boolean isSetUnivercity() {
    return this.univercity != null;
  }

  public void setUnivercityIsSet(boolean value) {
    if (!value) {
      this.univercity = null;
    }
  }

  public String getSrbal() {
    return this.srbal;
  }

  public Student setSrbal(String srbal) {
    this.srbal = srbal;
    return this;
  }

  public void unsetSrbal() {
    this.srbal = null;
  }

  /** Returns true if field srbal is set (has been assigned a value) and false otherwise */
  public boolean isSetSrbal() {
    return this.srbal != null;
  }

  public void setSrbalIsSet(boolean value) {
    if (!value) {
      this.srbal = null;
    }
  }

  public String getNumber() {
    return this.number;
  }

  public Student setNumber(String number) {
    this.number = number;
    return this;
  }

  public void unsetNumber() {
    this.number = null;
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return this.number != null;
  }

  public void setNumberIsSet(boolean value) {
    if (!value) {
      this.number = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SURNAME:
      if (value == null) {
        unsetSurname();
      } else {
        setSurname((String)value);
      }
      break;

    case UNIVERCITY:
      if (value == null) {
        unsetUnivercity();
      } else {
        setUnivercity((Univer)value);
      }
      break;

    case SRBAL:
      if (value == null) {
        unsetSrbal();
      } else {
        setSrbal((String)value);
      }
      break;

    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case SURNAME:
      return getSurname();

    case UNIVERCITY:
      return getUnivercity();

    case SRBAL:
      return getSrbal();

    case NUMBER:
      return getNumber();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case SURNAME:
      return isSetSurname();
    case UNIVERCITY:
      return isSetUnivercity();
    case SRBAL:
      return isSetSrbal();
    case NUMBER:
      return isSetNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Student)
      return this.equals((Student)that);
    return false;
  }

  public boolean equals(Student that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_surname = true && this.isSetSurname();
    boolean that_present_surname = true && that.isSetSurname();
    if (this_present_surname || that_present_surname) {
      if (!(this_present_surname && that_present_surname))
        return false;
      if (!this.surname.equals(that.surname))
        return false;
    }

    boolean this_present_univercity = true && this.isSetUnivercity();
    boolean that_present_univercity = true && that.isSetUnivercity();
    if (this_present_univercity || that_present_univercity) {
      if (!(this_present_univercity && that_present_univercity))
        return false;
      if (!this.univercity.equals(that.univercity))
        return false;
    }

    boolean this_present_srbal = true && this.isSetSrbal();
    boolean that_present_srbal = true && that.isSetSrbal();
    if (this_present_srbal || that_present_srbal) {
      if (!(this_present_srbal && that_present_srbal))
        return false;
      if (!this.srbal.equals(that.srbal))
        return false;
    }

    boolean this_present_number = true && this.isSetNumber();
    boolean that_present_number = true && that.isSetNumber();
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (!this.number.equals(that.number))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetSurname()) ? 131071 : 524287);
    if (isSetSurname())
      hashCode = hashCode * 8191 + surname.hashCode();

    hashCode = hashCode * 8191 + ((isSetUnivercity()) ? 131071 : 524287);
    if (isSetUnivercity())
      hashCode = hashCode * 8191 + univercity.hashCode();

    hashCode = hashCode * 8191 + ((isSetSrbal()) ? 131071 : 524287);
    if (isSetSrbal())
      hashCode = hashCode * 8191 + srbal.hashCode();

    hashCode = hashCode * 8191 + ((isSetNumber()) ? 131071 : 524287);
    if (isSetNumber())
      hashCode = hashCode * 8191 + number.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Student other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSurname()).compareTo(other.isSetSurname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSurname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.surname, other.surname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnivercity()).compareTo(other.isSetUnivercity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnivercity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.univercity, other.univercity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSrbal()).compareTo(other.isSetSrbal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrbal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.srbal, other.srbal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number, other.number);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("entity.Student(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("surname:");
    if (this.surname == null) {
      sb.append("null");
    } else {
      sb.append(this.surname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("univercity:");
    if (this.univercity == null) {
      sb.append("null");
    } else {
      sb.append(this.univercity);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("srbal:");
    if (this.srbal == null) {
      sb.append("null");
    } else {
      sb.append(this.srbal);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("number:");
    if (this.number == null) {
      sb.append("null");
    } else {
      sb.append(this.number);
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

  private static class StudentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StudentStandardScheme getScheme() {
      return new StudentStandardScheme();
    }
  }

  private static class StudentStandardScheme extends org.apache.thrift.scheme.StandardScheme<Student> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Student struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SURNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.surname = iprot.readString();
              struct.setSurnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UNIVERCITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.univercity = new Univer();
              struct.univercity.read(iprot);
              struct.setUnivercityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SRBAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.srbal = iprot.readString();
              struct.setSrbalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.number = iprot.readString();
              struct.setNumberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Student struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.surname != null) {
        oprot.writeFieldBegin(SURNAME_FIELD_DESC);
        oprot.writeString(struct.surname);
        oprot.writeFieldEnd();
      }
      if (struct.univercity != null) {
        oprot.writeFieldBegin(UNIVERCITY_FIELD_DESC);
        struct.univercity.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.srbal != null) {
        oprot.writeFieldBegin(SRBAL_FIELD_DESC);
        oprot.writeString(struct.srbal);
        oprot.writeFieldEnd();
      }
      if (struct.number != null) {
        oprot.writeFieldBegin(NUMBER_FIELD_DESC);
        oprot.writeString(struct.number);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StudentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StudentTupleScheme getScheme() {
      return new StudentTupleScheme();
    }
  }

  private static class StudentTupleScheme extends org.apache.thrift.scheme.TupleScheme<Student> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Student struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetSurname()) {
        optionals.set(1);
      }
      if (struct.isSetUnivercity()) {
        optionals.set(2);
      }
      if (struct.isSetSrbal()) {
        optionals.set(3);
      }
      if (struct.isSetNumber()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSurname()) {
        oprot.writeString(struct.surname);
      }
      if (struct.isSetUnivercity()) {
        struct.univercity.write(oprot);
      }
      if (struct.isSetSrbal()) {
        oprot.writeString(struct.srbal);
      }
      if (struct.isSetNumber()) {
        oprot.writeString(struct.number);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Student struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.surname = iprot.readString();
        struct.setSurnameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.univercity = new Univer();
        struct.univercity.read(iprot);
        struct.setUnivercityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.srbal = iprot.readString();
        struct.setSrbalIsSet(true);
      }
      if (incoming.get(4)) {
        struct.number = iprot.readString();
        struct.setNumberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
