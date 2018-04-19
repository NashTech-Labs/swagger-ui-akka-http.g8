import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import swagger.Swagger

import scala.io.StdIn

object Boot {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("my-actor-system")
    implicit val materializer = ActorMaterializer()

    implicit val executionContext = system.dispatcher

    val routes = Example(system).routes ~ Swagger(system).routes ~
      getFromResourceDirectory("swagger-ui")

    val bindingFuture = Http().bindAndHandle(routes, "0.0.0.0", 8080)

    println("Application has started on port 8080")

    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }

}