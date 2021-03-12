// Author - Nikhil Varghese

package com.knoldus.Question3

import scala.io.StdIn.{readInt,readLine}

object duplicateElements_impl {

  def main(args: Array[String]): Unit = {
    val dup = new duplicateElements_api()
    try {
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print(dup.duplicate(inputList))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
