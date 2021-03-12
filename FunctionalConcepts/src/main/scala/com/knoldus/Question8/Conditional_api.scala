// Author - Nikhil Varghese

package com.knoldus.Question8

class Conditional_api {

  //function f(x) is invoked only when function p(x) is true otherwise x is returned.
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }

}
