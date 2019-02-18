package lectures.part1basics

object Objects extends App {

  object Person { // class level functionality
    val N_EYES=2
    def canFly: Boolean=false
    def from(mother:Person, father: Person) : Person=new Person("Boobie") //factory method-uses persons
  }

  //having same name for class and object - class and object are called companions
  class Person (val name: String){  // instance level functionality

  }

 // def main(args: Array[String]) :Unit     // this is like main mathod(can be used instead of extends App
  // unit(scala)=static(java)
  println(Person.N_EYES)
  println(Person.canFly)  //scala object-singleton= when new instances are created both will point to the same location unlike in java where each new instance created points to a diff location

  //Ex:

  val mary=Person     // using new will create a new instance at a diff mem location, not using new points to same location
  val tom=  Person
  println(mary==tom) // returns true since both point to the same location

  //val bobbie=Person(mary,tom) // singleton object- like apply method - refers to from method- usage of factory method

  //scala application






}
