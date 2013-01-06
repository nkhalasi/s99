package in.njk.s99
/**
 * Created by nkhalasi on 6/1/13 6:54 PM
 */

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

import P07._

@RunWith(classOf[JUnitRunner])
class P07Suite extends FunSuite {
    test("flatten a list of integers") {
        assert(List(1,2,3,4,5) === flattenNestedList((1 to 5) toList))
    }
    test("flatten a list of list of integers") {
        assert(List(1,2,3,2,3,4,3,4,5,6) === flattenNestedList(List((1 to 3) toList, (2 to 4) toList, (3 to 6) toList)))
    }
    test("flatten a list containing integers and list of integers") {
        assert(List(1,2,3,2,3,4,3,4,5,6) === flattenNestedList(List((1 to 3) toList, 2,3,4, (3 to 6) toList)))
    }
    test("flatten a list of list of integers with nesting level > 2") {
        assert(List(1,2,3,2,3,4,10,11,12,101,102,103,104,105,106,107,3,4,5,6) ===
                                                flattenNestedList(List((1 to 3) toList,
                                                                       List(2,3,4,
                                                                           (10 to 12) toList,
                                                                           List(101,102,
                                                                               (103 to 105) toList,
                                                                               106, List(), 107)),
                                                                       (3 to 6) toList)))
    }
}
