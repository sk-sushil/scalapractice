package demo

// A closure is a function,
// whose return value depends on the value of one or more variables declared outside this function.
object ClosureExample {
  def main(args: Array[String]) {
    println( "multiplier(1) value = " +  multiplier(4) )
    println( "multiplier(2) value = " +  multiplier(5) )
  }

  var fac = 3
  val multiplier = (i: Int) => i * fac

}

