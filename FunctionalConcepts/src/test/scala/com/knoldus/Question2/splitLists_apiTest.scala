// Author - Nikhil Varghese

package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class splitLists_apiTest extends AnyFlatSpec {

  "the split list operation" should "be valid" in {
    val split = new splitLists_api()
    val actualResult = split.splitlist(3,List(0,1,2,3,1,3,2,0))
    val expectedResult = (List(0,1,2),List(3,1,3,2,0))
    assert(actualResult === expectedResult)
  }

  "the split list operation" should "not be valid" in {
    val split = new splitLists_api()
    val actualResult = split.splitlist(3,List(0,1,2,3,1,3,2,0))
    val expectedResult = (List(0,1,2,3),List(1,3,2,0))
    assert(actualResult != expectedResult)
  }



}
