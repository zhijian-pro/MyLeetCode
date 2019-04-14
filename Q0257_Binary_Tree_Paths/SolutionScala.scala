package Q0257_Binary_Tree_Paths

import scala.collection.mutable

/**
  * @ Description:
  * @ Date: Created in 16:29 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  def binaryTreePaths(root: TreeNode): List[String] = {

    val res = mutable.ListBuffer[String]()
    if (root == null) {
      return res.toList
    }
    if (root.left == null && root.right == null) {
      res += root.value.toString
      return res.toList
    }

    val leftRes = binaryTreePaths(root.left)
    for (elem <- leftRes) {
      res += root.value.toString + "->" + elem
    }
    val rightRes = binaryTreePaths(root.right)
    for (elem <- rightRes) {
      res += root.value.toString + "->" + elem
    }

    res.toList

  }

}
