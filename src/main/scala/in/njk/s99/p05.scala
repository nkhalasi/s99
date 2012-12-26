/**
 * User: nkhalasi
 * Date: 26/12/12
 * Time: 11:29 PM
 */

package in.njk.s99

/**
 * Reverse a list
 */
object P05 {
    def reverseList[T](xs:List[T]): List[T] = xs reverse
    def reverseUsingFoldLeft[T](xs: List[T]): List[T] = xs.foldLeft(List[T]()) { (accum, curr) => curr :: accum }
    def reverseListRecursive[T](xs: List[T]): List[T] = {
        def reverseListInner[T](accum: List[T], xs1: List[T]): List[T] = xs1 match {
            case Nil => accum
            case curr :: rest => reverseListInner(curr::accum, rest)
        }
        reverseListInner(List[T](), xs)
    }
}