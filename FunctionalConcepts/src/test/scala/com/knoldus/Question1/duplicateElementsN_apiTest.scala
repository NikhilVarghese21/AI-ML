// Author - Nikhil Varghese

package com.knoldus.Question1

import org.scalatest.flatspec.AnyFlatSpec

class duplicateElementsN_apiTest extends AnyFlatSpec {

  "the duplicate Elements N times operation" should "be valid" in {
    val dupN = new duplicateElementsN_api()
    val actualResult = dupN.duplicateN(3,List(0,1,2,3))
    val expectedResult = List(0,0,0,1,1,1,2,2,2,3,3,3)
    assert(actualResult === expectedResult)
  }

  "the duplicate Elements N times operation" should "not be valid" in {
    val dupN = new duplicateElementsN_api()
    val actualResult = dupN.duplicateN(2,List(0,1,2))
    val expectedResult = List(0,1,2,2)
    assert(actualResult != expectedResult)
  }


}
