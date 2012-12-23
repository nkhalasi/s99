/**
 * User: nkhalasi
 * Date: 20/12/12
 * Time: 10:08 PM
 */
package in.njk.s99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P01._

@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite {
  test("lastInList - String") {
    assert("A" === lastInList(List("B", "C", "D", "A")))
  }

  test("lastInList - single element list") {
    assert("a" === lastInList(List("a")))
  }

  test("lastInList - emtpty list") {
    intercept[NoSuchElementException] {
      lastInList(List())
    }
  }

  test("lastInList - list of names") {
    assert("Naresh" === lastInList(List("Jasmine", "Krishang", "Naresh")))
  }

  test("lastInList - list of Numbers") {
    assert(10 === lastInList((1 to 10) toList))
  }

  test("lastRecursive - String") {
    assert("A" === lastRecursive(List("B", "C", "D", "A")))
  }

  test("lastRecursive - single element list") {
    assert("a" === lastInList(List("a")))
  }

  test("lastRecursive - emtpty list") {
    intercept[NoSuchElementException] {
      lastRecursive(List())
    }
  }

  test("lastRecursive - list of names") {
    assert("Naresh" === lastRecursive(List("Jasmine", "Krishang", "Naresh")))
  }

  test("lastRecursive - list of Numbers") {
    assert(10 === lastRecursive((1 to 10) toList))
  }
}