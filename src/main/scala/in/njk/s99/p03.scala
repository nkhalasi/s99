/**
 * User: nkhalasi
 * Date: 23/12/12
 * Time: 6:01 PM
 */

package in.njk.s99

/**
 * Find the Kth element of a list.
 */
object P03 {
    def nth[T](n: Int, xs: List[T]): T =
        if (xs isEmpty) throw new NoSuchElementException
        else if (n < 0) throw new NoSuchElementException
        else if (n > xs.size) throw new NoSuchElementException
        else xs(n)

    def nthRecursive[T](n: Int, xs: List[T]): T = (n, xs) match {
        case (0, elem :: _) => elem //first element
        case (n, _ :: rest) => nthRecursive(n - 1, rest)
        case (_, Nil) => throw new NoSuchElementException //empty list
    }
}

