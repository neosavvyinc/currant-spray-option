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
public class ProfileRecord extends org.jooq.impl.UpdatableRecordImpl<com.currant.jooq.tables.records.ProfileRecord> implements org.jooq.Record18<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String> {

	private static final long serialVersionUID = -1670996430;

	/**
	 * Setter for <code>public.profile.profile_id</code>. 
	 */
	public void setProfileId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.profile.profile_id</code>. 
	 */
	public java.lang.Long getProfileId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.profile.currant_user_id</code>. 
	 */
	public void setCurrantUserId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.profile.currant_user_id</code>. 
	 */
	public java.lang.Long getCurrantUserId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.profile.source</code>. 
	 */
	public void setSource(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.profile.source</code>. 
	 */
	public java.lang.String getSource() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.profile.source_identifier</code>. 
	 */
	public void setSourceIdentifier(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.profile.source_identifier</code>. 
	 */
	public java.lang.String getSourceIdentifier() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.profile.first_name</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.profile.first_name</code>. 
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.profile.last_name</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.profile.last_name</code>. 
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.profile.image_url</code>. 
	 */
	public void setImageUrl(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.profile.image_url</code>. 
	 */
	public java.lang.String getImageUrl() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.profile.bio</code>. 
	 */
	public void setBio(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.profile.bio</code>. 
	 */
	public java.lang.String getBio() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.profile.city</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.profile.city</code>. 
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>public.profile.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.profile.state</code>. 
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>public.profile.country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.profile.country</code>. 
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>public.profile.profile_level</code>. 
	 */
	public void setProfileLevel(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.profile.profile_level</code>. 
	 */
	public java.lang.String getProfileLevel() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>public.profile.preferred_time</code>. 
	 */
	public void setPreferredTime(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>public.profile.preferred_time</code>. 
	 */
	public java.lang.String getPreferredTime() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>public.profile.location_enabled</code>. 
	 */
	public void setLocationEnabled(java.lang.Boolean value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>public.profile.location_enabled</code>. 
	 */
	public java.lang.Boolean getLocationEnabled() {
		return (java.lang.Boolean) getValue(13);
	}

	/**
	 * Setter for <code>public.profile.new_game_notification</code>. 
	 */
	public void setNewGameNotification(java.lang.Boolean value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>public.profile.new_game_notification</code>. 
	 */
	public java.lang.Boolean getNewGameNotification() {
		return (java.lang.Boolean) getValue(14);
	}

	/**
	 * Setter for <code>public.profile.friend_activity_notification</code>. 
	 */
	public void setFriendActivityNotification(java.lang.Boolean value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>public.profile.friend_activity_notification</code>. 
	 */
	public java.lang.Boolean getFriendActivityNotification() {
		return (java.lang.Boolean) getValue(15);
	}

	/**
	 * Setter for <code>public.profile.news_promotions_notification</code>. 
	 */
	public void setNewsPromotionsNotification(java.lang.Boolean value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>public.profile.news_promotions_notification</code>. 
	 */
	public java.lang.Boolean getNewsPromotionsNotification() {
		return (java.lang.Boolean) getValue(16);
	}

	/**
	 * Setter for <code>public.profile.payment_receipt</code>. 
	 */
	public void setPaymentReceipt(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>public.profile.payment_receipt</code>. 
	 */
	public java.lang.String getPaymentReceipt() {
		return (java.lang.String) getValue(17);
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
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String> fieldsRow() {
		return (org.jooq.Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String> valuesRow() {
		return (org.jooq.Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.Profile.PROFILE.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.currant.jooq.tables.Profile.PROFILE.CURRANT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.currant.jooq.tables.Profile.PROFILE.SOURCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.currant.jooq.tables.Profile.PROFILE.SOURCE_IDENTIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.currant.jooq.tables.Profile.PROFILE.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.currant.jooq.tables.Profile.PROFILE.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.currant.jooq.tables.Profile.PROFILE.IMAGE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.currant.jooq.tables.Profile.PROFILE.BIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.currant.jooq.tables.Profile.PROFILE.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.currant.jooq.tables.Profile.PROFILE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.currant.jooq.tables.Profile.PROFILE.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.currant.jooq.tables.Profile.PROFILE.PROFILE_LEVEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.currant.jooq.tables.Profile.PROFILE.PREFERRED_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field14() {
		return com.currant.jooq.tables.Profile.PROFILE.LOCATION_ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field15() {
		return com.currant.jooq.tables.Profile.PROFILE.NEW_GAME_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field16() {
		return com.currant.jooq.tables.Profile.PROFILE.FRIEND_ACTIVITY_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field17() {
		return com.currant.jooq.tables.Profile.PROFILE.NEWS_PROMOTIONS_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return com.currant.jooq.tables.Profile.PROFILE.PAYMENT_RECEIPT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getCurrantUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSource();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getSourceIdentifier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getImageUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getBio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getProfileLevel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getPreferredTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value14() {
		return getLocationEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value15() {
		return getNewGameNotification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value16() {
		return getFriendActivityNotification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value17() {
		return getNewsPromotionsNotification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getPaymentReceipt();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProfileRecord
	 */
	public ProfileRecord() {
		super(com.currant.jooq.tables.Profile.PROFILE);
	}
}