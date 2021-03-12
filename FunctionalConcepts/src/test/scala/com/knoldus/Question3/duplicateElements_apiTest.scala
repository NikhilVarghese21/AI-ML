// Author - Nikhil Varghese

package com.knoldus.Question3

import org.scalatest.flatspec.AnyFlatSpec

class duplicateElements_apiTest extends AnyFlatSpec {

  "the duplicate Elements operation" should "be valid" in {
    val dupN = new duplicateElements_api()
    val actualResult = dupN.duplicate(List(0,1,2,3))
    val expectedResult = List(0,0,1,1,2,2,3,3)
    assert(actualResult === expectedResult)
  }

  "the duplicate Elements operation" should "not be valid" in {
    val dupN = new duplicateElements_api()
    val actualResult = dupN.duplicate(List(0,1,2,2))
    val expectedResult = List(0,0,1,1,2,2)
    assert(actualResult != expectedResult)
  }

}
