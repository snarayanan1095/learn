package lectures.part1basics

object CaseClasses extends App {

  //case classes are used for defining class with minimal hassle

  case class Person(name: String, age: Int) // class parameters are promoted to fields

  val jim= new Person("Jim", 23)

  println(jim.name)     // this can be done because case class parameters act like fields

  println(jim.toString) // easier usage of .toString representation

  println(jim)  // same as .toString method- prints as it is- syntactic sugar

  //equals and hashcode implementation

  val jim2= new Person("Jim", 23)

  println(jim==jim2)  // inbuilt equals method that can compare two objects- for case classes

  // case classes have handy copy methods

  val jim3=jim.copy() // .copy method creates a new instance of the case class

  val jim4=jim.copy(age=45) // can change the age while copying

  println(jim4)

  val thePerson= Person // case classes have companion objects

  val mary=Person("Mary", 23)   // case class inbuilt apply method- not use new keyword

  // case classes are serializable - akka

  // case classes have extractor patterns- they can be used in pattern matching

  case object UnitedKingdom {
    def name: String =" The UK "  //same as case classes except for they are their own companion objects so they dont hget companion objects
  }









}
