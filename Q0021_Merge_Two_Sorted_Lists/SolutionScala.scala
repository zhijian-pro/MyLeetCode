package Q0021_Merge_Two_Sorted_Lists

/**
  * @ Description:
  * @ Date: Created in 16:48 2019-04-06
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {

    val dummyHead = new ListNode
    var curr = dummyHead
    var p = l1
    var q = l2
    while (p != null && q != null) {
      if (p.x < q.x) {
        curr.next = p
        curr = curr.next
        p = p.next
      } else {
        curr.next = q
        curr = curr.next
        q = q.next
      }
    }
    if (p == null) {
      curr.next = q
    } else {
      curr.next = p
    }
    dummyHead.next
  }
}
