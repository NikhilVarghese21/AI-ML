// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class longestStringTest extends AnyFlatSpec {

  val names = List("Lionel", "Messi", "Cristiano", "Ronaldo")

  "The Longest String using built-in functions" should "be valid" in {
    val longestString = new Longest()
    val actualResult = longestString.longest(names)
    val expectedResult = "Cristiano"
    assert(actualResult === expectedResult)
  }

  "The Longest String using built-in functions" should "be invalid" in {
    val longestString = new Longest()
    val actualResult = longestString.longest(names)
    val expectedResult = "Messi"
    assert(actualResult != expectedResult)
  }

  "The Longest String using Fold" should "be valid" in {
    val longestString = new Longest()
    val actualResult = longestString.longestUsingFold(names)
    val expectedResult = "Cristiano"
    assert(actualResult === expectedResult)
  }

  "The Longest String using Fold" should "be invalid" in {
    val longestString = new Longest()
    val actualResult = longestString.longestUsingFold(names)
    val expectedResult = "Messi"
    assert(actualResult != expectedResult)
  }

  "The Longest String using Reduce" should "be valid" in {
    val longestString = new Longest()
    val actualResult = longestString.longestUsingReduce(names)
    val expectedResult = "Cristiano"
    assert(actualResult === expectedResult)
  }

  "The Longest String using Reduce" should "be invalid" in {
    val longestString = new Longest()
    val actualResult = longestString.longestUsingReduce(names)
    val expectedResult = "Messi"
    assert(actualResult != expectedResult)
  }


  "The Longest String using Type Parameter" should "be valid" in {
    val longestString = new Longest()
    val actualResult = longestString.greatest[String](names, (num1,num2) => if (num1.length > num2.length) num1 else num2)
    val expectedResult = "Cristiano"
    assert(actualResult === expectedResult)
  }

  "The Longest String using Type Parameter" should "be invalid" in {
    val longestString = new Longest()
    val actualResult = longestString.greatest[String](names, (num1,num2) => if (num1.length > num2.length) num1 else num2)
    val expectedResult = "Messi"
    assert(actualResult != expectedResult)
  }

}
