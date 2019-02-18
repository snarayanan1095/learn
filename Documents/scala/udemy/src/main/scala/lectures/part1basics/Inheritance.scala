package lectures.part1basics

object Inheritance extends App{

  //single class inheritance. can extend only one class at a time- using extends
  class Animal {

    val creatureType="wild"
    def eat=println("nomnomnom") // if this method is made private, the eat method cant be accessed outside this class
  }                                             // same rules for protected and public
                                                //no modifier default means public

  class Cat extends Animal{
    def crunch={
      eat
      println("crunch")
    }
  }


  val cat=new Cat
   // cat.eat
  val cat1=new Cat
    cat1.crunch

  class Person(name: String, age: Int) {
    def this(name: String) =this(name,0)
  }


  //while choosing a superclass, make sure the superclass has a contructor of whatever parameters you need to be passed or
  //if there is no constructor, use the parameters of the class defn itself
  //for ex: class Adult(name: String, age: Int, idCard: String) extends Person(name,age) OR
  //class Adult(name: String, age: Int, idCard: String) extends Person(name) ..... using the constructor this
  class Adult(name: String, age: Int, idCard: String) extends Person(name,age)

  //overriding
  class Dog(override val creatureType: String) extends Animal { //overriding in the class defn itself
    super.eat //refers to the eat method from the superclass i.e., the Animal class
    override def eat= println("crunch, crunch") //another implementation to the method eat- this time with public
    //override val creatureType="domestic" // overriding val // same as overriding in the class defn itself
  }



  val dog=new Dog("k9")
  dog.eat

  println(dog.creatureType) //overriden method

  //type substitution
  val unknowAnimal: Animal=new Dog("K9")  //polymorphism
  unknowAnimal.eat

  //super- to refernce a method or field from a parent class

  //preventing overrides

 //1. using final in the superclass for the val
  //2. or using final for the whole superclass
  //3. using the keyword sealed in front of class in the class defn will prevent it
  // from being extended in other files but can be extended in the same file






}
