// Author - Nikhil Varghese

package com.knoldus.Question6

class highestNumber_api {

  //returns the highest number.
  def partition(number1:Int, number2:Int, number3:Int, max: (Int, Int) => Int): Int = {
    max(number1, max(number2, number3))
  }

}
