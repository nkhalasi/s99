/**
 * User: nkhalasi
 * Date: 23/12/12
 * Time: 6:11 PM
 */

package in.njk.s99

import org.scalatest.FlatSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P03._

trait KthElementBehaviors { this: FlatSpec =>
    def emptyList[T](nthFunction: (Int, List[T]) => T) {
        it should "raise NoSuchElementException" in {
            intercept[NoSuchElementException] {
                nthFunction(-99, List())
            }
        }
    }

    def nonEmptyList[T](nthFunction:(Int, List[T]) => T, xs:List[T], expectedVals:List[(Int, T)]) {
        it should "return the first element in the list" in {
            val (pos, value) = expectedVals(0)
            assert(value === nthFunction(pos, xs))
        }
        it should "return the last element in the list" in {
            val (pos, value) = expectedVals(1)
            assert(value === nthFunction(pos, xs))
        }
        it should "return the nth element in the list" in {
            val (pos, value) = expectedVals(2)
            assert(value === nthFunction(pos, xs))
        }
        it should "raise NoSuchElementException for -ve index" in {
           intercept[NoSuchElementException] {
               nthFunction(-99, xs)
           }
        }
        it should "raise NoSuchElementException for index greater than list size" in {
            intercept[NoSuchElementException] {
                nthFunction((xs size) + 5, xs)
            }
        }
    }
}


@RunWith(classOf[JUnitRunner])
class P03Spec extends FlatSpec with KthElementBehaviors {
    def stringList = List("Naresh", "Jasmine", "Krishang", "Khalasi")
    def intList = (0 to 10) toList
    def charList = List('N', 'A', 'R', 'E', 'S', 'H')

    "An empty list - nth()" should behave like emptyList(nth)
    "An empty list - nthRecursive()" should behave like emptyList(nthRecursive)
    "An list of names - nth()" should behave like nonEmptyList(nth[String], stringList, List((0, "Naresh"), (3, "Khalasi"), (2, "Krishang")))
    "A list of names - nthRecursive()" should behave like nonEmptyList(nthRecursive[String], stringList, List((0, "Naresh"), (3, "Khalasi"), (2, "Krishang")))
    "A list of chars - nth()" should behave like nonEmptyList(nth[Char], charList, List((0, 'N'), (5, 'H'), (2, 'R')))
    "A list of chars - nthRecursive()" should behave like nonEmptyList(nthRecursive[Char], charList, List((0, 'N'), (5, 'H'), (2, 'R')))
    "An list of integers - nth()" should behave like nonEmptyList(nth[Int], intList, List((0, 0), (10, 10), (5, 5)))
    "An list of integers - nthRecursive()" should behave like nonEmptyList(nthRecursive[Int], intList, List((0, 0), (10, 10), (5, 5)))
}
