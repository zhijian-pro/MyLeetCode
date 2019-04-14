package Q0129_Sum_Root_to_Leaf_Numbers

/**
  * @ Description:
  * @ Date: Created in 11:58 2019-04-14
  * @ Author: Anthony_Duan
  */
class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object SolutionScala {


  def sumNumbers(root: TreeNode, prevSum: Int): Int = {
    var sum = 0
    if (root == null) {
      return 0
    }
    val currSum = prevSum * 10 + root.value
    if (root.left == null && root.right == null) {
      sum += currSum
    }

    sum += sumNumbers(root.left, currSum)
    sum += sumNumbers(root.right, currSum)
    sum
  }

  def sumNumbers(root: TreeNode): Int = {
    sumNumbers(root, 0)
  }


  def main(args: Array[String]): Unit = {
    val root = new TreeNode(4)
    root.left = new TreeNode(9);
    root.right = new TreeNode(0);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(1);
    println(sumNumbers(root))

  }
}
