// Author - Nikhil Varghese

package com.knoldus.Question7

import org.scalatest.flatspec.AnyFlatSpec

class Product_apiTest extends AnyFlatSpec {

  val number1 = 10
  val number2 = 12

  "the product" should "be valid" in {
    val product = new Product_api()
    val result = product.multiplication(number1)
    val actualResult = result(number2)
    val expectedResult = 120
    assert(actualResult === expectedResult)
  }


  "the product" should "not be valid" in {
    val product = new Product_api()
    val result = product.multiplication(number1)
    val actualResult = result(number2)
    val expectedResult = 22
    assert(actualResult != expectedResult)
  }

}
