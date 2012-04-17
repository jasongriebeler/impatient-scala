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
}