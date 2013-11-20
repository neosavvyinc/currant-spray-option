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
public class GameImageRecord extends org.jooq.impl.TableRecordImpl<com.currant.jooq.tables.records.GameImageRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 510735027;

	/**
	 * Setter for <code>public.game_image.game_id</code>. 
	 */
	public void setGameId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.game_image.game_id</code>. 
	 */
	public java.lang.Long getGameId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.game_image.image_url</code>. 
	 */
	public void setImageUrl(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.game_image.image_url</code>. 
	 */
	public java.lang.String getImageUrl() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.game_image.sort_order</code>. 
	 */
	public void setSortOrder(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.game_image.sort_order</code>. 
	 */
	public java.lang.Integer getSortOrder() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.currant.jooq.tables.GameImage.GAME_IMAGE.GAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.currant.jooq.tables.GameImage.GAME_IMAGE.IMAGE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.currant.jooq.tables.GameImage.GAME_IMAGE.SORT_ORDER;
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
	public java.lang.String value2() {
		return getImageUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getSortOrder();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GameImageRecord
	 */
	public GameImageRecord() {
		super(com.currant.jooq.tables.GameImage.GAME_IMAGE);
	}
}