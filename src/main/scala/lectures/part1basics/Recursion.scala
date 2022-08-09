package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

//  def factorial(n: Int): Int = {
//    // Basically if ^ n reaches 1 return 1
//    if (n <= 1) 1
//    else {
//      // recursion first reaches out to find the lowest number being used.
//      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
//      // It then clears out the memory
//      val result = n * factorial(n - 1)
//      // It runs from lowest number to highest
//      println("Computed factorial of " + n)
//
//      result
//    }
//  }
//  println(factorial(10))



//  def anotherFactorial(n: Int): BigInt = {
//    @tailrec
//    def factHelper(x: Int, accumulator: BigInt): BigInt =
//      if(x <= 1) accumulator
//      else factHelper(x - 1, x * accumulator)// TAIL RECURSION = use recursive call as the last expression
//
//    factHelper(n,1)
//  }
//
//  println(anotherFactorial(200))

// WHEN YOU NEED LOOPS USE TAIL RECURSION


//// 1. Concat function
//
//  @tailrec
//  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
//    if(n <= 0) accumulator
//    else concatenateTailrec(aString, n-1, aString + accumulator)
//
//  println(concatenateTailrec("Hello", 3, ""))
//
//
//// 2. Is Prime with tail recursion
//
//def isPrime(n: Int): Boolean = {
//  def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
//    if (!isPrimeTailrec) false
//    else if (t <= 1) true
//    else isPrimeTailrec(t - 1, n % t !=  0 && isStillPrime)
//
//    isPrimeTailrec(n / 2, true)
//}


// 3. Fibonacci function, tail recursion
    def fibonacci(n: Int): Int = {
      @tailrec
      def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
        if(i >= n) last
        else fiboTailrec(i + 1, last + nextToLast, last)

      if (n <= 2) 1
      else fiboTailrec(3,1,1)
    }

  println(fibonacci(8))

}


