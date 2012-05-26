package org.griebeler.scala.chapter3
import scala.collection.mutable.ArrayBuffer

object Exercise6 {
  
  def reverse(input: Array[Int]) = {
	  input.reverse
  }
  
  def reverse(input: ArrayBuffer[Int]) = {
    input.reverse
  }
  
  
  def main(args: Array[String]) {
	  println(reverse(Array(1, 2, 3)))
	  println(reverse(ArrayBuffer(1, 2, 3)))
  }
}