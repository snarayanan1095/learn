package part2

object LazyEvaluation extends App {

  lazy val x: Int =throw new RuntimeException
}
