package Q0020_Valid_Parentheses

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 15:13 2019-04-07
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def isValid(s: String): Boolean = {

    val stack = mutable.Stack[Char]()

    for (i <- s) {
      if (i == '(' || i == '{' || i == '[') {
        stack.push(i)
      } else {
        if (stack.isEmpty) {
          return false
        }

        var achar = stack.pop()
        achar match {
          case '(' => if (i != ')') return false
          case '{' => if (i != '}') return false
          case '[' => if (i != ']') return false
        }
      }
    }
    if (stack.size != 0) false else true
  }
}
