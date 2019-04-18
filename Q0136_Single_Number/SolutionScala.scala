package Q0136_Single_Number

/**
  * @ Description:
  * @ Date: Created in 16:55 2019-04-17
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  def singleNumber(nums: Array[Int]): Int = {

    var res = 0
    for (elem <- nums) {
      res = res ^ elem
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6)
    println(singleNumber(arr))
  }
}
