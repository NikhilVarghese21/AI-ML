// Author - Nikhil Varghese

package com.knoldus.Question1

import java.util.Date

class Console(val make: String, val model: String, val debut: Date, val wifiType: Option[String],
                  val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution) {

  // overriding the toString method.
  override def toString: String = {
    s"GameConsole(Make: $make, Model: $model) launched on $debut.\n"
  }
}
