package Q0049_Group_Anagrams

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * @ Description:
  * @ Date: Created in 12:17 2019-04-05
  * @ Author: Anthony_Duan
  */
object SolutionScala {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {


    val map = mutable.HashMap[String, ListBuffer[String]]()
    for (s <- strs) {
      if (map.contains(s.sorted)) {
        map(s.sorted) += s
      }
      else
        map(s.sorted) = ListBuffer[String](s)
    }
    map.values.map(_.toList).toList

  }


  def main(args: Array[String]): Unit = {
    val re = groupAnagrams(Array[String]("eat", "tea", "tan", "ate", "nat", "bat"))
    println(re)
  }

}
