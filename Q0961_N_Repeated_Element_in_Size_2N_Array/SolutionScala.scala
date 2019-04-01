package Q0961_N_Repeated_Element_in_Size_2N_Array

/**
  * @ Description:
  * @ Date: Created in 16:54 2019-04-01
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  def repeatedNTimes(A: Array[Int]): Int = {

    for (i <- A.indices) {
      if (i < A.length - 1 && A(i) == A(i + 1)) {
        return A(i)
      }
    }

    if (A(0) == A(2) || A(0) == A(3)) {
      return A(0)
    } else {
      return A(1)
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(5, 1, 5, 2, 5, 3, 5, 4)
    println(repeatedNTimes(arr))
  }
}
