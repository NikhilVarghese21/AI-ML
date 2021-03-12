// Author - Nikhil Varghese

package com.knoldus.Question4

import scala.io.StdIn.{readInt,readLine}

object sliceList_impl {

  def main(args: Array[String]): Unit = {
    val slice = new sliceList_api()
    try {
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print("Enter starting Position for Slicing the List: ")
      val start = readInt()
      print("Enter ending Position for Slicing the List: ")
      val end = readInt()
      if (start > end) {
        throw new Throwable
      }
      else if (end - start > inputList.length) {
        throw new Throwable
      }
      else  {
        print(slice.sliceList(start, end, inputList))
      }
    }
    catch {
      case throwable:Throwable => print("Invalid Index.")
      case numberFormatException:NumberFormatException => print("Invalid Value.")
    }
  }
}
