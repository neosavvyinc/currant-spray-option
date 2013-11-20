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
public class GameEquipmentRecord extends org.jooq.impl.TableRecordImpl<com.currant.jooq.tables.records.GameEquipmentRecord> implements org.jooq.Record6<java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Integer> {

	private static final long serialVersionUID = 1196435549;

	/**
	 * Setter for <code>public.game_equipment.game_id</code>. 
	 */
	public void setGameId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.game_equipment.game_id</code>. 
	 */
	public java.lang.Long getGameId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.game_equipment.equipment_id</code>. 
	 */
	public void setEquipmentId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.game_equipment.equipment_id</code>. 
	 */
	public java.lang.Long getEquipmentId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.game_equipment.amount</code>. 
	 */
	public void setAmount(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.game_equipment.amount</code>. 
	 */
	public java.lang.Integer getAmount() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.game_equipment.claimed</code>. 
	 */
	public void setClaimed(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.game_equipment.claimed</code>. 
	 */
	public java.lang.Boolean getClaimed() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>public.game_equipment.claimed_by_profile_id</code>. 
	 */
	public void setClaimedByProfileId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.game_equipment.claimed_by_profile_id</code>. 
	 */
	public java.lang.Long getClaimedByProfileId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>public.game_equipment.sort_order</code>. 
	 */
	public void setSortOrder(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.game_equipment.sort_order</code>. 
	 */
	public java.lang.Integer getSortOrder() {
		return (java.lang.Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.GAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.EQUIPMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.CLAIMED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.CLAIMED_BY_PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT.SORT_ORDER;
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
		return getEquipmentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getClaimed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getClaimedByProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getSortOrder();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GameEquipmentRecord
	 */
	public GameEquipmentRecord() {
		super(com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT);
	}
}