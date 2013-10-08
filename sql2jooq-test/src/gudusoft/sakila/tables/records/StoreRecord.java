/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreRecord extends org.jooq.impl.UpdatableRecordImpl<gudusoft.sakila.tables.records.StoreRecord> implements org.jooq.Record4<org.jooq.types.UByte, org.jooq.types.UByte, org.jooq.types.UShort, java.sql.Timestamp> {

	private static final long serialVersionUID = -927241356;

	/**
	 * Setter for <code>sakila.store.store_id</code>. 
	 */
	public void setStoreId(org.jooq.types.UByte value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.store.store_id</code>. 
	 */
	public org.jooq.types.UByte getStoreId() {
		return (org.jooq.types.UByte) getValue(0);
	}

	/**
	 * Setter for <code>sakila.store.manager_staff_id</code>. 
	 */
	public void setManagerStaffId(org.jooq.types.UByte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.store.manager_staff_id</code>. 
	 */
	public org.jooq.types.UByte getManagerStaffId() {
		return (org.jooq.types.UByte) getValue(1);
	}

	/**
	 * Setter for <code>sakila.store.address_id</code>. 
	 */
	public void setAddressId(org.jooq.types.UShort value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.store.address_id</code>. 
	 */
	public org.jooq.types.UShort getAddressId() {
		return (org.jooq.types.UShort) getValue(2);
	}

	/**
	 * Setter for <code>sakila.store.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.store.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UByte> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UByte, org.jooq.types.UByte, org.jooq.types.UShort, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UByte, org.jooq.types.UByte, org.jooq.types.UShort, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field1() {
		return gudusoft.sakila.tables.Store.STORE.STORE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field2() {
		return gudusoft.sakila.tables.Store.STORE.MANAGER_STAFF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field3() {
		return gudusoft.sakila.tables.Store.STORE.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return gudusoft.sakila.tables.Store.STORE.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value1() {
		return getStoreId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value2() {
		return getManagerStaffId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UShort value3() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StoreRecord
	 */
	public StoreRecord() {
		super(gudusoft.sakila.tables.Store.STORE);
	}
}