/**
 * User: nkhalasi
 * Date: 29/12/12
 * Time: 9:02 PM
 */

package in.njk.s99

/**
 * Check if a list is a palindrome
 */
object P06 {
    def isPalindrome[T](xs:List[T]): Boolean = {
        val (part1, part2) = xs splitAt xs.size/2
        if (part1.size == part2.size) part1 == part2.reverse else part1 == part2.slice(1,part2.size).reverse
    }
}
