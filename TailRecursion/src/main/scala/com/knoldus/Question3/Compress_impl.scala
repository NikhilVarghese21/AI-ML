// Author - Nikhil Varghese

package com.knoldus.Question3

import scala.io.StdIn.{readInt,readLine}


object Compress_impl {

  def main(args: Array[String]): Unit = {
    try {
      val compress = new Compress_api()
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print("List after compressing is: " + compress.compressElements(inputList))
    }
    catch {
      case numberFormatException:NumberFormatException => print("Enter a Number.")
    }
  }
}
