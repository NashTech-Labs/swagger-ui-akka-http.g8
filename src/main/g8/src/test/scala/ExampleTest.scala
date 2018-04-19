import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}

class ExampleTest extends WordSpec with Matchers with ScalatestRouteTest {
  private val example = Example(system)

  "Example" should {

    "be able to get response from the running environment" in {
      Get("/ping") ~> example.routes ~> check {
        responseAs[String] should include("pong")
      }
    }
  }
}
