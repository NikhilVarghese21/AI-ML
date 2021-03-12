// Author - Nikhil Varghese

package com.knoldus.Question2

class splitLists_api {

  //Splits a list into two parts.
  def splitlist[A](n: Int, nums: List[A] ): (List[A], List[A]) = {
    (nums.take(n), nums.drop(n))
  }

}
