package demo

//Below is a simple syntax to define a basic class in Scala.


//The class name works as a class constructor which can take a number of parameters.
// The above code defines two constructor arguments, xc and yc;
// they are both visible in the whole body of the class.

class Point(xc: Int,yc: Int) {
  //This class defines two variables x and y and a method move
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
    println("Point x location : " + x)
    println("Point y location : " + y)
  }
}
object Demo{
  def main(args: Array[String]): Unit = {
    val pt = new Point(33,44)

    // Move to a new location
    pt.move(11,11)
  }
}
