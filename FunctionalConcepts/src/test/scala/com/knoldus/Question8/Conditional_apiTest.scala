// Author - Nikhil Varghese

package com.knoldus.Question8

import org.scalatest.flatspec.AnyFlatSpec

class Conditional_apiTest extends AnyFlatSpec {

  "the condition" should "be valid" in {
    val condition = new Conditional_api()
    val actualResult = condition.conditional[String]("Nikhil Varghese", _.size > 7, _.reverse)
    val expectedResult = "esehgraV lihkiN"
    assert(actualResult === expectedResult)
  }

  "the condition" should "not be valid" in {
    val condition = new Conditional_api()
    val actualResult = condition.conditional[Double](12.21, _.equals(12.21) , _.ceil)
    val expectedResult = 12.0
    assert(actualResult != expectedResult)
  }

}
