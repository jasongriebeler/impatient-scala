package org.griebeler.scala.chapter2

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Exercise7Test extends FunSuite {

  test("test Hello"){
    assert(825152896 === Exercise7.calculateUnicodeProduct("Hello"))
  }
}