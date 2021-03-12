// Author - Nikhil Varghese

package com.knoldus.Question4

class Circle_api {

  //computes the area of a circle given its radius as a String.
  def circleArea(radius: String): Double = {
    radius.isEmpty match {
      case true => 0
      case false => math.pow(radius.toDouble,2) * math.Pi
    }
  }
}
