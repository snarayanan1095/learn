package lectures.part1basics

object AnonymousFunctions extends App {


  val doubler= new Function1[Int, Int] {
    override def apply(x: Int) = x * 2
  }

  //the above doubler function can be written as ANONYMOUS FUNCTION- LAMBDA
  val doubler1 = (x: Int) => x*2

  val adder: (Int, Int) => Int =(a: Int, b: Int) => a+b

  val justdosomething: () => Int = () => 3

  val moaradder: (Int, Int) => Int = _+_

  val superadd = (x: Int) => (y: Int) => x+y


  println(justdosomething)
  println(justdosomething())
  println(moaradder(2,4))
  println(superadd(2)(3))


  println(doubler(4))
  println(doubler1(5))

}
