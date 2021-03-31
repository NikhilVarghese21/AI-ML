// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PalindromeTest extends AnyFlatSpec {

  val inputList = List("Hello", "aibohphobia", "dad", "civic")

  "Finding Palindrome and Non-Palindrome using partition function" should "be valid" in {
    val palindromes = new PalindromeList()
    val actualResult = palindromes.splitPalindromeUsingPartition(inputList)
    val expectedResult = (List("aibohphobia", "dad", "civic"),List("Hello"))
    assert(actualResult === expectedResult)
  }

  "Finding Palindrome and Non-Palindrome using partition function" should "be invalid" in {
    val palindromes = new PalindromeList()
    val actualResult = palindromes.splitPalindromeUsingPartition(inputList)
    val expectedResult = (List("Hello"),List("aibohphobia", "dad", "civic"))
    assert(actualResult != expectedResult)
  }

  "Finding Palindrome and Non-Palindrome using foldLeft" should "be valid" in {
    val palindromes = new PalindromeList()
    val actualResult = palindromes.splitPalindromeUsingfoldLeft(inputList)
    val expectedResult = (List("aibohphobia", "dad", "civic"),List("Hello"))
    assert(actualResult === expectedResult)
  }

  "Finding Palindrome and Non-Palindrome using foldLeft" should "be invalid" in {
    val palindromes = new PalindromeList()
    val actualResult = palindromes.splitPalindromeUsingfoldLeft(inputList)
    val expectedResult = (List("Hello"),List("aibohphobia", "dad", "civic"))
    assert(actualResult != expectedResult)
  }
}
