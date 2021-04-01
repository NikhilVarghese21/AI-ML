// Author - Nikhil Varghese

package com.knoldus.Question1

class Game(val name: String, val maker: String, val consoles: List[Console]) {

  //checks if game is supported by the console passed in as parameter.
  def isSupported(console: Console): Boolean = consoles.contains(console)

  // overriding the toString method.
  override def toString : String = s"Game($name, by $maker)"

}
