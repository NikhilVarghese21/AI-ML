// Author - Nikhil Varghese

package com.knoldus.Question6

import scala.io.StdIn.readInt

object highestNumber_impl {

  def main(args: Array[String]): Unit = {
    val highest = new highestNumber_api()
    try {
      print("Enter 1st Number: ")
      val number1 = readInt()
      print("Enter 2nd Number: ")
      val number2 = readInt()
      print("Enter 3rd Number: ")
      val number3 = readInt()
      print("Highest Number is: " + highest.partition(number1, number2, number3, (num1: Int, num2: Int) => if (num1 > num2) num1 else num2))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
