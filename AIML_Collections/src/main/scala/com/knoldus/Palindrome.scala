// Author - Nikhil Varghese

package com.knoldus

import scala.io.StdIn.{readInt, readLine}

class PalindromeList {

  //splits elements into tuple of string lists of palindrome and non-palindrome using partition.
  def splitPalindromeUsingPartition(inputList: List[String]): (List[String], List[String]) = inputList.partition(element => element == element.reverse)

  //splits elements into tuple of string lists of palindrome and non-palindrome using foldLeft.
  def splitPalindromeUsingfoldLeft(inputList: List[String]): (List[String], List[String]) = {
    inputList.foldLeft((List[String](),List[String]())) { (result, head) =>
      if (head == head.reverse) (result._1 :+ head , result._2) else (result._1, result._2 :+ head)
    }
  }

}

object Palindrome extends App {

  val palindromes = new PalindromeList()
  print("Enter total elements in List: ")
  val totalElements = readInt()
  print(s"Enter $totalElements Elements:\n")
  val inputList = List.fill(totalElements) {
    readLine()
  }
  print("Splitting List into Palindrome and Non-Palindromes using Partition: \n")
  print(palindromes.splitPalindromeUsingPartition(inputList))
  print("\n\nSplitting List into Palindrome and Non-Palindromes using foldLeft: \n")
  print(palindromes.splitPalindromeUsingfoldLeft(inputList))

}
