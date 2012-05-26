package org.griebeler.scala.chapter3
import scala.collection.mutable.ArrayBuffer
import scala.runtime.ScalaRunTime._

object Exercise7 {

  def stripDuplicates(input: Array[Number]) = {
    input.toSet.toArray
  }

  def main(args: Array[String]) {
    println(stringOf(stripDuplicates(Array(1, 2, 2, 5))))
    println(stringOf(stripDuplicates(Array(1.1, 2.2, 2.2, 5.5))))
  }
}