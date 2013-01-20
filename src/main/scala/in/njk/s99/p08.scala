package in.njk.s99
/**
 * Created by nkhalasi on 6/1/13 7:25 PM
 */

/**
 * Eliminate consecutive duplicates of list elements.
 */
object P08 {
    def dedupeTailRecursive[A](data: List[A]): List[A] = {
        def dedupeInner(result: List[A], curr: List[A]): List[A] = curr match {
            case Nil => result.reverse
            case h::r => dedupeInner(h::result, r.dropWhile(_ == h))
        }
        dedupeInner(Nil, data)
    }

    def dedupe[A](data: List[A]): List[A] =
        data.foldRight(List[A]()) { (h, r) =>
            if (r.isEmpty || r.head != h) h::r else r
        }
}
