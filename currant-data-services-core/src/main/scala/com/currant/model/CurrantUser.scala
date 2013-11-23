package com.currant.model


/*
 firstName: "",
#   lastName: "",
#   password: "",
#   email, "",
#   favoriteTimeToPlay, ""
#   favoriteSports: [sportId1, sportId2, sportId3] //must be at least 1, no more than 3
#   facebookId: ""
 */

case class CurrantUserRegistration(firstName : String,
                                   lastName : String,
                                   password : String,
                                   email : String,
                                   favoriteTimeToPlay : String,
                                   favoriteSports : Seq[Long],
                                   facebookId : Option[String])

case class CurrantUserInsert(email : String,
                             saltyHash : String,
                             accountStatus : CurrantUserStatus,
                             subscriberType :String ,
                             active :Boolean)

/*
profile: {
       source: "",//read only
       source_identifier: "",//read only ???
       first: ""
       last: ""
       image: ""
       bio: ""
       city: ""
       state: ""
       country: ""
       profile_level: "",//read only
       preferred_time: ""
       location_enabled: ""
       new_game_notification: ""
       friend_activity_notification: ""
       news_promotions_notification: ""
   },
 */
case class Profile(id : Long,
                   userId : Long,
                   source : ProfileSource,
                   sourceIdentifier : String,
                   firstName : String,
                   lastName: String,
                   image : String,
                   bio : String,
                   city : String,
                   state : String,
                   country : String,
                   profileLevel : ProfileLevel,
                   preferredTime : ProfileTime,
                   locationEnabled : Boolean,
                   newGameNotificationEnabled : Boolean,
                   friendActivityNotificationEnabled : Boolean,
                   newsPromotionsNotificationEnabled : Boolean)

/*
extendedProfile: {
   number_of_clubs: "",//read only
   number_of_friends: "",//read only
   number_of_checkins: "",//read only
   number_of_games_joined: "",//read only
   number_of_games_created: "",//read only
   number_of_games_saved: "",//read only
}
 */
case class ExtendedProfile(numberOfClubs : Long,
                           numberOfFriends : Long,
                           numberOfCheckins : Long,
                           numberOfGamesJoined : Long,
                           numberOfGamesCreated : Long,
                           numberOfGamesSaved : Long)

case class ProfileInsert(userId : Long,
                         source : ProfileSource,
                         sourceIdentifier : String,
                         firstName : String,
                         lastName : String,
                         profileLevel : ProfileLevel,
                         preferredTime : String)

case class InsertResponse(userId : Long, profileId : Long)

sealed trait CurrantUserStatus

case object Active extends CurrantUserStatus
case object Disabled extends CurrantUserStatus
//etc

sealed trait ProfileSource

case class Facebook() extends ProfileSource
case class Currant() extends ProfileSource


trait ProfileLevel

case class Standard() extends ProfileLevel
case class Elite() extends ProfileLevel

trait ProfileTime

case class EarlyMorning() extends ProfileTime
case class Morning() extends ProfileTime
case class Day() extends ProfileTime
case class Evening() extends ProfileTime
case class Night() extends ProfileTime