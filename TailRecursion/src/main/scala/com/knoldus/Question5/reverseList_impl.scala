// Author - Nikhil Varghese

package com.knoldus.Question5

import scala.io.StdIn.readInt

object reverseList_impl {

  def main(args: Array[String]): Unit = {
    try {
      val rev = new reverseList_api()
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readInt()
      }
      print(s"The Reverse of $inputList is: " + rev.reverse(inputList))
    }
    catch {
      case numberFormatException:NumberFormatException => print("Enter a Number.")
    }
  }

}
