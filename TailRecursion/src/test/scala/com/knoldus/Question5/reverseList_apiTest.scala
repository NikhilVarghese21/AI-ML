// Author - Nikhil Varghese

package com.knoldus.Question5

import org.scalatest.flatspec.AnyFlatSpec

class reverseList_apiTest extends AnyFlatSpec {

  "the reverse of list" should "be valid" in {
    val rev = new reverseList_api()
    val actualResult = rev.reverse(List(3,2,1,0))
    val expectedResult = List(0,1,2,3)
    assert(actualResult === expectedResult)
  }

  "the reverse of list" should "not be valid" in {
    val rev = new reverseList_api()
    val actualResult = rev.reverse(List(3,1,2,0))
    val expectedResult = List(3,1,2,0)
    assert(actualResult != expectedResult)
  }


}
