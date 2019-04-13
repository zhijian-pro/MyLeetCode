package Q0100_Same_Tree

/**
  * @ Description:
  * @ Date: Created in 12:44 2019-04-13
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) {
      return true
    }

    if (p != null && q != null && p.value == q.value) {
      isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    } else
      return false

  }

}
