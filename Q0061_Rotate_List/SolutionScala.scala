package Q0061_Rotate_List

/**
  * @ Description:
  * @ Date: Created in 14:06 2019-04-07
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def rotateRight(head: ListNode, k: Int): ListNode = {

    if (head == null || k == 0) {
      return head
    }
    val dummyHead = new ListNode
    dummyHead.next = head
    var p = head
    var count = 0
    while (p != null) {
      count += 1
      p = p.next
    }

    val newk = if (k < count) k else k % count

    var q = dummyHead
    for (_ <- 0 until newk) {
      q = q.next
    }
    p = dummyHead
    while (q.next != null) {
      p = p.next
      q = q.next
    }

    q.next = dummyHead.next
    dummyHead.next = p.next
    p.next = null

    dummyHead.next


  }


}
