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


  var last: Double = -Double.MaxValue
  var isFirst = true

  def isValidBST(root: TreeNode): Boolean = {

    if (root == null) {
      return true
    }
    if (isValidBST(root.left)) {
      if (last < root.value || isFirst) {
        isFirst = false
        last = root.value
        return isValidBST(root.right)
      }
    }

    false
  }

  def main(args: Array[String]): Unit = {
    println(isValidBST(new TreeNode(0)))
  }
}
