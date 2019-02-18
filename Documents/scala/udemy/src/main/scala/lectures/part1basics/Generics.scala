package lectures.part1basics

import lectures.part1basics.AbstractDataTypes.Dog

object Generics extends App{

  class MyList[+A] { // denotes generic type// type A can be used inside the class defn // A is a type parameter

  def add[B>: A](element: B): MyList[B]= ???       //takes only elements of type supertype B and returns as list of type of supertype B


  }

  class MyMap[Key, Value]{  // can have more than 1 type parameter inside the [] brackets for generic classes// Traits can also be parameterised
  //objects cant be type parameterised
  }
  val listofintegers= new MyList[Int]     // example of generic class usage
  val listofstrings= new MyList[String]   // generic


  //generic methods

  object MyList {
    def empty[A]: MyList[A]= ???

  }

  val emptylistofint= MyList.empty[Int]

  //variance problem

  class Animal
  class cat extends Animal
  class dog extends Animal

  //1. List[cat] extends List[Animal] = COVARIANCE// animal can be replaced by cat coz cats are animals

  class covariantList[+A]  // this +A means it is a covariant list
  val animal: Animal =new cat
  val animalList: covariantList[Animal]=new covariantList[cat]

  // animalList.add(new Dog) ??

  //2. List[cat] and List[animal] are two seperate lists= INVARIANCE

  class invariantList[A]
  val invariantanimalList: invariantList[Animal]= new invariantList[Animal] // cant do new invariantList[cat]

  //3. Contravariance // list of cats is replaced by animal- animals not part of cats?
  class contravariantList[-A]   //-A
  val contravariantList: contravariantList[cat]=new contravariantList[Animal]

  //so instead of covariantList- replace with trainer

  class Trainer[-A]         // contravariance example
  val trainer: Trainer[cat]= new Trainer[Animal]  //in this context, trainer of animal can be trainer of cat



  //bounded types

//  class Cage[A <: Animal](animal: A)      // class cage only accepts type parameters A which are subtypes of type Animal
//  val cage= new Cage(new Dog)               //<: upper bounded type(cage accepts only subtypes of animal)
//                                            // >: lower bounded type(cage accepts only supertypes of animal)
//
//  class Car
//
//  val newCage=new Cage(new Car) // this is not possible coz car isnt a subtype of Animal
//
//














}
