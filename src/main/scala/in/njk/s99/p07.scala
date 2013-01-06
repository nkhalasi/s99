package in.njk.s99

/**
 * Created by nkhalasi on 6/1/13 6:46 PM
 */

/**
 * Flatten a nested list structure.
 */
object P07 {
    def flattenNestedList(ls: List[Any]): List[Any] = ls flatMap {x => x match {
            case ys: List[_] => flattenNestedList(ys)
            case elem => List(elem)
        }
    }
}
