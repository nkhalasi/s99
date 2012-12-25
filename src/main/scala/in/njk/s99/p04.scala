/**
 * User: nkhalasi
 * Date: 25/12/12
 * Time: 5:36 PM
 */

package in.njk.s99

/**
 * Find the number of elements of a list.
 */
object P04 {
    def lengthOfList[X](xs: List[X]): Int = xs length

    // From: http://aperiodic.net/phil/scala/s-99/p04.scala
    // Tail recursive solution. Theoretically more efficient; with tail-call elimination in the compiler,
    // this would run in constant space. Unfortunately, the JVM doesn't do tail-call elimination in the
    // generalcase.  Scala *will* do it if the method is either final or is a local function.  In this case,
    // `lengthOfListInner` is a local function, so it should be properly optimized. For more information, see
    // http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
    def lengthOfListRecursive[X](xs: List[X]): Int = {
        def lengthOfListInner[X](result: Int, ls: List[X]): Int = ls match {
            case Nil => result
            case _ :: ls1 => lengthOfListInner(result+1, ls1)
        }
        lengthOfListInner(0, xs)
    }

    // Functional Solution based on reduce/fold
    def lengthOfListReduce[X](xs: List[X]): Int = xs.foldLeft(0) { (c, _) => c+1 }
}