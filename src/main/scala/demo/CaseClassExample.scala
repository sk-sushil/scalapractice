package demo

//Case classes are like regular classes with a few key differences which we will go over.
// Case classes are good for modeling immutable data.
class CaseClassExample {

}

case class Book(name: String, writer: String)
case class Message(sender: String, recipient: String, body: String)


object Main{
  def main(args: Array[String]): Unit = {
    //Notice how the keyword new was not used to instantiate the Book case class.
    // This is because case classes have an apply method by default which takes care of object construction.
    val mybook = Book("story","sushil")
    println(mybook.name+"..."+mybook.writer)

    //Instances of case classes are compared by structure and not by reference
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message4 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "tom")
    val messagesAreTheSame1 = message2 == message3  // true
    val messagesAreTheSame2 = message2 == message4
    println(messagesAreTheSame1)
    println(messagesAreTheSame2)

  }
}