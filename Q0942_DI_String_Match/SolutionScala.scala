package Q0942_DI_String_Match

/**
  * @ Description:
  * @ Date: Created in 22:53 2019-03-31
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def diStringMatch(S: String): Array[Int] = {
    //第一个I为0  第二个I为1 第一个D为len  第二个D为len-1
    val len = S.length
    val re = new Array[Int](len + 1)
    var I = 0
    var D = len

    for (i <- 0 until len) {

      if (S.charAt(i).equals('I')) {
        re(i) = I
        I += 1
      }
      else {
        re(i) = D
        D -= 1
      }
    }

    if (S.charAt(len - 1).equals('I')) {
      re(len) = re(len - 1) + 1
    }
    else {
      re(len) = re(len - 1) - 1
    }

    re
  }

  def main(args: Array[String]): Unit = {
    SolutionScala.diStringMatch("IDID").foreach(println)
  }
}
