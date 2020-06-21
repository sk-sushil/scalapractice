package demo

object First {
  def main(args: Array[String]): Unit = {
    print("Hellow scala")
    var demo1 = 19;
    demo1 = 12
    println(demo1)
    val obj = new Smartphone()
    //obj.Display()
  }
}
class Smartphone
{
  // Class variables
  var number: Int = 16
  var nameofcompany: String = "Apple"

  // Class method
  def Display()
  {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }
}