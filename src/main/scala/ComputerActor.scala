import akka.actor._

import scala.concurrent.forkjoin.ForkJoinPool
import scala.concurrent.{ExecutionContext, Future}

class ComputerActor(dispatcher: ActorRef) extends Actor{

  def receive = {
    case doCalculations(data: Int) => {
        val calculatedResult = data + 1
        dispatcher ! calculatedResult
    }
    case _ => print("do nothing")
  }
}
