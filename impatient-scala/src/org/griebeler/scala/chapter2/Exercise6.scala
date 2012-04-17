package org.griebeler.scala.chapter2

object Exercise6 {

  def calculateUnicodeProduct(string: String) = {
    var total = 1
    for (ch <- string) {
      val i = ch.toInt
      total = total * i
    }
    total
  }

  def main(args: Array[String]): Unit = {
    println(calculateUnicodeProduct("HELLO"))

  }

}