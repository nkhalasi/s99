/**
 * User: nkhalasi
 * Date: 29/12/12
 * Time: 9:25 PM
 */
package in.njk.s99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P06._

@RunWith(classOf[JUnitRunner])
class P06Suite extends FunSuite {
    test("palindrome list of integers (zero size)") {
        assert (true == isPalindrome(List()))
    }
    test("palindrome list of integers (one element)") {
        assert (true == isPalindrome(List(1)))
    }
    test("palindrome list of integers (even size)") {
        assert (true == isPalindrome(List(1,2,3,3,2,1)))
    }
    test("non-palindrome list of integers (even size)") {
        assert (false == isPalindrome(List(1,2,3,4,2,1)))
    }
    test("palindrome list of integers (odd size)") {
        assert (true == isPalindrome(List(1,2,3,2,1)))
    }
    test("non-palindrome list of integers (odd size)") {
        assert (false == isPalindrome(List(1,2,3,3,1)))
    }
}
