package org.griebeler.scala.chapter3

object Exercise5 {

  def average(input: Array[Double]) = {
    input.sum / input.length
  }
  
  def main(args: Array[String]) {
    println(average(Array(2.5, 5, 0)))
  }
}