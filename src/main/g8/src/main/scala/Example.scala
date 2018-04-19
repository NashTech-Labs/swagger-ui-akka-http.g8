import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._

case class Example(system: ActorSystem) {
  val routes = path("ping") {
    get {
      complete(HttpResponse(OK, entity = "pong"))
    }
  }
}