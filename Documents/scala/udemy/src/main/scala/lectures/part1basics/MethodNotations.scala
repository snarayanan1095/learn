package lectures.part1basics

object MethodNotations extends App {

  class Person(val name: String, age: Int, favMovie: String) {
    def likes(movie: String): Boolean= movie==favMovie
    def +(person: Person) : String= s"${this.name} is hanging out with ${person.name}" // method name can be +
    def unary_! : String=s"$name what the heck!!" // always put a space between method name and : so that the compiler doesnt think : is a part of the method
    def isAlive : Boolean=true
    def apply() : String = s"Hi my name is $name and i like $favMovie"
    def +(name: Person, nickname: String) : String= s"${this.name} is a ($nickname)"
    def unary_+ : Int= (age+1)
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala = this learns "scala" // calls the learns method
    def apply(num: Int) : String=s"$name watched their $favMovie $num times"
  }

  val mary=new Person("Mary", 22,"Inception")
  println(mary.likes("Inception")) // this and the next is the same
  println(mary likes "Inception")   // infix notiation/ operator notation- works only with methods that have one parameter(Syntactic sugar)
  val tom=new Person("Tom", 15,"Fight club")
  println(mary+ tom) // same as mary.+(tom)
  println(1+2) // same as 1.+2 // this proves that all operators are methods as well


  // prefix notation
  val x = -1  // prefix notation
  val y= 1.unary_- // same as -1 ....// called unary operator
// unary_ prefix works only with -,+,~,! operators
println(!mary) // equivalent to mary.unary_!
  println(mary.unary_!) // these two are the same!!!!

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive) //postfix notation - can be used with functions without parameters

  //apply
  println(mary.apply())
  println(mary()) //equivalent to apply() // whenever a method is called like this compiler looks for the apply method in the class defn

  println(mary.+(mary,"the rockstar"))

  println(+mary)
  println(mary learns("scala"))
  println(mary learnsScala)
  println(mary.apply(3))




}
