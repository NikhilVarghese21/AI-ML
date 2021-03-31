// Author - Nikhil Varghese

package com.knoldus

import scala.io.StdIn.readInt

class Factors_api {

  // returns factors of a number using loop and filter.
  def factors(value: Int):IndexedSeq[Int] = { 2 until (value - 1) filter (value % _ == 0) }

}

object Factors extends App {

  val factor = new Factors_api
  print("Enter a Number: ")
  val num = readInt()
  val values = factor.factors(num)
  if (values.isEmpty) print(s"No Factors of $num") else print(s"Factors of $num are: " + values)

}
