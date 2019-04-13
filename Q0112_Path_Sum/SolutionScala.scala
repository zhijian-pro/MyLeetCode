package Q0112_Path_Sum

/**
  * @ Description:
  * @ Date: Created in 15:17 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def hasPathSum(root: TreeNode, sum: Int): Boolean = {

    if (root == null) {
      return false
    }
    if (root.left == null && root.right == null) {
      return root.value == sum
    }
    hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
  }
}
