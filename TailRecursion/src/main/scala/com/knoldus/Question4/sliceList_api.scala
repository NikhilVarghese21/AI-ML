// Author - Nikhil Varghese

package com.knoldus.Question4

import scala.annotation.tailrec

class sliceList_api {
  //Extracts a slice from a list.
  def sliceList[A](start: Int, end: Int, inputList: List[A]):List[A] = {
    @tailrec
    def slice[A](start: Int, end: Int, list: List[A], slicedList:List[A]):List[A] = (start, end, list) match {
      case (0, 0, list) => slicedList
      case (0, end, list) => slice(0, end - 1, list.tail, slicedList :+ list.head)
      case (start, end, h::list) => slice(start - 1, end, list, Nil)
    }
    slice(start, end - start, inputList, Nil)
  }
}
