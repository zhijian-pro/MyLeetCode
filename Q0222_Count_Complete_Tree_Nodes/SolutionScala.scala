package Q0222_Count_Complete_Tree_Nodes

/**
  * @ Description:
  * @ Date: Created in 13:48 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def countNodes(root: TreeNode): Int = {

    if (root == null) {
      return 0
    }
    countNodes(root.left) + countNodes(root.right) + 1
  }
}
