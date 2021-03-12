// Author - Nikhil Varghese

package com.knoldus.Question3

import scala.annotation.tailrec

class Compress_api {
  //Eliminates consecutive duplicates of list elements and returns the list.
  def compressElements[A](inputList:List[A]):List[A] = {
    @tailrec
    def compress[A](list: List[A],compressedList:List[A]):List[A] = list match {
      case Nil => Nil
      case h::List() => compressedList :+ h
      case h::tail if (h == tail.head) => compress(tail,compressedList)
      case h::tail => compress(tail, compressedList :+ h)
    }
    compress(inputList,Nil)
  }
}
