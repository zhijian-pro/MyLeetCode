package Q0102_Binary_Tree_Level_Order_Traversal

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


/**
  * @ Description:
  * @ Date: Created in 11:40 2019-04-11
  * @ Author: Anthony_Duan
  */

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object SolutionScala {
  def levelOrder(root: TreeNode): List[List[Int]] = {

    if (root == null) {
      return List[List[Int]]()
    }
    val re = new ListBuffer[List[Int]]
    val queue = new mutable.Queue[TreeNode]

    queue.enqueue(root)

    while (queue.nonEmpty) {
      var count = queue.size
      val ls = new ListBuffer[Int]
      while (count > 0) {
        val node = queue.dequeue()
        ls.append(node.value)
        if (node.left != null) queue.enqueue(node.left)
        if (node.right != null) queue.enqueue(node.right)
        count -= 1
      }
      re.append(ls.toList)
    }
    re.toList
  }
}
