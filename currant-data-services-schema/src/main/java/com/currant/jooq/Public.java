/**
 * This class is generated by jOOQ
 */
package com.currant.jooq;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1914890261;

	/**
	 * The singleton instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			com.currant.jooq.Sequences.CLUB_CLUB_ID_SEQ,
			com.currant.jooq.Sequences.CLUB_ICON_CLUB_ICON_ID_SEQ,
			com.currant.jooq.Sequences.CLUB_WALL_POST_CLUB_WALL_POST_ID_SEQ,
			com.currant.jooq.Sequences.CURRANT_USER_CURRANT_USER_ID_SEQ,
			com.currant.jooq.Sequences.EQUIPMENT_EQUIPMENT_ID_SEQ,
			com.currant.jooq.Sequences.GAME_GAME_ID_SEQ,
			com.currant.jooq.Sequences.PROFILE_PROFILE_ID_SEQ,
			com.currant.jooq.Sequences.PUSH_NOTIFICATION_IDENTIFIER_PUSH_NOTIFICATION_IDENTIFIER_I_SEQ,
			com.currant.jooq.Sequences.SPORT_SPORT_ID_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.currant.jooq.tables.Club.CLUB,
			com.currant.jooq.tables.ClubIcon.CLUB_ICON,
			com.currant.jooq.tables.ClubImage.CLUB_IMAGE,
			com.currant.jooq.tables.ClubProfileConnection.CLUB_PROFILE_CONNECTION,
			com.currant.jooq.tables.ClubSport.CLUB_SPORT,
			com.currant.jooq.tables.ClubWallPost.CLUB_WALL_POST,
			com.currant.jooq.tables.Connection.CONNECTION,
			com.currant.jooq.tables.CurrantUser.CURRANT_USER,
			com.currant.jooq.tables.Equipment.EQUIPMENT,
			com.currant.jooq.tables.Game.GAME,
			com.currant.jooq.tables.GameEquipment.GAME_EQUIPMENT,
			com.currant.jooq.tables.GameImage.GAME_IMAGE,
			com.currant.jooq.tables.GameProfileConnection.GAME_PROFILE_CONNECTION,
			com.currant.jooq.tables.GameProfileStarred.GAME_PROFILE_STARRED,
			com.currant.jooq.tables.Profile.PROFILE,
			com.currant.jooq.tables.ProfileSport.PROFILE_SPORT,
			com.currant.jooq.tables.PushNotificationIdentifier.PUSH_NOTIFICATION_IDENTIFIER,
			com.currant.jooq.tables.Sport.SPORT,
			com.currant.jooq.tables.SportEquipment.SPORT_EQUIPMENT);
	}
}
