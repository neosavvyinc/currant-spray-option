package com.currant.ds.framework

import spray.httpx.marshalling.{ ToResponseMarshallingContext, ToResponseMarshaller }
import scala.concurrent.{ ExecutionContext, Future }
import spray.http.ContentTypes._
import spray.http.{ HttpEntity, HttpResponse }
import spray.http.StatusCodes.OK
import spray.json._

package object httpx {

  private[httpx]type JF[T] = JsonFormat[T]

  trait CurrantResponseMarshaller {

    implicit def currantResponse[T](implicit ec : ExecutionContext, format : JF[T]) = new CurrantResponse[T]
  }

  trait CurrantJsonProtocol extends DefaultJsonProtocol {
    implicit val failureFormat = jsonFormat3(Failure)
  }

  class CurrantResponse[T](implicit ec : ExecutionContext, format : JF[T]) extends ToResponseMarshaller[Future[T]] with CurrantJsonProtocol {

    def apply(value : Future[T], ctx : ToResponseMarshallingContext) : Unit = {

      value.onSuccess {
        case result => ctx.marshalTo(HttpResponse(OK, HttpEntity(`application/json`, format.write(result).compactPrint)))
      }

      value.onFailure {
        case throwable : Throwable => ctx.marshalTo(HttpResponse(OK, HttpEntity(`application/json`, toJson(throwable).compactPrint)))
      }
    }

    private def toJson(t : Throwable) = {
      val f = Failure(1, t.getMessage, "display")
      failureFormat.write(f)
    }
  }

  case class Failure(errorCode : Int, errorMessage : String, displayError : String)

}