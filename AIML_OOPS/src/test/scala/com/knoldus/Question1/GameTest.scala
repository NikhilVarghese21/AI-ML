// Author - Nikhil Varghese

package com.knoldus.Question1

import com.knoldus.Question1.GameShop.consoles
import org.scalatest.flatspec.AnyFlatSpec


class GameTest extends AnyFlatSpec {

  val consoles = new ConsoleLibrary()
  val cod = new Game("COD", "Activision", List(consoles.Xbox2))


  "The toString method" should "be valid" in {
    val actualResult = cod.toString
    val expectedResult = "Game(COD, by Activision)"
    assert(actualResult === expectedResult)
  }

  "The toString method" should "be invalid" in {
    val actualResult = cod.toString
    val expectedResult = "COD, by Activision"
    assert(actualResult != expectedResult)
  }

  "The isSupported method" should "be valid" in {
    val actualResult = cod.isSupported(consoles.Xbox2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The isSupported method" should "be invalid" in {
    val actualResult = cod.isSupported(consoles.NintendoSwitch)
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

}
