package org.griebeler.scala.chapter3
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Exercise4 {
  def reorder(input: Array[Int]) = {
    val b = ArrayBuffer[Int]()
    b ++= (for (elem <- input if elem < 0) yield elem)
    b ++= (for (elem <- input if elem == 0) yield elem)
    b ++= (for (elem <- input if elem > 0) yield elem)
  }

  def main(args: Array[String]) {
    val original = Array(1, -2, -3, 0, 5)
    println(reorder(original))
  }
}