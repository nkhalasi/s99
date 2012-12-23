/**
 * User: nkhalasi
 * Date: 22/12/12
 * Time: 12:07 PM
 */

package in.njk.s99

/**
 * Find the last but one element of a list.
 */
object P02 {
  def lastButOne[T](xs: List[T]): T =
    if (xs isEmpty) throw new NoSuchElementException
    else (xs init) last

  def lastButOneRecursive[T](xs: List[T]): T = xs match {
    case h :: _ :: Nil => h
    case _ :: xs1 => lastButOneRecursive(xs1)
    case _ => throw new NoSuchElementException
  }
}
