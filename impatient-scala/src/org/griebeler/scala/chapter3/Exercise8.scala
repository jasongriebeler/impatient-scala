package org.griebeler.scala.chapter3
import scala.collection.mutable.ArrayBuffer

object Exercise8 {

  def original(a: ArrayBuffer[Int]) = {
    val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
    for (j <- (1 until indexes.length).reverse) a.remove(indexes(j))
    a
  }
  
  def modified(a: ArrayBuffer[Int]) ={
    val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
    
  }

  def main(args: Array[String]) {
	  val buffer = ArrayBuffer(5, -1, -3, 5, 4, -2)
	  println(original(buffer))
  }
}