// Author - Nikhil Varghese

package com.knoldus.Question5

class amountChecker_api {

  //returns greater, lesser or same after checking amount with 0.
  def amount(amount:Double):String = amount match {
    case x if x > 0 => "greater"
    case x if x < 0 => "lesser"
    case x => "same"
  }

}
