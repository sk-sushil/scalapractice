package demo

object TupleExample {
  def main(args: Array[String]): Unit = {
    tupleDemo1()
  }

  def tupleDemo1(): Unit = {
    //Scala tuple combines a fixed number of items together so that they can be passed around as a whole. Unlike an array or list, a tuple can hold objects with different types but they are also immutable.
    //The actual type of a tuple depends upon the number and of elements it contains and the types of those elements
    //the type of (99, "Luftballons") is Tuple2[Int, String].
    // The type of ('u', 'r', "the", 1, 4, "me") is Tuple6[Char, Char, String, Int, Int, String]
    val tup = (23,45,34,67)
    val sum = tup._1 + tup._2 + tup._3 + tup._4
    println("Sum of tuple is: "+sum)
    val tup2 = new Tuple2(1,"hellow")
    println(tup2._1)
    println(tup2._2)

    //Pattern matching on tuples::: A tuple can also be taken apart using pattern matching:
    println("Pattern Matchine...")
    val ingredient = ("sugar", 25)
    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    //Example 2::  Here is another example of pattern-matching a tuple:
    val planets = List(("Mercury", 57.9),("Venus", 108.2),
      ("Earth", 149.6),("Mars", 227.9),("Jupiter", 778.3))
    planets.foreach{
      case ("Earth",distace1) =>
        println(s"Earth is $distace1 million KM away from SUN")
      case _ =>
    }

    //Example 3::
    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a * b)
    }

    //Tuples Vs case classes
    //Users may sometimes find it hard to choose between tuples and case classes.
    // Case classes have named elements. The names can improve the readability of some kinds of code.
    // In the planet example above, we might define case class Planet(name: String, distance: Double) rather than using tuples.
    }
}
