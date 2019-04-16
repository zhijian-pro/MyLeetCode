package Q0098_Validate_Binary_Search_Tree

/**
  * @ Description:
  * @ Date: Created in 23:07 2019-04-14
  * @ Author: Anthony_Duan
  */


object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def isValidBST(root: TreeNode): Boolean = {
    var last: Int = -Int.MaxValue
    var isFirst: Boolean = true

    def _isValidBST(root: TreeNode): Boolean = {
      if (root == null) {
        return true
      }
      if (_isValidBST(root.left)) {
        if (last < root.value || isFirst) {
          isFirst = false
          last = root.value
          return _isValidBST(root.right)
        }
      }
      false
    }

    _isValidBST(root)
  }
}
