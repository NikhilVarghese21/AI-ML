// Author - Nikhil Varghese

package com.knoldus.Question4

import org.scalatest.flatspec.AnyFlatSpec

class sliceList_apiTest extends AnyFlatSpec {

  "the slice list operation" should "be valid" in {
    val slice = new sliceList_api()
    val actualResult = slice.sliceList(1,3,List(0,1,1,2,3,2,1,2,3))
    val expectedResult = List(1,1)
    assert(actualResult === expectedResult)
  }

  "the slice list operation" should "not be valid" in {
    val slice = new sliceList_api()
    val actualResult = slice.sliceList(1,3,List(0,1,1,2,3,2,1,2,3))
    val expectedResult = List(1,1,2)
    assert(actualResult != expectedResult)
  }

}
