package org.griebeler.scala.chapter2

object Exercise5 {
	def countdown(n :Int) {
		for(x <- n to 0 by -1)
		  println(x)
	}
	
	def main(args : Array[String]) {
	  countdown(5)
	}
}