package lectures.part1basics

object OO extends App{

  val counter =new Counter(0)
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


  class Writer(fname: String, lname:String, val year: Int ) {

    def fullname(fname: String, lname: String): String = fname + lname

  }

  class Novel(name: String, year: Int, author: Writer) {

    def authorAge(author: Writer, year: Int): Int=year-author.year

    def isWrittenBy(author: Writer)= author==this.author

    def copy(newyear: Int): Novel=new Novel(name,newyear,author )




  }

  class Counter(val count: Int) {
    def inc={
      println(" incrementing")
      new Counter(count+1)
    }

    def dec ={
      println("decrementing")
      new Counter(count-1)
    }

    def inc(n: Int): Counter={
      if(n<0) this
      else inc.inc(n-1)
    }

    def dec(n: Int): Counter={
      if(n<0) this
      else dec.dec(n-1)
    }

    def print= println(count)
  }

}
