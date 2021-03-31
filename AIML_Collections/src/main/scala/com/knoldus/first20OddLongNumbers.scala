// Author - Nikhil Varghese

package com.knoldus

class first20OddLongNumbers_Api {

  // returns first 20 ODD LONG NUMBERS USING FOR LOOP
  def listOf20OddNumbersUsingLoop: List[Long] ={
   (for (i <- 0L to 9L; j = i * 2 + 1) yield j).toList
  }

  // returns first 20 ODD LONG NUMBERS USING FILTER OPERATION
   def listOf20OddNumbersUsingFilter : List[Long] = {
     (0L to 20L filter (_ % 2 == 1)).toList
   }

  // returns first 20 ODD LONG NUMBERS USING MAP OPERATION. The most efficient way.
  def listOf20OddNumbersUsingMap: List[Long] = {
    (0L to 9L map (_ * 2 + 1)).toList
  }
}

object first20OddLongNumbers extends App {

  val first20 = new first20OddLongNumbers_Api()
  print("First 20 ODD LONG NUMBERS USING FOR LOOP: ")
  print(first20.listOf20OddNumbersUsingLoop)

  print("\nFirst 20 ODD LONG NUMBERS USING FILTER OPERATION: ")
  print(first20.listOf20OddNumbersUsingFilter)

  print("\nFirst 20 ODD LONG NUMBERS USING MAP OPERATION: ")
  print(first20.listOf20OddNumbersUsingMap)

}
