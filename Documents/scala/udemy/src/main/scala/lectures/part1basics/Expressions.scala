package lectures.part1basics

object Expressions extends App {

  val x=1+2;
  var y=3
 // println(x)
  //priority order: + - * / & | ^ << >>  >>>(right shift with zero extension)

  val acondition=true
  val aconditionvalue=if(acondition) 5 else 3 //
  //println(aconditionvalue)


  var i=0
  while(i<10) {
    //println(i)
    i+=1
  }

  val somevalue=(y=5)
  println(somevalue)

}
