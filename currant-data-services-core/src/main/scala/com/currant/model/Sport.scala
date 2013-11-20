package com.currant.model

/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/16/13
 * Time: 3:08 PM
 */

case class SportCreateRequest(name : String,
                              description : String,
                              active : Boolean,
                              imageUrl: Option[String],
                              minPlayers: Option[Int],
                              maxPlayers: Option[Int],
                              waitList: Option[Int])

case class Sport(id: Long,
                 name: String,
                 description: String,
                 active: Boolean,
                 imageUrl: Option[String],
                 minPlayers: Option[Int],
                 maxPlayers: Option[Int],
                 waitList: Option[Int])

object Sport {

  def from(id : Long, cr : SportCreateRequest) : Sport = {
    Sport(id, cr.name, cr.description, cr.active, cr.imageUrl, cr.minPlayers, cr.maxPlayers, cr.waitList)
  }
}