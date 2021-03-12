// Author - Nikhil Varghese

package com.knoldus.Question4

import org.scalatest.flatspec.AnyFlatSpec

class Circle_apiTest extends AnyFlatSpec {

  "the area of circle" should "be valid" in {
    val circle = new Circle_api()
    val actualResult = circle.circleArea("5")
    val expectedResult = 78.53981633974483
    assert(actualResult === expectedResult)
  }

  "the area of circle" should "be valid when radius is \"0\" " in {
    val circle = new Circle_api()
    val actualResult = circle.circleArea("0")
    val expectedResult = 0.0
    assert(actualResult === expectedResult)
  }

  "the area of circle" should "be valid when radius is \"\" " in {
    val circle = new Circle_api()
    val actualResult = circle.circleArea("")
    val expectedResult = 0.0
    assert(actualResult === expectedResult)
  }

  "the area of circle" should "not be valid" in {
    val circle = new Circle_api()
    val actualResult = circle.circleArea("3")
    val expectedResult = 28
    assert(actualResult != expectedResult)
  }


}
