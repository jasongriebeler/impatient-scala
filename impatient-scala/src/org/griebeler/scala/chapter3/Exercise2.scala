package org.griebeler.scala.chapter3
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Exercise2 {
  def swapAdjacent(array: Array[Int]) = {
    val result = new ArrayBuffer[Int]()
    
    for (i <- 0 until array.length){
      if (i == array.length-1)
        result += array(i)
      else if(i % 2 == 0)
        result += array(i+1)
      else
        result += array(i-1)
    }
    result
  }

  def main(args: Array[String]) {
    val original = Array(1, 2, 3, 4, 5)
    println(swapAdjacent(original))
  }
}