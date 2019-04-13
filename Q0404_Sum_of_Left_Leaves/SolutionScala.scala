package Q0404_Sum_of_Left_Leaves

/**
  * @ Description:
  * @ Date: Created in 15:56 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def sumOfLeftLeaves(root: TreeNode): Int = {

    var count = 0
    if (root == null) {
      return 0
    }
    if (root.left != null && root.left.left == null && root.left.right == null) {
      count += root.left.value
    }
    count += sumOfLeftLeaves(root.left)
    count += sumOfLeftLeaves(root.right)
    count

  }

}
