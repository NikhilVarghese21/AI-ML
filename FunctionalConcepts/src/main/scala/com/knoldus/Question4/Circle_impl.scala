// Author - Nikhil Varghese

package com.knoldus.Question4

object Circle_impl {

  def main(args: Array[String]): Unit = {
    val area = new Circle_api()
    print(area.circleArea("5"))
    print("\n" + area.circleArea("0"))
    print("\n" + area.circleArea(""))

  }

}
