package Q0657_Robot_Return_to_Origin

/**
  * @ Description:
  * @ Date: Created in 13:08 2019-04-01
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  def judgeCircle(moves: String): Boolean = {

    val count = new Array[Int](4)
    for (s <- moves) {
      s match {
        case 'R' => count(0) += 1
        case 'L' => count(1) += 1
        case 'U' => count(2) += 1
        case 'D' => count(3) += 1
      }
    }
    if (count(0) - count(1) == 0 && count(2) - count(3) == 0) {
      true
    }
    else {
      false
    }
  }

  def main(args: Array[String]): Unit = {
    println(judgeCircle("RL"))
  }
}
