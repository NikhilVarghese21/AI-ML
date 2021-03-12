// Author - Nikhil Varghese

package com.knoldus.Question1

class duplicateElementsN_api {

  //Duplicates the elements of a list n number of times.
  def duplicateN[A](n: Int, inputList: List[A]):List[A] = {
    inputList flatMap { element => List.fill(n)(element) }
  }

}
