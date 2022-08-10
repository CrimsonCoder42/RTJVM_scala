package lectures.part2OOP

object OOBasics extends App {

  //val person = new Person("John", 26)

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenzBy(author))

  val counter = new Counter

  counter.inc.print



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
  def isWrittenzBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}


class Counter(val count: Int = 0) {

  def inc = {
    println("incrementing")
    new Counter(count + 1)
  } // immutability

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n:Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)

  } // immutability


  def dec(n:Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)

}