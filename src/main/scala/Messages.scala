import akka.actor.ActorRef

abstract class Msg

case class doCalculations(data: Int) extends Msg

