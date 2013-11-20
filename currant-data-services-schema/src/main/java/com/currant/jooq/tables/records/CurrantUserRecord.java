/**
 * This class is generated by jOOQ
 */
package com.currant.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrantUserRecord extends org.jooq.impl.UpdatableRecordImpl<com.currant.jooq.tables.records.CurrantUserRecord> implements org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 2086845718;

	/**
	 * Setter for <code>public.currant_user.currant_user_id</code>. 
	 */
	public void setCurrantUserId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.currant_user.currant_user_id</code>. 
	 */
	public java.lang.Long getCurrantUserId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.currant_user.email_address</code>. 
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.currant_user.email_address</code>. 
	 */
	public java.lang.String getEmailAddress() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.currant_user.salt</code>. 
	 */
	public void setSalt(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.currant_user.salt</code>. 
	 */
	public java.lang.String getSalt() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.currant_user.password</code>. 
	 */
	public void setPassword(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.currant_user.password</code>. 
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.currant_user.account_status</code>. 
	 */
	public void setAccountStatus(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.currant_user.account_status</code>. 
	 */
	public java.lang.String getAccountStatus() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.currant_user.subscriber_type</code>. 
	 */
	public void setSubscriberType(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.currant_user.subscriber_type</code>. 
	 */
	public java.lang.String getSubscriberType() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.currant_user.active</code>. 
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.currant_user.active</code>. 
	 */
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.CURRANT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.EMAIL_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.SALT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.ACCOUNT_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.SUBSCRIBER_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return com.currant.jooq.tables.CurrantUser.CURRANT_USER.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getCurrantUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getEmailAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSalt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAccountStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSubscriberType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getActive();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CurrantUserRecord
	 */
	public CurrantUserRecord() {
		super(com.currant.jooq.tables.CurrantUser.CURRANT_USER);
	}
}