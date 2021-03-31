// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FirstNNumbersTest extends AnyFlatSpec {

  val inputList = List(0,1,2,3,1,2,3)
  val inputListString = List("abc", "pqr","xyz","Hello","Hi","Racecar")
  val count = 3

  "The First N Numbers using built-in function" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.first(inputList, count)
    val expectedResult = List(0,1,2)
    assert(actualResult === expectedResult)
  }

  "The First N Numbers using built-in function" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.first(inputList, count)
    val expectedResult = List(0,1)
    assert(actualResult != expectedResult)
  }

  "The First N Numbers using For Loop" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingLoop(inputList, count)
    val expectedResult = List(0,1,2)
    assert(actualResult === expectedResult)
  }

  "The First N Numbers using For Loop" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingLoop(inputList, count)
    val expectedResult = List(0,1)
    assert(actualResult != expectedResult)
  }

  "The First N Numbers using foldLeft" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingFoldLeft(inputList, count)
    val expectedResult = List(0,1,2)
    assert(actualResult === expectedResult)
  }

  "The First N Numbers using foldLeft" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingFoldLeft(inputList, count)
    val expectedResult = List(0,1)
    assert(actualResult != expectedResult)
  }

  "The First N Numbers using Recursion" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstRecursive(inputList, count)
    val expectedResult = List(0,1,2)
    assert(actualResult === expectedResult)
  }

  "The First N Numbers using Recursion" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstRecursive(inputList, count)
    val expectedResult = List(0,1)
    assert(actualResult != expectedResult)
  }

  "The First N Strings using built-in function" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.first(inputListString, count)
    val expectedResult = List("abc", "pqr","xyz")
    assert(actualResult === expectedResult)
  }

  "The First N Strings using built-in function" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.first(inputListString, count)
    val expectedResult = List("abc", "pqr")
    assert(actualResult != expectedResult)
  }

  "The First N Strings using For Loop" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingLoop(inputListString, count)
    val expectedResult = List("abc", "pqr","xyz")
    assert(actualResult === expectedResult)
  }

  "The First N Strings using For Loop" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingLoop(inputListString, count)
    val expectedResult = List("abc", "pqr")
    assert(actualResult != expectedResult)
  }

  "The First N Strings using foldLeft" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingFoldLeft(inputListString, count)
    val expectedResult = List("abc", "pqr","xyz")
    assert(actualResult === expectedResult)
  }

  "The First N Strings using foldLeft" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstUsingFoldLeft(inputListString, count)
    val expectedResult = List("abc", "pqr")
    assert(actualResult != expectedResult)
  }

  "The First N Strings using Recursion" should "be valid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstRecursive(inputListString, count)
    val expectedResult = List("abc", "pqr","xyz")
    assert(actualResult === expectedResult)
  }

  "The First N Strings using Recursion" should "be invalid" in {
    val firstN = new FirstNNumbers_api()
    val actualResult = firstN.firstRecursive(inputListString, count)
    val expectedResult = List("abc", "pqr")
    assert(actualResult != expectedResult)
  }

}
