// Author - Nikhil Varghese

package com.knoldus.Question8

object Conditional_impl {

  def main(args: Array[String]): Unit = {
    val condition = new Conditional_api()
    print(condition.conditional[String]("Nikhil Varghese", _.size > 7, _.reverse))
    print(condition.conditional[Double](12.21, _.equals(12.21) , _.ceil))
  }

}
