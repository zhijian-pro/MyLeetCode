package Q0206_Reverse_Linked_List

/**
  * @ Description:
  * @ Date: Created in 19:04 2019-04-05
  * @ Author: Anthony_Duan
  */


//Definition for singly-linked list.
//class ListNode(var _x: Int = 0) {
//  var next: ListNode = null
//  var x: Int = _x
//}

object SolutionScala {
  def reverseList(head: ListNode): ListNode = {

    if (head == null || head.next == null) {
      return head
    }
    val p = reverseList(head.next)
    head.next.next = head
    head.next = null
    p
  }


}
