// Author - Nikhil Varghese

package com.knoldus

class Longest {

  //returns longest string in List using maxBy.
  def longest(inputList: List[String]): String = inputList.maxBy(_.length)

  //returns longest string in List using fold.
  def longestUsingFold(inputList: List[String]): String = {
    inputList.fold("")((result,head) => if (result.length < head.length) head else result)
  }

  //returns longest string in List using reduce.
  def longestUsingReduce(inputList: List[String]): String = {
    inputList.reduce((firstElement,secondElement) => if (firstElement.length < secondElement.length) secondElement else firstElement)
  }

  // returns longest string in List. Uses type parameters.
  def greatest[A](l: List[A], max: (A,A) => A): A = {
    l reduce ((firstElement,secondElement) => max(firstElement,secondElement))
  }


}

object longestString extends App {

  val longestString = new Longest()
  val names = List("Lionel", "Messi", "Cristiano", "Ronaldo")
  print("Longest String using built-in functions: " + longestString.longest(names) + "\n")
  print("Longest String using Fold: " + longestString.longestUsingFold(names) + "\n")
  print("Longest String using Reduce: " + longestString.longestUsingReduce(names) + "\n")
  print("Longest String using Generic Class: " + longestString.greatest[String](names, (num1,num2) => if (num1.length > num2.length) num1 else num2))

}
