/**
 * User: nkhalasi
 * Date: 23/12/12
 * Time: 6:11 PM
 */

package in.njk.s99

import org.scalatest.FunSuite
import org.scalatest.FlatSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P03._

trait Behaviors { this: FlatSpec =>
    def emptyList() {
        it should "raise NoSuchElementException when using nth()" in {
            intercept[NoSuchElementException] {
                nth(-99, List())
            }
        }
        it should "raise NoSuchElementException when using nthRecursive()" in {
            intercept[NoSuchElementException] {
                nthRecursive(-99, List())
            }
        }
    }

    def nonEmptyList[T](xs:List[T], expectedVals:List[(Int, T)]) {
        it should "return the first element in the list when using nth()" in {
            val (pos, value) = expectedVals(0)
            assert(value === nth(pos, xs))
        }
        it should "return the first element in the list when using nthRecursive()" in {
            val (pos, value) = expectedVals(0)
            assert(value === nthRecursive(pos, xs))
        }
        it should "return the last element in the list when using nth()" in {
            val (pos, value) = expectedVals(1)
            assert(value === nth(pos, xs))
        }
        it should "return the last element in the list when using nthRecursive()" in {
            val (pos, value) = expectedVals(1)
            assert(value === nthRecursive(pos, xs))
        }
        it should "return the nth element in the list when using nth()" in {
            val (pos, value) = expectedVals(2)
            assert(value === nth(pos, xs))
        }
        it should "return the nth element in the list when using nthRecursive()" in {
            val (pos, value) = expectedVals(2)
            assert(value === nthRecursive(pos, xs))
        }
        it should "raise NoSuchElementException for -ve index when using nth()" in {
           intercept[NoSuchElementException] {
               nth(-99, xs)
           }
        }
        it should "raise NoSuchElementException for -ve index when using nthRecursive()" in {
            intercept[NoSuchElementException] {
                nthRecursive(-99, xs)
            }
        }
        it should "raise NoSuchElementException for index greater than list size when using nth()" in {
            intercept[NoSuchElementException] {
                nth((xs size) + 5, xs)
            }
        }
        it should "raise NoSuchElementException for index greater than list size when using nthRecursive()" in {
            intercept[NoSuchElementException] {
                nthRecursive((xs size) + 5, xs)
            }
        }
    }
}


@RunWith(classOf[JUnitRunner])
class P03Spec extends FlatSpec with Behaviors {
    def stringList = List("Naresh", "Jasmine", "Krishang", "Khalasi")
    def intList = (0 to 10) toList
    def charList = List('N', 'A', 'R', 'E', 'S', 'H')

    "An empty list" should behave like emptyList()
    "An list of names" should behave like nonEmptyList(stringList, List((0, "Naresh"), (3, "Khalasi"), (2, "Krishang")))
    "An list of chars" should behave like nonEmptyList(charList, List((0, 'N'), (5, 'H'), (2, 'R')))
    "An list of integers" should behave like nonEmptyList(intList, List((0, 0), (10, 10), (5, 5)))
}
