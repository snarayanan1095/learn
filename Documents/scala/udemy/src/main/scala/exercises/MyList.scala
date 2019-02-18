//package exercises
//
// import java.util.function.Predicate
//
//import javax.xml.transform.Transformer
//
//abstract class MyList[+A] {
//
//
//  def head: A
//
//  def tail: MyList[A]
//
//  def isEmpty: Boolean
//
//  def add[B >: A](element: B): MyList[B]
//
//
//  def printElements: String // polymorphic call
//
//  override def toString: String = "[" + printElements + "]"
//
//  //high order functions- recieve or return functions
//  def map[B](transformer: A => B): MyList[B]
//  def flatMap[B](transformer: A => MyList[B]): MyList[B]
//  def filter(predicate: A => Boolean): MyList[A]
//  def ++[B>: A](list: MyList[B]): MyList[B]
//
//}
//  case object Empty extends MyList[Nothing] {
//    def head: Nothing = throw new NoSuchElementException //exception
//    def tail: MyList[Nothing] = throw new NoSuchElementException
//
//    def isEmpty: Boolean = true
//
//    def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
//
//    def printElements: String = " "
//
//    def map[B](transformer: Nothing => B): MyList[B] = Empty
//
//    def flatMap[B](transformer: Nothing => MyList[B]): MyList[B] = Empty
//
//    def filter(predicate: Nothing => Boolean): MyList[Nothing] = Empty
//
//    def ++[B>: Nothing](list: MyList[B]): MyList[B]= list
//  }
//
//  case class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
//    def head: A = h
//
//    def tail: MyList[A] = t
//
//    def isEmpty: Boolean = false
//
//    def add[B >: A](element: B): MyList[B] = new Cons(element, this)
//
//    def printElements: String = {
//      if (t.isEmpty) " " + h
//      else h + " " + t.printElements
//
//      def filter(predicate: A => Boolean): MyList[A] =
//        if (predicate(h)) new Cons(h, t.filter(predicate))    // predicate(h) can also be predicate.apply(h)
//        else t.filter(predicate)
//
//      def map[B](transformer: A => B): MyList[B] =
//        new Cons(transformer(h),t.map(transformer))
//
//      def ++[B>: A](list: MyList[B]): MyList[B]= new Cons(h, t ++ list)
//
//      def flatMap[B](transformer: A => MyList[B]): MyList[B]=
//        transformer(h) ++ t.flatMap(transformer)
//
//
//    }
//
//
////    trait MyPredicate[-T] { // T=> Boolean
////      def test(element: T): Boolean
////    }
////
////
////    trait MyTransformer[-A, B] {    // A => B
////      def transform(elem: A): B
////
////    }
//
//  }
//
//
//  object ListTest extends App {
//    val listofintegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, new Cons(4, Empty))))
//    val clonelistofintegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, new Cons(4, Empty))))
//
//    val anotherlistofintegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(7, new Cons(8, Empty))))
//    val listofstrings: MyList[String] = new Cons("Hello", new Cons("Scala", Empty))
//
//    println(listofintegers.toString)
//    println(listofstrings.toString)
//    println(listofintegers.map(new Function1[Int, Int](
//
//    override def apply(elem: Int): Int = elem * 2
//
//    ) ).toString
//    )
//
//
//    println(listofintegers.filter(new Function1[Int, Boolean](
//
//    override def apply(elem: Int): Boolean = elem % 2 == 0
//
//    ) ).toString
//    )
//
//    println((listofintegers ++ anotherlistofintegers).toString)
//    println(listofintegers.flatMap(new Function1[Int, MyList[Int]](
//
//    override def apply(elem: Int): MyList[Int] = new Cons(elem, new Cons(elem + 1, Empty))
//
//    ) ).toString
//    )
//
//    println(clonelistofintegers == listofintegers) // will returnb true- coz case class is used
//
//  }
//
//
////
////object ListTest extends App {
////  val list= new Cons(1, new Cons(2, new Cons(3, Empty)))
////  println(list.tail.tail.head)
////  println(list.add(4).head)
////  println(list.isEmpty)
////
////  println(list.toString) //polymorphic call
