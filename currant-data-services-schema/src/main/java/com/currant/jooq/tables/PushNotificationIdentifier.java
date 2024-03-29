/**
 * This class is generated by jOOQ
 */
package com.currant.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PushNotificationIdentifier extends org.jooq.impl.TableImpl<com.currant.jooq.tables.records.PushNotificationIdentifierRecord> {

	private static final long serialVersionUID = -751510176;

	/**
	 * The singleton instance of <code>public.push_notification_identifier</code>
	 */
	public static final com.currant.jooq.tables.PushNotificationIdentifier PUSH_NOTIFICATION_IDENTIFIER = new com.currant.jooq.tables.PushNotificationIdentifier();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.currant.jooq.tables.records.PushNotificationIdentifierRecord> getRecordType() {
		return com.currant.jooq.tables.records.PushNotificationIdentifierRecord.class;
	}

	/**
	 * The column <code>public.push_notification_identifier.push_notification_identifier_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, java.lang.Long> PUSH_NOTIFICATION_IDENTIFIER_ID = createField("push_notification_identifier_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.push_notification_identifier.identifier</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, java.util.UUID> IDENTIFIER = createField("identifier", org.jooq.impl.SQLDataType.UUID, this);

	/**
	 * The column <code>public.push_notification_identifier.platform</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, java.lang.String> PLATFORM = createField("platform", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.push_notification_identifier.profile_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, java.lang.Long> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>public.push_notification_identifier</code> table reference
	 */
	public PushNotificationIdentifier() {
		super("push_notification_identifier", com.currant.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.push_notification_identifier</code> table reference
	 */
	public PushNotificationIdentifier(java.lang.String alias) {
		super(alias, com.currant.jooq.Public.PUBLIC, com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, java.lang.Long> getIdentity() {
		return com.currant.jooq.Keys.IDENTITY_PUSH_NOTIFICATION_IDENTIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.currant.jooq.tables.records.PushNotificationIdentifierRecord> getPrimaryKey() {
		return com.currant.jooq.Keys.PUSH_NOTIFICATION_IDENTIFIER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.currant.jooq.tables.records.PushNotificationIdentifierRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.currant.jooq.tables.records.PushNotificationIdentifierRecord>>asList(com.currant.jooq.Keys.PUSH_NOTIFICATION_IDENTIFIER_PKEY, com.currant.jooq.Keys.PUSH_NOTIFICATION_IDENTIFIER_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.currant.jooq.tables.records.PushNotificationIdentifierRecord, ?>>asList(com.currant.jooq.Keys.PUSH_NOTIFICATION_IDENTIFIER__PUSH_NOTIFICATION_IDENTIFIER_PROFILE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.currant.jooq.tables.PushNotificationIdentifier as(java.lang.String alias) {
		return new com.currant.jooq.tables.PushNotificationIdentifier(alias);
	}
}
