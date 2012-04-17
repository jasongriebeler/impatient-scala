package org.griebeler.scala.chapter2

object Exercise1 {
  def signum(x: Int) = {
    if (x < 0)
      -1
    else if (x > 0)
      1
    else 
      0
  }
  
   def main(args: Array[String]) {
	  println(signum(10))
	  println(signum(-100))
	  println(signum(0))
    }

}