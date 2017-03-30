import akka.actor.{Props, ActorSystem}
import akka.testkit.{TestActorRef, TestKit, DefaultTimeout, ImplicitSender}
import org.scalatest.{WordSpecLike, Matchers}

class DispatcherTest extends TestKit(ActorSystem("DispatcherTest")) with DefaultTimeout with ImplicitSender
with WordSpecLike with Matchers {


  "Dispatcher Actor" should {
    "connect computer" in {
//      val dispatcher = TestActorRef(Props(classOf[Dispatcher], testActor))
        val dispatcher = TestActorRef(new Dispatcher)
//      val dispatcher = system.actorOf(Props(classOf[Dispatcher], testActor))
      dispatcher.underlyingActor.getAgents should be(0)

      dispatcher ! Connect

//      val first = TestActorRef(new ComputerActor(dispatcher))
//      val second = TestActorRef(new ComputerActor(dispatcher))
//      dispatcher


    }
  }

}
