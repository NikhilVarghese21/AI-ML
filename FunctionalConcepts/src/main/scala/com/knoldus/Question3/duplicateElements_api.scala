// Author - Nikhil Varghese

package com.knoldus.Question3

class duplicateElements_api {

  //Duplicate the elements of a list.
  def duplicate[A](inputList:List[A]):List[A] = {
    inputList flatMap { element => List(element, element) }
  }

}
