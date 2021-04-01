// Author - Nikhil Varghese

package com.knoldus.Question2

import scala.annotation.tailrec

class LinkedListHelper {
  // creates a Linked List.
  def create[A](items: A*):LinkedList[A] = {
    var result: LinkedList[A] = new EmptyList[A]
    for (item <- items.reverse) {
      result = new NonEmptyList[A](item, result)
    }
    result
  }
}

abstract class LinkedList[A] {
  def foreach(function: A => Unit): Unit
  def apply(index: Int): Option[A]

  // returns head value
  def headOption: Option[A] = apply(0)

  lazy val head: A = headOption.get

  def tail: LinkedList[A]

  def ::(a: A): LinkedList[A] = new NonEmptyList[A](a, this)

  // returns filtered list based on parameter passed in method.
  def filter(f: A => Boolean): LinkedList[A] = {
    @tailrec
    def filterLists(inputList: LinkedList[A], filteredList: LinkedList[A], f: A => Boolean): LinkedList[A] = {
      inputList.headOption match {
        case Some(i) if f(i) => filterLists(inputList.tail, i :: filteredList, f)
        case Some(i) => filterLists(inputList.tail, filteredList, f)
        case None => filteredList
      }
    }
    val result: LinkedList[A] = filterLists(this, new EmptyList[A], f)
    result.reverse
  }


  // returns the size of list.
  lazy val size: Int = {
    @tailrec
    def count(inputList: LinkedList[A], totalElements: Int): Int = {
      inputList.headOption match {
        case Some(i) => count(inputList.tail, totalElements + 1)
        case None => totalElements
      }
    }

    count(this, 0)
  }

  // returns the list after performing operations on the list based on parameter passed.
  def map[B](f: A => B): LinkedList[B] = {
    @tailrec
    def mapLists[B](inputList: LinkedList[A], updatedList: LinkedList[B], f: A => B): LinkedList[B] = {
      inputList.headOption match {
        case Some(i) => mapLists(inputList.tail, f(i) :: updatedList, f)
        case None => updatedList
      }
    }
    val result: LinkedList[B] = mapLists(this, new EmptyList[B], f)
    result.reverse
  }

  // list reverse
  lazy val reverse: LinkedList[A] = {
    @tailrec
    def reverseLists(inputList: LinkedList[A], reversedList: LinkedList[A]): LinkedList[A] = {
      inputList.headOption match {
        case Some(i) => reverseLists(inputList.tail, i :: reversedList)
        case None => reversedList
      }
    }
    reverseLists(this, new EmptyList[A])
  }
}

class NonEmptyList[A](val item: A, val tail: LinkedList[A]) extends LinkedList[A] {

  // iterates over each element in list and perform operation based on parameter passed in method.
  override def foreach(function: A => Unit): Unit = {
    function(item)
    tail.foreach(function)
  }

  // returns the value at particular index.
  override def apply(index: Int): Option[A] = {
    if (index < 1) Some(item) else tail.apply(index - 1)
  }
}

class EmptyList[A] extends LinkedList[A] {
  override def foreach(function: A => Unit): Unit = {}
  override def apply(index: Int): Option[A] = None
  override def tail: LinkedList[A] =  null
}


object LinkedListAbstract extends App {

  val list = new LinkedListHelper()
  val headList = 1
  val tailList = list.create(0, 1, 2, 3, 3, 2, 1, 0)

  /* NON-EMPTY LIST METHOD OPERATIONS */

  print("\nOPERATIONS ON NON EMPTY LIST: \n\n")
  val data = new NonEmptyList(headList,tailList)
  print("Elements in List: ")
  data.foreach(print)

  print("\nThird Element in List: " + data.apply(2))

  val tailElements = data.tail
  print("\nTail Elements in List: ")
  tailElements.foreach(print)

  print("\nHead value in List: " + data.head)

  print("\nSize of List is: " + data.size)

  val reversedList = data.reverse
  print("\nReversed List is: ")
  reversedList.foreach(print)

  print("\nFilter (Even Numbers in List): ")
  val filterResult = data.filter((_ % 2 == 0))
  filterResult.foreach(print)


  print("\nList after calling Map method (Multiplying each data by 3): ")
  val result = data.map(_ * 3)
  result.foreach(print)


  /* EMPTY LIST METHOD OPERATIONS */

  print("\n\nOPERATIONS ON EMPTY LIST: \n\n")

  val emptyList = new EmptyList()

  print("Elements in List: ")
  emptyList.foreach(print)

  print("\nThird Element in List: " + emptyList.apply(2))

  print("\nTail Elements in List: " + emptyList.tail)

  print("\nHead Element in List: " + emptyList.headOption)

  print("\nSize of List: " + emptyList.size)

  val reversedEmptyList = emptyList.reverse
  print("\nReverse of Non-Empty List: ")
  reversedEmptyList.foreach(print)

}


