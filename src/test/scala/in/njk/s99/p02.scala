/**
 * User: nkhalasi
 * Date: 22/12/12
 * Time: 1:09 PM
 */
package in.njk.s99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P02._

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite {
  test("lastButOne - String") {
    assert("D" === lastButOne(List("B", "C", "D", "A")))
  }

  test("lastButOne - single element list") {
    intercept[NoSuchElementException] {
      lastButOne(List("a"))
    }
  }

  test("lastButOne - emtpty list") {
    intercept[NoSuchElementException] {
      lastButOne(List())
    }
  }

  test("lastButOne - list of names") {
    assert("Krishang" === lastButOne(List("Jasmine", "Krishang", "Naresh")))
  }

  test("lastButOne - list of Numbers") {
    assert(9 === lastButOne((1 to 10) toList))
  }

  test("lastButOneRecursive - String") {
    assert("D" === lastButOneRecursive(List("B", "C", "D", "A")))
  }

  test("lastButOneRecursive - single element list") {
    intercept[NoSuchElementException] {
      lastButOne(List("a"))
    }
  }

  test("lastButOneRecursive - emtpty list") {
    intercept[NoSuchElementException] {
      lastButOneRecursive(List())
    }
  }

  test("lastButOneRecursive - list of names") {
    assert("Krishang" === lastButOneRecursive(List("Jasmine", "Krishang", "Naresh")))
  }

  test("lastButOneRecursive - list of Numbers") {
    assert(9 === lastButOneRecursive((1 to 10) toList))
  }
}