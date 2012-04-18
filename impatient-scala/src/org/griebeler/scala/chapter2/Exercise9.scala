package org.griebeler.scala.chapter2

object Exercise9 {

  def calculateUnicodeProduct(string: String): Int = {
    if(string.isEmpty())
      1
    else 
      string.last.toInt * calculateUnicodeProduct(string.dropRight(1))
  }
}