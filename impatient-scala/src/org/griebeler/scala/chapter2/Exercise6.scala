package org.griebeler.scala.chapter2

object Exercise6 {

  def calculateUnicodeProduct(string: String) = {
    var total = 1
    for (ch <- string) {
      total*=ch.toInt
    }
    total
  }
}