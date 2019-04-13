package Q0226_Invert_Binary_Tree

/**
  * @ Description:
  * @ Date: Created in 12:20 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def swap(root: TreeNode) = {
    val tmp = root.left
    root.left = root.right
    root.right = tmp
  }

  def invertTree(root: TreeNode): TreeNode = {

    if (root == null) {
      return null
    }
    swap(root)
    invertTree(root.left)
    invertTree(root.right)
    root
  }

}
