// Author - Nikhil Varghese

package com.knoldus.Question5

import scala.io.StdIn.readInt

object amountChecker_impl {

  def main(args: Array[String]): Unit = {
    val amt = new amountChecker_api()
    try {
      print("Enter an Amount: ")
      val value = readInt()
      print(amt.amount(value))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
