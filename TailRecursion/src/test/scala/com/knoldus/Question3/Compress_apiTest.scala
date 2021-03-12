// Author - Nikhil Varghese

package com.knoldus.Question3

import org.scalatest.flatspec.AnyFlatSpec

class Compress_apiTest extends AnyFlatSpec {

  "the compress operation" should "be valid" in {
    val compress = new Compress_api()
    val actualResult = compress.compressElements(List(0,1,1,2,2,2,3,3,3,2))
    val expectedResult = List(0,1,2,3,2)
    assert(actualResult === expectedResult)
  }

  "the compress operation" should "not be valid" in {
    val compress = new Compress_api()
    val actualResult = compress.compressElements(List(0,1,1,2,2,2,3,3,3,2))
    val expectedResult = List(0,1,2,3)
    assert(actualResult != expectedResult)
  }
}
