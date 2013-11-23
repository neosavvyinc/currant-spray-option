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
                             salt : String,
                             password : String,
                             accountStatus : CurrantUserStatus,
                             subscriberType :String ,
                             active :Boolean)

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

case object Facebook extends ProfileSource
case object Currant extends ProfileSource


sealed trait ProfileLevel

case object Standard extends ProfileLevel
case object Elite extends ProfileLevel

//todo: time of day

case class Profile()