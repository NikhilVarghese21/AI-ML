// Author - Nikhil Varghese

package com.knoldus.Question7

import scala.io.StdIn.readInt

object Product_impl {

  def main(args: Array[String]): Unit = {
    val product = new Product_api()
    try {
      print("Enter First Number for Multiplication: ")
      val num1 = readInt()
      val multiply = product.multiplication(num1)
      print("Enter Second Number for Multiplication: ")
      val num2 = readInt()
      print(s"Multiplication of $num1 and $num2 is: " + multiply(num2))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
