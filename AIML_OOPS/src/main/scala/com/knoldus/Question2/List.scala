// Author - Nikhil Varghese

package com.knoldus.Question2

class List[A](items: A*) {

  // returns the head value.
  val item: Option[A] = items.headOption

  // returns tail of List if non empty else None.
  val next: Option[List[A]] = {
    if (item.isDefined) Some(new List(items.tail: _*)) else None
  }

  // iterates over each element in list and perform operation based on parameter passed in method.
  def foreach(function: A => Unit): Unit = {
    for {currentElement <- item; nextElement <- next} {
      function(currentElement)
      nextElement.foreach(function)
    }
  }
  // returns the value at particular index.
  def apply(index: Int): Option[A] = {
    if (index < 1) item else next flatMap (_.apply(index - 1))
  }
}


object List extends App {

  val inputList = new List(1, 2, 3, 0, 1, 2)
  print("Head Element: " + inputList.item)

  print("\nElements in List: ")
  inputList.foreach(print)

}
