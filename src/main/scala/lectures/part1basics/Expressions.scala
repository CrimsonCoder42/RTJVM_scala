package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expression

  println(x)

  val y = 3

  println(y != x)


//IF EXPRESSION
  val aCondition = false

  val aConditionedValue = if(aCondition) 5 else 3

  println(aConditionedValue)


//  EVERYTHING IN SCALA IS AN EXPRESSION

//  val aWeirdValue = (aVariable = 3)
//  println(aWeirdValue)
//
//  val aCodeBlock = {
//    val y = 2
//    val z = y + 1
//
//    if (z > 2) "hello" else "goodbye"
//  }

  val someValue = {
    2 < 3

    //true
  }

  val someOtherValue = {

    if(someValue) 239 else 986
    42
  }

println(someOtherValue)
}
