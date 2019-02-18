package lectures.part1basics

object StringOps extends App{

val str: String="Hello I am learning scala"
  println(str.split("l").toList)

  val a="45"
  val b=a.toInt
  println(b/5)
  println('a'+:a) //prepending


}
