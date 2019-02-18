package lectures.part1basics

object AnonymousFunctions extends App {


  val doubler= new Function1[Int, Int] {
    override def apply(x: Int) = x * 2
  }

  //the above doubler function can be written as ANONYMOUS FUNCTION- LAMBDA
  val doubler1 = (x: Int) => x*2


  println(doubler(4))
  println(doubler1(5))

}
