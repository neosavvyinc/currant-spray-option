package com.currant.ds



object QueryReader {

  def fromFile(file : String) : Seq[String] = {
    val resource = io.Source.fromURL(getClass.getResource(file)).toString
    println("resoure: " + resource)
    resource.replaceAll("\\n", "").split(";")

  }

}