package demo

object Timer {
  def oncePerSecond(mycallback: () => Unit): Unit = {
    while (true) { mycallback(); Thread sleep 1000 }
  }
  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}