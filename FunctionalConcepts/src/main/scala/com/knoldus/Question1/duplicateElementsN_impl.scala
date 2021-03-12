// Author - Nikhil Varghese

package com.knoldus.Question1

import scala.io.StdIn.{readInt,readLine}

object duplicateElementsN_impl {

  def main(args: Array[String]): Unit = {
    try {
      val dupN = new duplicateElementsN_api()
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print("Enter total number of times the element has to be duplicated: ")
      val duplicateTimes = readInt()
      print("After duplicating the elements the List is: " + dupN.duplicateN(duplicateTimes, inputList))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
