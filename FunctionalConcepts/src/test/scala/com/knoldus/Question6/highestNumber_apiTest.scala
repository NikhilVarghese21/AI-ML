// Author - Nikhil Varghese

package com.knoldus.Question6

import org.scalatest.flatspec.AnyFlatSpec

class highestNumber_apiTest extends AnyFlatSpec {

  val number1 = 12
  val number2 = 21
  val number3 = 37

  "the highest number" should "be valid" in {
    val highest = new highestNumber_api()
    val actualResult = highest.partition(number1,number2,number3, (num1: Int, num2: Int) => if (num1 > num2) num1 else num2)
    val expectedResult = 37
    assert(actualResult === expectedResult)
  }

  "the highest number" should "not be valid" in {
    val highest = new highestNumber_api()
    val actualResult = highest.partition(number1,number2,number3, (num1: Int, num2: Int) => if (num1 > num2) num1 else num2)
    val expectedResult = 12
    assert(actualResult != expectedResult)
  }


}
