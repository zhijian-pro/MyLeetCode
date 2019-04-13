package Q0101_Symmetric_Tree

/**
  * @ Description:
  * @ Date: Created in 13:22 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def isSymmetric(leftNode: TreeNode, rightNode: TreeNode): Boolean = {
    if (leftNode == null && rightNode == null) {
      return true
    }

    if (leftNode == null || rightNode == null) {
      return false
    }
    if (leftNode.value != rightNode.value) {
      return false
    }
    if (isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left)) {
      return true
    }
    false
  }

  def isSymmetric(root: TreeNode): Boolean = {

    if (root == null) {
      return true
    }
    isSymmetric(root.left, root.right)

  }
}
