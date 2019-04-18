package Q0017_Letter_Combinations_of_a_Phone_Number

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 13:56 2019-04-18
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  var res = mutable.ListBuffer[String]()


  val letterMap = Array[String](
    "",
    " ",
    "abc",
    "def",
    "ghi",
    "jkl",
    "mno",
    "pqrs",
    "tuv",
    "wxyz")

  def findCombination(digits: String, index: Int, s: String): Unit = {
    if (digits.length == index) {
      res.append(s)
      return
    }
    val c = digits.charAt(index)

    val letters = letterMap(c.toInt - '0'.toInt)


    for (letter <- letters) {
      findCombination(digits, index + 1, s + letter)
    }

  }

  def letterCombinations(digits: String): List[String] = {

    res.clear()

    if ("".equals(digits)) {
      return res.toList
    }
    findCombination(digits, 0, "")
    res.toList
  }


  def main(args: Array[String]): Unit = {
    val s = "23"
    println(letterCombinations(s))
  }
}
