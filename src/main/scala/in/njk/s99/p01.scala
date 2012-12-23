/**
 * User: nkhalasi
 * Date: 20/12/12
 * Time: 10:02 PM
 */
package in.njk.s99

/**
 * Find the last element of a list.
 */
object P01 {
  def lastInList[T](xs: List[T]) = xs.last

  def lastRecursive[T](xs: List[T]): T = xs match {
    case elem :: Nil => elem
    case _ :: xs1 => lastRecursive(xs1)
    case _ => throw new NoSuchElementException
  }
}