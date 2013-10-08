/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends org.jooq.impl.TableImpl<gudusoft.sakila.tables.records.AddressRecord> {

	private static final long serialVersionUID = -612199559;

	/**
	 * The singleton instance of <code>sakila.address</code>
	 */
	public static final gudusoft.sakila.tables.Address ADDRESS = new gudusoft.sakila.tables.Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<gudusoft.sakila.tables.records.AddressRecord> getRecordType() {
		return gudusoft.sakila.tables.records.AddressRecord.class;
	}

	/**
	 * The column <code>sakila.address.address_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, org.jooq.types.UShort> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>sakila.address.address</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.lang.String> ADDRESS_ = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>sakila.address.address2</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.lang.String> ADDRESS2 = createField("address2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>sakila.address.district</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.lang.String> DISTRICT = createField("district", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>sakila.address.city_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, org.jooq.types.UShort> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>sakila.address.postal_code</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.lang.String> POSTAL_CODE = createField("postal_code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>sakila.address.phone</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>sakila.address.last_update</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.AddressRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.address</code> table reference
	 */
	public Address() {
		super("address", gudusoft.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.address</code> table reference
	 */
	public Address(java.lang.String alias) {
		super(alias, gudusoft.sakila.Sakila.SAKILA, gudusoft.sakila.tables.Address.ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<gudusoft.sakila.tables.records.AddressRecord, org.jooq.types.UShort> getIdentity() {
		return gudusoft.sakila.Keys.IDENTITY_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<gudusoft.sakila.tables.records.AddressRecord> getPrimaryKey() {
		return gudusoft.sakila.Keys.KEY_ADDRESS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<gudusoft.sakila.tables.records.AddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<gudusoft.sakila.tables.records.AddressRecord>>asList(gudusoft.sakila.Keys.KEY_ADDRESS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<gudusoft.sakila.tables.records.AddressRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<gudusoft.sakila.tables.records.AddressRecord, ?>>asList(gudusoft.sakila.Keys.FK_ADDRESS_CITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public gudusoft.sakila.tables.Address as(java.lang.String alias) {
		return new gudusoft.sakila.tables.Address(alias);
	}
}