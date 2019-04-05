package Q0217_Contains_Duplicate

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 14:29 2019-04-05
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def containsDuplicate(nums: Array[Int]): Boolean = {

    val hst = new mutable.HashSet[Int]()

    for (elem <- nums) {
      if (hst.contains(elem)) {
        return true
      } else {
        hst.add(elem)
      }
    }
    false

  }

  def main(args: Array[String]): Unit = {
    println(containsDuplicate(Array[Int](1, 2, 3, 1)))
  }

}
