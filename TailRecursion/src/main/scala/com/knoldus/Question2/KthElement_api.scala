// Author - Nikhil Varghese

package com.knoldus.Question2

import scala.annotation.tailrec

class KthElement_api {

  //returns the Kth Element in a List.
  def findKthElement[A](k:Int, inputList:List[A]):A = {
    @tailrec
    def findKth[A](k:Int, list:List[A]):A = (k,list) match {
      case (0, head::_) => head
      case (k, _::tail) if k > 0 => findKth(k - 1, tail)
      case _ => throw new NoSuchElementException
    }
    findKth(k,inputList)
  }
}
