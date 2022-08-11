package lectures.part2OOP

object InheritanceAndTraits extends App{


  class Animal {
    val creatureType = "wild"
     final def eat = println("nomnom")
  }

  class Cat extends Animal {

    def crunch= {

      eat
      println("crunch crunch")

    }

  }

  val cat = new Cat
  cat.crunch

  // constructors

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType  = "domestic"

    override def eat = {
      super.eat
      println("crunch, crunch")
    }

  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (polymophism)

  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat


  // overriding vs overLoading

  // super

  //preventing overrides
  // 1 - keyword final
  // 2 - Use final on the entire class
  // 3 - seal the class = extend classes 
}
