package org.griebeler.scala.chapter2

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Exercise6Test extends FunSuite {

  test("test Hello"){
    assert(825152896 === Exercise6.calculateUnicodeProduct("Hello"))
  }
}