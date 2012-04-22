package org.griebeler.scala.chapter3
import scala.util.Random

object Exercise1 {
	def main(args: Array[String]) {
		val n = 5
		def a  = for( _ <- 0 until n) yield{
		  Random.nextInt(n)
		}
		println(a)
		  
	}
}