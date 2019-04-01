package Q0461_Hamming_Distance

/**
  * @ Description:
  * @ Date: Created in 15:24 2019-04-01
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def hammingDistance(x: Int, y: Int): Int = {

    var count = 0
    var tmp = x ^ y
    while (tmp != 0) {
      count += 1
      tmp = (tmp - 1) & tmp
    }
    count

  }

  def main(args: Array[String]): Unit = {
    println(hammingDistance(1, 4))
  }
}
