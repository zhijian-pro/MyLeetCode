package Q0150_Evaluate_Reverse_Polish_Notation

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 21:37 2019-04-07
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def evalRPN(tokens: Array[String]): Int = {

    val stack = new mutable.Stack[Int]()

    for (elem <- tokens) {
      if (elem == "+" || elem == "-" || elem == "*" || elem == "/") {
        val a = stack.pop()
        val b = stack.pop()
        elem match {
          case "+" => stack.push(b + a)
          case "-" => stack.push(b - a)
          case "*" => stack.push(b * a)
          case "/" => stack.push(b / a)
        }
      } else {
        stack.push(elem.toInt)
      }
    }
    stack.pop()
  }


  def main(args: Array[String]): Unit = {
    val arr = Array[String]("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")

    println(evalRPN(arr))
  }
}
