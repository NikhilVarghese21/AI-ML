// Author - Nikhil Varghese

package com.knoldus.Question1

import java.util.Date


class ConsoleLibrary {

  // converts string to date.
  def strToDate(s: String): Date = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  print("\ntoString method of Console Class:\n")

  val Xbox2 = new Console("Microsoft", "X", strToDate("2020-11-10"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)

  print(Xbox2)

  val PS5 = new Console("Sony", "Ultimate", strToDate("2020-12-12"), Some("a/b/g"),
    List(new DvdMediaFormat), new HD)

  print(PS5)

  val NintendoSwitch = new Console("Nintendo", "Standard", strToDate("2017-01-04"), Some("b/g/n"),
    List(new BluRayMediaFormat, new DvdMediaFormat), new FHD)

  print(NintendoSwitch)

  val PS4 = new Console("Sony", "Deluxe", strToDate("2018-12-30"), Some("g/n"),
    List(new USBMediaFormat), new UHD4K)

  print(PS4)

}
