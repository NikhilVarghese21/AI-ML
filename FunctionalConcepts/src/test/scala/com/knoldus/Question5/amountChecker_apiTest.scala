// Author - Nikhil Varghese

package com.knoldus.Question5

import org.scalatest.flatspec.AnyFlatSpec

class amountChecker_apiTest extends AnyFlatSpec {

  "the amount" should "be valid when amount is greater than 0" in {
    val amt = new amountChecker_api()
    val actualResult = amt.amount(2)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  "the amount" should "be valid when amount is 0" in {
    val amt = new amountChecker_api()
    val actualResult = amt.amount(0)
    val expectedResult = "same"
    assert(actualResult === expectedResult)
  }

  "the amount" should "be valid when amount is less than 0" in {
    val amt = new amountChecker_api()
    val actualResult = amt.amount(-1)
    val expectedResult = "lesser"
    assert(actualResult === expectedResult)
  }

  "the amount" should "not be valid" in {
    val amt = new amountChecker_api()
    val actualResult = amt.amount(0.1)
    val expectedResult = "same"
    assert(actualResult != expectedResult)
  }




}
