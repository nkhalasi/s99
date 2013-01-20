/**
 * Created by nkhalasi on 20/1/13 10:34 PM
 */
package in.njk.s99

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

import P08._

@RunWith(classOf[JUnitRunner])
class P08Suite extends FunSuite {
    test("Empty list gives back an empty list") {
        assert(Nil === dedupe(Nil))
        assert(List() === dedupe(List()))
        assert(Nil === dedupeTailRecursive(Nil))
    }

    test("Remove consecutive duplicates") {
        assert(List('a','b','a','c') === dedupe(List('a','a','b','b','b','a','c','c')))
        assert(List('a','b','a','c') === dedupeTailRecursive(List('a','a','b','b','b','a','c','c')))
    }
}
