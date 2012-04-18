package org.griebeler.scala.chapter2

object Exercise7 {

  def calculateUnicodeProduct(string: String) = {
    var total = 1
    string.foreach(ch => total *= ch.toInt)
    total
  }
}