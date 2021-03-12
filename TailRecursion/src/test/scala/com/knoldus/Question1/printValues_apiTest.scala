// Author - Nikhil Varghese

package com.knoldus.Question1

import org.scalatest.flatspec.AnyFlatSpec

class printValues_apiTest extends AnyFlatSpec {

  val start = 5
  val end = 50
  val (first,second,third,fourth,fifth,sixth,seventh,eight) = (10, 15, 20, 25, 30, 35, 40, 45)
  val printValueExpectedResult = List(start,first,second,third,fourth,fifth,sixth,seventh,eight,end)

  "the printValues operation" should "be valid" in {
    val print = new printValues_api()
    val actualResult = print.printFives(start, end)
    val expectedResult = printValueExpectedResult
    assert(actualResult === expectedResult)
  }


  "the printValues operation" should "not be valid" in {
    val print = new printValues_api()
    val actualResult = print.printFives(start, end)
    val expectedResult = List(first,second,third,fourth,fifth,sixth,seventh,eight)
    assert(actualResult != expectedResult)
  }

}
