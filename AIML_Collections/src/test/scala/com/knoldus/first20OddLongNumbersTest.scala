// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class first20OddLongNumbersTest extends AnyFlatSpec {

  val one = 1
  val three = 3
  val five = 5
  val seven = 7
  val nine = 9
  val eleven = 11
  val thirteen = 13
  val fifteen = 15
  val seventeen = 17
  val nineteen = 19

  "The first 20 Odd Long Numbers using Loop" should "be valid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingLoop
    val expectedResult = List(one, three, five, seven, nine, eleven, thirteen, fifteen, seventeen, nineteen)
    assert(actualResult === expectedResult)
  }

  "The first 20 Odd Long Numbers using Loop" should "be invalid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingLoop
    val expectedResult = List(one, three, five, seven, fifteen, seventeen, nineteen)
    assert(actualResult != expectedResult)
  }

  "The first 20 Odd Long Numbers using Filter" should "be valid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingFilter
    val expectedResult = List(one, three, five, seven, nine, eleven, thirteen, fifteen, seventeen, nineteen)
    assert(actualResult === expectedResult)
  }

  "The first 20 Odd Long Numbers using Filter" should "be invalid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingFilter
    val expectedResult = List(one, three, five, seven, fifteen, seventeen, nineteen)
    assert(actualResult != expectedResult)
  }

  "The first 20 Odd Long Numbers using Map" should "be valid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingMap
    val expectedResult = List(one, three, five, seven, nine, eleven, thirteen, fifteen, seventeen, nineteen)
    assert(actualResult === expectedResult)
  }

  "The first 20 Odd Long Numbers using Map" should "be invalid" in {
    val first20 = new first20OddLongNumbers_Api()
    val actualResult = first20.listOf20OddNumbersUsingMap
    val expectedResult = List(one, three, five, seven, fifteen, seventeen, nineteen)
    assert(actualResult != expectedResult)
  }

}
