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
public class GameRecord extends org.jooq.impl.UpdatableRecordImpl<com.currant.jooq.tables.records.GameRecord> implements org.jooq.Record17<java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 1739803776;

	/**
	 * Setter for <code>public.game.game_id</code>. 
	 */
	public void setGameId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.game.game_id</code>. 
	 */
	public java.lang.Long getGameId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.game.sport_id</code>. 
	 */
	public void setSportId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.game.sport_id</code>. 
	 */
	public java.lang.Long getSportId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.game.visibility</code>. 
	 */
	public void setVisibility(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.game.visibility</code>. 
	 */
	public java.lang.String getVisibility() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.game.club_id</code>. 
	 */
	public void setClubId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.game.club_id</code>. 
	 */
	public java.lang.Long getClubId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>public.game.location</code>. 
	 */
	public void setLocation(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.game.location</code>. 
	 */
	public java.lang.String getLocation() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.game.gps_coordinates</code>. 
	 */
	public void setGpsCoordinates(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.game.gps_coordinates</code>. 
	 */
	public java.lang.String getGpsCoordinates() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.game.byof</code>. 
	 */
	public void setByof(java.lang.Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.game.byof</code>. 
	 */
	public java.lang.Boolean getByof() {
		return (java.lang.Boolean) getValue(6);
	}

	/**
	 * Setter for <code>public.game.game_time</code>. 
	 */
	public void setGameTime(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.game.game_time</code>. 
	 */
	public java.sql.Timestamp getGameTime() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>public.game.size</code>. 
	 */
	public void setSize(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.game.size</code>. 
	 */
	public java.lang.Integer getSize() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.game.intensity</code>. 
	 */
	public void setIntensity(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.game.intensity</code>. 
	 */
	public java.lang.String getIntensity() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>public.game.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.game.description</code>. 
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>public.game.status</code>. 
	 */
	public void setStatus(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.game.status</code>. 
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>public.game.image_url</code>. 
	 */
	public void setImageUrl(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>public.game.image_url</code>. 
	 */
	public java.lang.String getImageUrl() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>public.game.active</code>. 
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>public.game.active</code>. 
	 */
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(13);
	}

	/**
	 * Setter for <code>public.game.min_players</code>. 
	 */
	public void setMinPlayers(java.lang.Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>public.game.min_players</code>. 
	 */
	public java.lang.Integer getMinPlayers() {
		return (java.lang.Integer) getValue(14);
	}

	/**
	 * Setter for <code>public.game.max_players</code>. 
	 */
	public void setMaxPlayers(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>public.game.max_players</code>. 
	 */
	public java.lang.Integer getMaxPlayers() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>public.game.waitlist_strategy</code>. 
	 */
	public void setWaitlistStrategy(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>public.game.waitlist_strategy</code>. 
	 */
	public java.lang.String getWaitlistStrategy() {
		return (java.lang.String) getValue(16);
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
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.Game.GAME.GAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.currant.jooq.tables.Game.GAME.SPORT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.currant.jooq.tables.Game.GAME.VISIBILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.currant.jooq.tables.Game.GAME.CLUB_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.currant.jooq.tables.Game.GAME.LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.currant.jooq.tables.Game.GAME.GPS_COORDINATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return com.currant.jooq.tables.Game.GAME.BYOF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return com.currant.jooq.tables.Game.GAME.GAME_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return com.currant.jooq.tables.Game.GAME.SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.currant.jooq.tables.Game.GAME.INTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.currant.jooq.tables.Game.GAME.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.currant.jooq.tables.Game.GAME.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.currant.jooq.tables.Game.GAME.IMAGE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field14() {
		return com.currant.jooq.tables.Game.GAME.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field15() {
		return com.currant.jooq.tables.Game.GAME.MIN_PLAYERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return com.currant.jooq.tables.Game.GAME.MAX_PLAYERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return com.currant.jooq.tables.Game.GAME.WAITLIST_STRATEGY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getGameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getSportId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getVisibility();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getClubId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getGpsCoordinates();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getByof();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getGameTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getIntensity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getImageUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value14() {
		return getActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value15() {
		return getMinPlayers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getMaxPlayers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getWaitlistStrategy();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GameRecord
	 */
	public GameRecord() {
		super(com.currant.jooq.tables.Game.GAME);
	}
}
