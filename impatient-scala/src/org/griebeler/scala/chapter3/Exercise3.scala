package org.griebeler.scala.chapter3
import scala.util.Random

object Exercise3 {
  def swapAdjacent(array: Array[Int]) = {
    for (i <- 0 until array.length) yield {
      if (i == array.length-1)
        array(i)
      else if(i % 2 == 0)
        array(i+1)
      else
        array(i-1)
    }
  }

  def main(args: Array[String]) {
    val original = Array(1, 2, 3, 4, 5)
    println(swapAdjacent(original))
  }
}