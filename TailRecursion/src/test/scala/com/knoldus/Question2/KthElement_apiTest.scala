// Author - Nikhil Varghese

package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class KthElement_apiTest extends AnyFlatSpec {

  "the Kth Element" should "be valid" in {
    val kth = new KthElement_api()
    val actualResult = kth.findKthElement(2, List(0,1,3,2,1,0))
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "the Kth Element" should "not be valid" in {
    val kth = new KthElement_api()
    val actualResult = kth.findKthElement(2, List(0,1,3,2,1,0))
    val expectedResult = 1
    assert(actualResult != expectedResult)
  }
}
