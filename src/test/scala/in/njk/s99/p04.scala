/**
 * User: nkhalasi
 * Date: 25/12/12
 * Time: 9:55 PM
 */

package in.njk.s99

import org.scalatest.FlatSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P04._

trait LengthBehaviors { this: FlatSpec =>
    def emptyList[T](lenFunction:List[T] => Int) {
        it should "return zero length" in {
            assert(0 == lenFunction(List()))
        }
    }

    def nonEmptyList[T](lenFunction:List[T] => Int, xs:List[T], expectedLen:Int) {
        it should "return non-zero length" in {
            assert(expectedLen == lenFunction(xs))
        }
    }
}


@RunWith(classOf[JUnitRunner])
class P04Spec extends FlatSpec with LengthBehaviors {
    def stringList = List("Naresh", "Jasmine", "Krishang", "Khalasi")
    def intList = (0 to 10) toList
    def charList = List('N', 'A', 'R', 'E', 'S', 'H')

    "On an empty list - lengthOfList()" should behave like emptyList(lengthOfList)
    "On an empty list - lengthOfListRecursive()" should behave like emptyList(lengthOfListRecursive)
    "On an empty list - lengthOfListReduce()" should behave like emptyList(lengthOfListReduce)

    "On a list of names - lengthOfList()" should behave like nonEmptyList(lengthOfList[String], stringList, 4)
    "On a list of names - lengthOfListRecursive()" should behave like nonEmptyList(lengthOfListRecursive[String], stringList, 4)
    "On a list of names - lengthOfListReduce()" should behave like nonEmptyList(lengthOfListReduce[String], stringList, 4)

    "On a list of chars - lengthOfList()" should behave like nonEmptyList(lengthOfList[Char], charList, 6)
    "On a list of chars - lengthOfListRecursive()" should behave like nonEmptyList(lengthOfListRecursive[Char], charList, 6)
    "On a list of chars - lengthOfListReduce()" should behave like nonEmptyList(lengthOfListReduce[Char], charList, 6)

    "On a list of integers - lengthOfList()" should behave like nonEmptyList(lengthOfList[Int], intList, 11)
    "On a list of integers - lengthOfListRecursive()" should behave like nonEmptyList(lengthOfListRecursive[Int], intList, 11)
    "On a list of integers - lengthOfListReduce()" should behave like nonEmptyList(lengthOfListReduce[Int], intList, 11 )
}
