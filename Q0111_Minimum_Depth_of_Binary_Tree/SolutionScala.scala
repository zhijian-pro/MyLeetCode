package Q0111_Minimum_Depth_of_Binary_Tree

/**
  * @ Description:
  * @ Date: Created in 11:36 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def minDepth(root: TreeNode): Int = {

    if (root == null) {
      return 0
    }

    if (root.left == null) {
      return minDepth(root.right) + 1
    }
    if (root.right == null) {
      return minDepth(root.left) + 1
    }

    math.min(minDepth(root.left), minDepth(root.right)) + 1
  }

  def main(args: Array[String]): Unit = {
    val root = new TreeNode(1)
    root.left = null
    root.right = new TreeNode(2)

    println(minDepth(root))
  }


}
