// Author - Nikhil Varghese

package com.knoldus.Question1

import scala.annotation.tailrec

class printValues_api {
  //returns a list of numbers from start to end which are divisible by 5.
  def printFives(start:Int, end:Int):List[Int] = {
    @tailrec
    def fives(currentValue: Int, max: Int, values:List[Int]): List[Int] = {
      if (currentValue <= max) {
        fives(currentValue + 5, max, values :+ currentValue)
      }
      else  {
        values
      }
    }
    fives(start, end, Nil)
  }
}
