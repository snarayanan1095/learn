package lectures.part1basics

object functions extends App {

  def bigFunction(n:Int): Int = {
    def smallfunction(a: Int, b: Int): Int = a + b

    smallfunction(n, n-1)
  }

  //println(bigFunction(4))


  def greeting(name:String, age: Int): String={
    s"Hi, my name is $name and I am $age years old"
  }

  //println(greeting("Shwetha",22 ))

  def factorial(n: BigInt): BigInt={
    if(n<=0)  1

    else { println("iteraction" + n)
      n*factorial(n-1)
    }
  }

  //println(factorial(56))

  def isPrime(n: Int): Boolean={
    def miniprime(t: Int): Boolean=
      if(t<=1) true
      else n%t!=0 && miniprime(t-1)

    miniprime(n/2)
  }

 // println(isPrime(3459))


  def facthelp(x: Int, accumulator: BigInt): BigInt= {
    if(x<=1) accumulator

    else {
      println("iteraction" + x + " yo " + accumulator)
      facthelp(x - 1, x * accumulator)
    }
  }


  //println(facthelp(55,1))

  def stringconcat(x: String, n: Int, a: String): String= {
    if(n<1) a
    else stringconcat(x,n-1,a+x)
  }

  println(stringconcat("hello",3,""))

  def isPrime1(n:Int) : Boolean={
    def isPrimetail(t: Int, accum: Boolean) : Boolean={
      if(!accum) false
      else if(t<=1) true
      else isPrimetail(t-1, n%t!=0 && accum)


    }
    isPrimetail(n/2,true)
  }

println(isPrime1(23))

}

