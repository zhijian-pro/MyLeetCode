package Q0024_Swap_Nodes_in_Pairs

/**
  * @ Description:
  * @ Date: Created in 17:20 2019-04-06
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class ListNode(var x: Int = 0, var next: ListNode = null)


  def swapPairs(head: ListNode): ListNode = {
    val dummyHead = new ListNode
    dummyHead.next = head
    var p = dummyHead
    var node1: ListNode = null
    var node2: ListNode = null
    var next: ListNode = null

    while (p.next != null && p.next.next != null) {
      node1 = p.next
      node2 = node1.next
      next = node2.next

      p.next = node2
      node2.next = node1
      node1.next = next
      p = node1
    }

    dummyHead.next
  }


}
