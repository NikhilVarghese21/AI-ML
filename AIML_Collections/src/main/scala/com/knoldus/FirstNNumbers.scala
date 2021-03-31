// Author - Nikhil Varghese

package com.knoldus

import scala.io.StdIn.{readInt, readLine}

class FirstNNumbers_api {

  // returns first N(count) Numbers using take function.
  def first[A](items: List[A], count: Int): List[A] = items.take(count)

  // returns first N(count) Numbers using for-loop.
  def firstUsingLoop[A](items: List[A], count: Int): List[A] = {
    val values = for (counter <- 0 until count) yield items(counter)
    values.toList
  }

  //adds First N(count) element in the input list to the accumulated list and returns accumulated list.
  def firstUsingFoldLeft[A](items: List[A], count: Int): List[A] = {
    items.foldLeft[List[A]](Nil) { (accumulatedList: List[A], element: A) =>
      if (accumulatedList.size >= count) accumulatedList else element :: accumulatedList
    }.reverse
  }

  // returns first N(count) Numbers using recursion.
  def firstRecursive[A](items: List[A], count: Int): List[A] = {
    if (count > 0 && items.tail != Nil) {
      items.head :: first(items.tail, count - 1)
    }
    else {
      Nil
    }
  }

}

object FirstNNumbers extends App {

  val firstN = new FirstNNumbers_api
  print("Enter total elements in List: ")
  val totalElements = readInt()
  print(s"Enter $totalElements Elements:\n")
  val inputList = List.fill(totalElements) {
    readLine()
  }
  print("Enter First N Elements to take: ")
  val count = readInt()
  print("Using Built-in Take Operation: ")
  if (count > inputList.length) print("First N Elements to take is greater than size of List") else print(firstN.first(inputList, count))
  print("\nUsing For Loop: ")
  if (count > inputList.length) print("First N Elements to take is greater than size of List") else print(firstN.firstUsingLoop(inputList, count))
  print("\nUsing FoldLeft: ")
  if (count > inputList.length) print("First N Elements to take is greater than size of List") else print(firstN.firstUsingFoldLeft(inputList, count))
  print("\nUsing Recursion: ")
  if (count > inputList.length) print("First N Elements to take is greater than size of List") else print(firstN.firstRecursive(inputList, count))

}
