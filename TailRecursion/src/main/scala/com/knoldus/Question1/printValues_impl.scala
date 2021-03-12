// Author - Nikhil Varghese

package com.knoldus.Question1

object printValues_impl {

  def main(args: Array[String]): Unit = {
    val five = new printValues_api()
    val (start,end) = (5, 50)
    val values = five.printFives(start,end)
    values.foreach(element => print(element + " "))
  }
}
