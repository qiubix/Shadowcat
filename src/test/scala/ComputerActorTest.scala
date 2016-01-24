import akka.actor.ActorSystem
import akka.actor.Status.Success
import org.scalatest._
import akka.testkit.{ImplicitSender, DefaultTimeout, TestKit, TestActorRef}
import scala.concurrent.duration._
import scala.concurrent.Await
import akka.pattern.ask

class ComputerActorTest extends TestKit(ActorSystem("ComputerActorTest")) with DefaultTimeout with ImplicitSender
with WordSpecLike with Matchers {

  val firstActorRef = TestActorRef(new ComputerActor(testActor))

  "Computer Actor" should {
    "add 1 to received data" in {
      within(500 millis) {
        firstActorRef ! doCalculations(1)
        expectMsg(2)
      }
    }
  }

}
