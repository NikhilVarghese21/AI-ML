// Author - Nikhil Varghese

package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class LinkedListAbstractTest extends AnyFlatSpec {

  val list = new LinkedListHelper()
  val headListNumber = 1
  val tailListNumber = list.create(0, 1, 2, 3, 3, 2, 1, 0)
  val data = new NonEmptyList(headListNumber, tailListNumber)
  val headListString = "abc"
  val tailListString = list.create("pqr", "xyz", "Ronaldo", "Messi")
  val stringData = new NonEmptyList(headListString, tailListString)

  val emptyList = new EmptyList()

  /* TEST CASES FOR NON-EMPTY LIST OF NUMBERS */

  "The head method for Non-Empty List of Numbers" should "be valid" in {
    val actualResult = data.head
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }

  "The head method for Non-Empty List of Numbers" should "be invalid" in {
    val actualResult = data.head
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  "The size method for Non-Empty List of Numbers" should "be valid" in {
    val actualResult = data.size
    val expectedResult = 9
    assert(actualResult === expectedResult)
  }

  "The size method for Non-Empty List of Numbers" should "be invalid" in {
    val actualResult = data.size
    val expectedResult = 8
    assert(actualResult != expectedResult)
  }

  "The apply method for Non-Empty List of Numbers" should "be valid" in {
    val actualResult = data.apply(0)
    val expectedResult = Some(1)
    assert(actualResult === expectedResult)
  }

  "The apply method for Non-Empty List of Numbers" should "be invalid" in {
    val actualResult = data.apply(0)
    val expectedResult = Some(0)
    assert(actualResult != expectedResult)
  }


  /* TEST CASES FOR NON-EMPTY LIST OF STRINGS */

  "The head method for Non-Empty List of Strings" should "be valid" in {
    val actualResult = stringData.head
    val expectedResult = "abc"
    assert(actualResult === expectedResult)
  }

  "The head method for Non-Empty List of Strings" should "be invalid" in {
    val actualResult = stringData.head
    val expectedResult = "pqr"
    assert(actualResult != expectedResult)
  }

  "The size method for Non-Empty List of Strings" should "be valid" in {
    val actualResult = stringData.size
    val expectedResult = 5
    assert(actualResult === expectedResult)
  }

  "The size method for Non-Empty List of Strings" should "be invalid" in {
    val actualResult = stringData.size
    val expectedResult = 4
    assert(actualResult != expectedResult)
  }

  "The apply method for Non-Empty List of Strings" should "be valid" in {
    val actualResult = stringData.apply(0)
    val expectedResult = Some("abc")
    assert(actualResult === expectedResult)
  }

  "The apply method for Non-Empty List of Strings" should "be invalid" in {
    val actualResult = stringData.apply(0)
    val expectedResult = Some("pqr")
    assert(actualResult != expectedResult)
  }

  /* TEST CASES FOR EMPTY LIST OF NUMBERS */

  "The head method for Empty List" should "be valid" in {
    val actualResult = emptyList.headOption
    val expectedResult = None
    assert(actualResult === expectedResult)
  }


  "The head method for Empty List" should "be invalid" in {
    val actualResult = emptyList.headOption
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }


  "The size method for Empty List" should "be valid" in {
    val actualResult = emptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }


  "The size method for Empty List" should "be invalid" in {
    val actualResult = emptyList.size
    val expectedResult = 1
    assert(actualResult != expectedResult)
  }


  "The apply method for Empty List" should "be valid" in {
    val actualResult = emptyList.apply(0)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "The apply method for Empty List" should "be invalid" in {
    val actualResult = emptyList.apply(0)
    val expectedResult = Some(0)
    assert(actualResult != expectedResult)
  }

}
