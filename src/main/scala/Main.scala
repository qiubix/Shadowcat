import akka.actor.{Props, ActorSystem}

object Main extends App {
  val system = ActorSystem("System")

  val dispatcher = system.actorOf(Props[Dispatcher])
  val a1 = system.actorOf(Props(new ComputerActor(dispatcher)))
  a1 ! doCalculations(1)

}
