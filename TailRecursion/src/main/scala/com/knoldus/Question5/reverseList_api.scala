// Author - Nikhil Varghese

package com.knoldus.Question5

import scala.annotation.tailrec

class reverseList_api {
  //returns the reverse of list.
  def reverse(inputList:List[Int]):List[Int] = {
    @tailrec
    def revList(originalList: List[Int], reverseList: List[Int]): List[Int] = { originalList match {
      case Nil => reverseList //returning reverseList when originalList is empty.
      case head::tail => revList(tail , head :: reverseList) //head value is prepended to reverseList and calling revList function recursively with tail.`
    }
    }
    revList(inputList, Nil)
  }
}
