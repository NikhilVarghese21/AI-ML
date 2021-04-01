// Author - Nikhil Varghese

package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class ListTest extends AnyFlatSpec {

  val input1 = 1
  val input2 = 2
  val input3 = 3
  val input4 = 4

  val numbers = new List(input1,input2,input3,input4)
  val double = new List(1.3,12.4,32.16)
  val strings = new List("Ronaldo","Messi","Ziyech")
  val char = new List('R','o','n','a','d','o')


  //Test cases for apply method with Integer type data.
  "apply method with Integer Type" should "be valid" in {
    val actualResult = numbers.apply(1)
    val expectedResult = Some(2)
    assert(actualResult === expectedResult)
  }

  "apply method with Integer Type" should "be invalid" in {
    val actualResult = numbers.apply(1)
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }

  //Test cases for apply method with double type data.
  "apply method with Double Type" should "be valid" in {
    val actualResult = double.apply(1)
    val expectedResult = Some(12.4)
    assert(actualResult === expectedResult)
  }

  "apply method with Double Type" should "be invalid" in {
    val actualResult = double.apply(1)
    val expectedResult = Some(1.3)
    assert(actualResult != expectedResult)
  }


  //Test cases for apply method with string type data.
  "apply method with String Type" should "be valid" in {
    val actualResult = strings.apply(1)
    val expectedResult = Some("Messi")
    assert(actualResult === expectedResult)
  }

  "apply method with String Type" should "be invalid" in {
    val actualResult = strings.apply(1)
    val expectedResult = Some("Ronaldo")
    assert(actualResult != expectedResult)
  }


  //Test cases for apply method of char type data.
  "apply method with Char Type" should "be valid" in {
    val actualResult = char.apply(1)
    val expectedResult = Some('o')
    assert(actualResult === expectedResult)
  }

  "apply method with Char Type" should "be invalid" in {
    val actualResult = char.apply(1)
    val expectedResult = Some('R')
    assert(actualResult != expectedResult)
  }

}
