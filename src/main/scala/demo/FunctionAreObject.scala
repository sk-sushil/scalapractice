package demo

//Functions are also objects in Scala. It is therefore possible to pass functions as arguments,
// to store them in variables, and to return them from other functions.
// This ability to manipulate functions as values is one of the cornerstone of a very
// interesting programming paradigm called functional programming.


object FunctionAreObject {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]): Unit = {
    //oncePerSecond(timeFlies)
    // calling same method using anonymous functions: functions without a name.
    oncePerSecond(() => println("times flies......"))
  }

}
