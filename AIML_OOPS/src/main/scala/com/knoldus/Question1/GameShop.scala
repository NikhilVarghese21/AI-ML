// Author - Nikhil Varghese

package com.knoldus.Question1

object GameShop extends App {

  val consoles = new ConsoleLibrary()

  // List of game objects.
  val games = List(
    new Game("COD", "Activision", List(consoles.Xbox2)),
    new Game("Fifa 21", "Electronic Arts", List(consoles.PS4, consoles.PS5)),
    new Game("Watch Dogs", "Ubisoft", List(consoles.NintendoSwitch)),
    new Game("Far Cry", "Ubisoft", List(consoles.Xbox2))
  )

  // Returns the console and game it supports.
  val consoleToGames: Map[Console, List[Game]] = {
    val consoleToGames1: List[(Console, Game)] = games flatMap (g => g.consoles.map(c => c -> g))
    val consoleToGames2: Map[Console, List[(Console, Game)]] = consoleToGames1 groupBy (_._1)
    val consoleToGames3: Map[Console, List[Game]] = consoleToGames2 mapValues(_ map (_._2))
    consoleToGames3
  }

  //prints a list of games, sorted first by maker and then by game name.
  def sortGames(): Unit = {
    games sortBy (g => s"${g.maker}_${g.name}") foreach { game =>
      val consoleInfo = game.consoles.map(c => s"${c.make} ${c.model}").mkString(", ")
      print(s"${game.name} by ${game.maker} for $consoleInfo \n")
    }
  }

  print("\ntoString method of Game Class:\n" + games)

  print("\n\nChecking if Far Cry isSupported by Xbox2: ")

  val farCry = new Game("Far Cry", "Ubisoft", List(consoles.Xbox2))
  print(farCry.isSupported(consoles.Xbox2))
  print("\nChecking if Far Cry isSupported by Nintendo Switch: ")
  print(farCry.isSupported(consoles.NintendoSwitch))


  print("\n\nList of games, sorted first by maker and then by game name: \n\n")
  sortGames()

  print("\n Games Supported by each Console: \n")
  for ((key,value) <- consoleToGames) printf("Console: %s gamesSupported: %s\n\n", key, value)

}

