package lectures.part1basics

object AbstractDataTypes extends App {

  abstract class Animal {   // same like java- left incomplete //abstract class cannot be instantiated
    val creatureType: String="wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = print("crunch crunch") // override keyword is not mandatory for abstract members

  }

  //traits
  trait Carnivore {
    def eat(animal: Animal) :Unit
    val preferredMeal: String="fresh meat"
  }


  //can use how many ever traits as wanted
  class Crocodile extends Animal with Carnivore { //crocodile inherits memebers from both animal and carnivore
    val CreatureType: String="croc"
    def eat: Unit="nomnom"
    def eat(animal: Animal): Unit=println(s"I am a croc and I'm eating ${animal.creatureType}")
  }

  val dog=new Dog
  val croc=new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  //1. traits do not have constructor parameters -- cant have trait Carnivore(name:String)
  //2. multiple traits may b inherited by one class but only single class inheritance
  //3. traits=behavior, abstract class=thing




}
