// Author - Nikhil Varghese

package com.knoldus.Question2

import scala.io.StdIn.{readInt,readLine}

object splitLists_impl {

  def main(args: Array[String]): Unit = {
    try {
      val split = new splitLists_api()
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print("Enter the size of first List: ")
      val size = readInt()
      print("The Lists after splitting are: " + split.splitlist(size, inputList))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
