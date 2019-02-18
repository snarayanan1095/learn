package lectures.part1basics

object WhatsAFunction extends App {

  // use functions as first class elements

  val doubler=new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element*2
  }

  println(doubler(2))     // using apply method- called like a function

  val stringtoIntConverter= new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringtoIntConverter("3")+4)

  val adder=new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int=a+b
  }

  // Function[A, B, B] is the same as (A,B) => B .....syntactic sugar

  //ALL SCALA FUNCTIONS ARE OBJECTS OR INSTANCES OF FUNCTION 1, FUNCTION2, ETC....

  def concat: (String, String) => String =new Function2[String, String, String] {
    override def apply(a: String, b: String): String= a+b
  }


  println(concat("Hello","Hi"))

  // function1[Int, Function1[Int, Int]

  val specialFunction: Function1[Int, Function1[Int, Int]] = new Function1[Int,Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply (y: Int): Int = x + y
  } // this specialFunction is called CURRIED function
  }

  println(specialFunction(3)(4))

}


trait MyFunction[A, B] {
  def apply(element: A): B  //apply method helps u call an object as if it were a method



}
