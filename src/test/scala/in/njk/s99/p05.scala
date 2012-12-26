/**
 * User: nkhalasi
 * Date: 27/12/12
 * Time: 12:01 AM
 */

package in.njk.s99

import org.scalatest.FlatSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P05._

trait ReverseBehaviors { this: FlatSpec =>
    def emptyList[T](reverseFunction:List[T] => List[T]) {
        it should "return an empty list" in {
            assert(Nil == reverseFunction(Nil))
        }
    }

    def nonEmptyList[T](reverseFunction:List[T] => List[T], xs:List[T], reversed: List[T]) {
        it should "return the reversed list" in {
            assert(reversed == reverseFunction(xs))
        }
    }
}


@RunWith(classOf[JUnitRunner])
class P05Spec extends FlatSpec with ReverseBehaviors {
    def stringList = List("Naresh", "Jasmine", "Krishang", "Khalasi")
    def reversedStringList = "Khalasi"::"Krishang"::"Jasmine"::"Naresh"::Nil
    def intList = (1 to 5) toList
    def reversedIntList = List(5,4,3,2,1)
    def charList = List('N', 'A', 'R', 'E', 'S', 'H')
    def reversedCharList = List('H', 'S', 'E', 'R', 'A', 'N')

    "On an empty list - reverseList()" should behave like emptyList(reverseList)
    "On an empty list - reverseListRecursive()" should behave like emptyList(reverseListRecursive)
    "On an empty list - reverseUsingFoldLeft()" should behave like emptyList(reverseUsingFoldLeft)

    "On a list of names - reverseList()" should behave like nonEmptyList(reverseList[String], stringList, reversedStringList)
    "On a list of names - reverseListRecursive()" should behave like nonEmptyList(reverseListRecursive[String], stringList, reversedStringList)
    "On a list of names - reverseUsingFoldLeft()" should behave like nonEmptyList(reverseUsingFoldLeft[String], stringList, reversedStringList)

    "On a list of chars - reverseList()" should behave like nonEmptyList(reverseList[Char], charList, reversedCharList)
    "On a list of chars - reverseListRecursive()" should behave like nonEmptyList(reverseListRecursive[Char], charList, reversedCharList)
    "On a list of chars - reverseUsingFoldLeft()" should behave like nonEmptyList(reverseUsingFoldLeft[Char], charList, reversedCharList)

    "On a list of integers - reverseList()" should behave like nonEmptyList(reverseList[Int], intList, reversedIntList)
    "On a list of integers - reverseListRecursive()" should behave like nonEmptyList(reverseListRecursive[Int], intList, reversedIntList)
    "On a list of integers - reverseUsingFoldLeft()" should behave like nonEmptyList(reverseUsingFoldLeft[Int], intList, reversedIntList)

    "For a list with single element - reverseList()" should behave like nonEmptyList(reverseList[Int], List(2), List(2))
    "For a list with single element - reverseListRecursive()" should behave like nonEmptyList(reverseListRecursive[Int], List(2), List(2))
    "For a list with single element - reverseUsingFoldLeft()" should behave like nonEmptyList(reverseUsingFoldLeft[Int], List(2), List(2))
}
