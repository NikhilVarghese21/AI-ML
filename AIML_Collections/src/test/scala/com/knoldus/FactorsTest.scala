// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FactorsTest extends AnyFlatSpec {

  val inputComposite1 = 6
  val inputPrime1 = 7

  "The Factors" should "be valid when input is Composite" in {
    val factor = new Factors_api()
    val actualResult = factor.factors(inputComposite1)
    val expectedResult = Vector(2, 3)
    assert(actualResult === expectedResult)
  }

  "The Factors" should "be valid when input is Prime" in {
    val factor = new Factors_api()
    val actualResult = factor.factors(inputPrime1)
    val expectedResult = Nil
    assert(actualResult === expectedResult)
  }

  "The Factors" should "be invalid when input is Composite" in {
    val factor = new Factors_api()
    val actualResult = factor.factors(inputComposite1)
    val expectedResult = Vector(1, 2, 3)
    assert(actualResult != expectedResult)
  }

}
