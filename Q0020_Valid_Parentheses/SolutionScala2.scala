package Q0020_Valid_Parentheses

/**
  * @ Description:
  * @ Date: Created in 15:35 2019-04-07
  * @ Author: Anthony_Duan
  */

import scala.collection.mutable.Stack

object SolutionScala2 {
  def isValid(s: String): Boolean = {
    val stack = new Stack[Char]
    s.foreach { x =>
      if (stack.nonEmpty && isMatch(stack.top, x)) {
        stack.pop()
      } else {
        stack.push(x)
      }
    }
    return stack.isEmpty
  }

  def isMatch(c: Char, v: Char): Boolean = {
    return (c == '(' && v == ')') ||
      (c == '{' && v == '}') ||
      (c == '[' && v == ']')
  }
}