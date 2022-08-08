package lectures.part1basics

object Functions extends App{

  def aFunction(a:String, b:Int): String = {
    a + " " + b

  }

//  println(aFunction("hello", 3))
//
//
//  def aParameterlessFunction(): Int = 42
//
//
//  def aRepeatedFunction(aString: String, n: Int): String = {
//    if(n==1) aString
//    else aString + aRepeatedFunction(aString, n-1)
//  }
//
//  println(aRepeatedFunction("hello", 3))
//
//  // WHEN YOU NEED TO LOOP YOU USE RECURSION
//
//
//  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
//
//  def aBigFunction(n: Int): Int = {
//    def aSmallerFunction(a: Int, b: Int): Int = a + b
//
//    aSmallerFunction(n, n-1)
//  }
//
//
//  def aGreeting(aName: String, age: Int): String = {
//    "Hello, my name is " + aName + " and I am " + age + " years old."
//  }
//
//    println(aGreeting("Devin", 39))

  // factorial function

//  def aFactorial(aNum: Int): Int = {
//    if(aNum <= 0) 1
//    else aNum * aFactorial(aNum-1)
//  }

//  println(aFactorial(5))
//
//  def aFibb(aNum: Int): Int = {
//    if(aNum <= 2) 1
//    else aFibb(aNum - 1) + aFibb(aNum - 2)
//  }
//
//  println(aFibb(8))



  def aPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)

  }

    println(aPrime(37))
    println(aPrime(20))

}





