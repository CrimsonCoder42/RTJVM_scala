package lectures.part2OOP

object OOBasics extends App {

  //val person = new Person("John", 26)

  val writer = new Writer("Devin", "Anderson", 1983 )

  writer.fullName()

  val novel = new Novel("Devin's Tale", 2022, writer)

}

// Class Params are not fields
class Person(name: String, val age: Int = 0) {

  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors

  def this(name:String) = this(name, 0)

  def this() = this("John Doe")

}

class Writer(fname: String, surname: String, val year: Int) {

  def fullName(): String = fname + " " + surname

}


class Novel(name: String, year: Int, author: Writer) {

  def authorAge = year - author.year
  def isWritten

}