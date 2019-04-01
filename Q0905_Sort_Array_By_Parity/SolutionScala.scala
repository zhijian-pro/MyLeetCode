package Q0905_Sort_Array_By_Parity

/**
  * @ Description:
  * @ Date: Created in 08:14 2019-04-01
  * @ Author: Anthony_Duan
  */
object SolutionScala {


  /**
    * 输入：[3,1,2,4]
    * 输出：[2,4,3,1]
    * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
    */
  def sortArrayByParity(A: Array[Int]): Array[Int] = {

    val re = new Array[Int](A.length)
    var p = 0
    var q = A.length - 1
    for (i <- A.indices) {

      if (A(i) % 2 == 0) {
        re(p) = A(i)
        p += 1
      }
      else {
        re(q) = A(i)
        q -= 1
      }
    }
    re
  }

  def main(args: Array[String]): Unit = {
    sortArrayByParity(Array[Int](3, 1, 2, 4)).foreach(println)
  }
}
