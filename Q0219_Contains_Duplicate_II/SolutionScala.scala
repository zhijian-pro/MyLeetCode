package Q0219_Contains_Duplicate_II

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 13:07 2019-04-05
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {

    //使用窗口函数时间复杂度太高
    //    val re = nums.sliding(k + 1, 1)
    //    for (elem <- re) {
    //      if (elem.distinct.length != elem.length)
    //        return true
    //    }
    //    false

    val set = new mutable.HashSet[Int]()
    for (i <- nums.indices) {

      if (set.contains(nums(i))) {
        return true
      }
      set.add(nums(i))
      if (set.size == k + 1) {
        set.remove(nums(i - k))
      }
    }
    false
  }

  def main(args: Array[String]): Unit = {
    println(containsNearbyDuplicate(Array[Int](1, 2, 3, 1, 2, 3), 2))
  }
}
