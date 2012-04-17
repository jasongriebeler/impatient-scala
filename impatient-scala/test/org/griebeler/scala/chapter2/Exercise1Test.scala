package org.griebeler.scala.chapter2
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Exercise1Test extends FunSuite{
  
  test("should be 1"){
    assert(1 === Exercise1.signum(10))
  }
  
  test("should be -1"){
    assert(-1 === Exercise1.signum(-100))
  }
  
  test("should be 0"){
    assert(0 === Exercise1.signum(0))
  }
  
  

}