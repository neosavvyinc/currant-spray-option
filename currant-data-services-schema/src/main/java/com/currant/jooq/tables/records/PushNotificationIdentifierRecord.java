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
public class PushNotificationIdentifierRecord extends org.jooq.impl.UpdatableRecordImpl<com.currant.jooq.tables.records.PushNotificationIdentifierRecord> implements org.jooq.Record4<java.lang.Long, java.util.UUID, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = -1501485937;

	/**
	 * Setter for <code>public.push_notification_identifier.push_notification_identifier_id</code>. 
	 */
	public void setPushNotificationIdentifierId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.push_notification_identifier.push_notification_identifier_id</code>. 
	 */
	public java.lang.Long getPushNotificationIdentifierId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.push_notification_identifier.identifier</code>. 
	 */
	public void setIdentifier(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.push_notification_identifier.identifier</code>. 
	 */
	public java.util.UUID getIdentifier() {
		return (java.util.UUID) getValue(1);
	}

	/**
	 * Setter for <code>public.push_notification_identifier.platform</code>. 
	 */
	public void setPlatform(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.push_notification_identifier.platform</code>. 
	 */
	public java.lang.String getPlatform() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.push_notification_identifier.profile_id</code>. 
	 */
	public void setProfileId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.push_notification_identifier.profile_id</code>. 
	 */
	public java.lang.Long getProfileId() {
		return (java.lang.Long) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.util.UUID, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.util.UUID, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER.PUSH_NOTIFICATION_IDENTIFIER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER.IDENTIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER.PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getPushNotificationIdentifierId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value2() {
		return getIdentifier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getProfileId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PushNotificationIdentifierRecord
	 */
	public PushNotificationIdentifierRecord() {
		super(com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER);
	}
}