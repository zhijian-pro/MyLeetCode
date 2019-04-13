package Q0104_Maximum_Depth_of_Binary_Tree

/**
  * @ Description:
  * @ Date: Created in 11:11 2019-04-13
  * @ Author: Anthony_Duan
  */
class SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def maxDepth(root: TreeNode): Int = {


    if (root == null) {
      return 0
    }
    math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1)
  }

}
