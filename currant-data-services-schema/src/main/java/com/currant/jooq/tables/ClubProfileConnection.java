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
public class ClubProfileConnection extends org.jooq.impl.TableImpl<com.currant.jooq.tables.records.ClubProfileConnectionRecord> {

	private static final long serialVersionUID = -335367471;

	/**
	 * The singleton instance of <code>public.club_profile_connection</code>
	 */
	public static final com.currant.jooq.tables.ClubProfileConnection CLUB_PROFILE_CONNECTION = new com.currant.jooq.tables.ClubProfileConnection();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.currant.jooq.tables.records.ClubProfileConnectionRecord> getRecordType() {
		return com.currant.jooq.tables.records.ClubProfileConnectionRecord.class;
	}

	/**
	 * The column <code>public.club_profile_connection.club_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ClubProfileConnectionRecord, java.lang.Long> CLUB_ID = createField("club_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.club_profile_connection.profile_id</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ClubProfileConnectionRecord, java.lang.Long> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.club_profile_connection.status</code>. 
	 */
	public final org.jooq.TableField<com.currant.jooq.tables.records.ClubProfileConnectionRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * Create a <code>public.club_profile_connection</code> table reference
	 */
	public ClubProfileConnection() {
		super("club_profile_connection", com.currant.jooq.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.club_profile_connection</code> table reference
	 */
	public ClubProfileConnection(java.lang.String alias) {
		super(alias, com.currant.jooq.Public.PUBLIC, com.currant.jooq.tables.ClubProfileConnection.CLUB_PROFILE_CONNECTION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.currant.jooq.tables.records.ClubProfileConnectionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.currant.jooq.tables.records.ClubProfileConnectionRecord>>asList(com.currant.jooq.Keys.CLUB_PROFILE_CONNECTION_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.currant.jooq.tables.records.ClubProfileConnectionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.currant.jooq.tables.records.ClubProfileConnectionRecord, ?>>asList(com.currant.jooq.Keys.CLUB_PROFILE_CONNECTION__CLUB_PROFILE_CONNECTION_CLUB_ID_FKEY, com.currant.jooq.Keys.CLUB_PROFILE_CONNECTION__CLUB_PROFILE_CONNECTION_PROFILE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.currant.jooq.tables.ClubProfileConnection as(java.lang.String alias) {
		return new com.currant.jooq.tables.ClubProfileConnection(alias);
	}
}
