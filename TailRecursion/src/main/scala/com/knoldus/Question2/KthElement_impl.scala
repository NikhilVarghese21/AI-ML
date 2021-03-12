// Author - Nikhil Varghese

package com.knoldus.Question2

import scala.io.StdIn.{readInt,readLine}

object KthElement_impl {

  def main(args: Array[String]): Unit = {
    try {
      val kth = new KthElement_api()
      print("Enter Total Elements in List: ")
      val total = readInt()
      print(s"Enter $total Elements:\n")
      val inputList = List.fill(total) {
        readLine()
      }
      print("Enter the Index: ")
      val kthElement = readInt()
      print(s"Element in position $kthElement is: " + kth.findKthElement(kthElement, inputList))
    }
    catch {
      case noSuchElementException: NoSuchElementException => print("Index out of Bound.")
    }
  }
}
