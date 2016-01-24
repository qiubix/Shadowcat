import akka.actor.{Terminated, ActorRef, Actor}

class Dispatcher extends Actor{
  var agents = List[(ActorRef)]()

  def receive = {
    case _ => println("default message")
  }

  def broadcast(msg: Msg) {
    agents.foreach(_ ! msg)
  }
}
