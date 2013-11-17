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
public class Profile extends org.jooq.impl.TableImpl<com.currant.jooq.tables.records.ProfileRecord> {

	private static final long serialVersionUID = 1372669787;

	/**
	 * The singleton instance of <code>public.profile</code>
	 */
	public static final com.currant.jooq.tables.Profile PROFILE = new com.currant.jooq.tables.Profile();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.currant.jooq.tables.records.ProfileRecord> getRecordType() {
		return com.currant.jooq.tables.records.ProfileRecord.class;
	}

	/**
	 * The column <code>public.profile.profile_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Long> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.profile.currant_user_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Long> CURRANT_USER_ID = createField("currant_user_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.profile.source</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.profile.source_identifier</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> SOURCE_IDENTIFIER = createField("source_identifier", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.profile.first_name</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>public.profile.last_name</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>public.profile.image_url</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>public.profile.bio</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> BIO = createField("bio", org.jooq.impl.SQLDataType.VARCHAR.length(140), this);

	/**
	 * The column <code>public.profile.city</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>public.profile.state</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>public.profile.country</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>public.profile.profile_level</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> PROFILE_LEVEL = createField("profile_level", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.profile.preferred_time</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> PREFERRED_TIME = createField("preferred_time", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>public.profile.location_enabled</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Boolean> LOCATION_ENABLED = createField("location_enabled", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.profile.new_game_notification</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Boolean> NEW_GAME_NOTIFICATION = createField("new_game_notification", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.profile.friend_activity_notification</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Boolean> FRIEND_ACTIVITY_NOTIFICATION = createField("friend_activity_notification", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.profile.news_promotions_notification</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.Boolean> NEWS_PROMOTIONS_NOTIFICATION = createField("news_promotions_notification", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>public.profile.payment_receipt</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ProfileRecord, java.lang.String> PAYMENT_RECEIPT = createField("payment_receipt", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * Create a <code>public.profile</code> table reference
	 */
	public Profile() {
		super("profile", com.currant.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.profile</code> table reference
	 */
	public Profile(java.lang.String alias) {
		super(alias, com.currant.jooq.Public.PUBLIC, com.currant.jooq.tables.Profile.PROFILE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.currant.jooq.tables.records.ProfileRecord, java.lang.Long> getIdentity() {
		return com.currant.jooq.Keys.IDENTITY_PROFILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.currant.jooq.tables.records.ProfileRecord> getPrimaryKey() {
		return com.currant.jooq.Keys.PROFILE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.currant.jooq.tables.records.ProfileRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.currant.jooq.tables.records.ProfileRecord>>asList(com.currant.jooq.Keys.PROFILE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.currant.jooq.tables.records.ProfileRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.currant.jooq.tables.records.ProfileRecord, ?>>asList(com.currant.jooq.Keys.PROFILE__PROFILE_CURRANT_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.currant.jooq.tables.Profile as(java.lang.String alias) {
		return new com.currant.jooq.tables.Profile(alias);
	}
}
