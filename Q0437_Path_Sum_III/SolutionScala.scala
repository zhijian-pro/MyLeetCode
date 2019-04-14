package Q0437_Path_Sum_III

/**
  * @ Description:
  * @ Date: Created in 21:49 2019-04-14
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def findPath(root: TreeNode, sum: Int): Int = {

    if (root == null) {
      return 0
    }

    var res = 0
    if (root.value == sum) {
      res += 1
    }

    res += findPath(root.left, sum - root.value)
    res += findPath(root.right, sum - root.value)
    res

  }

  def pathSum(root: TreeNode, sum: Int): Int = {

    if (root == null) {
      return 0
    }
    var res = findPath(root, sum)
    res += pathSum(root.left, sum)
    res += pathSum(root.right, sum)

    res
  }
}
