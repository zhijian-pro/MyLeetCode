package Q0092_Reverse_Linked_List_II

/**
  * @ Description:
  * @ Date: Created in 11:34 2019-04-07
  * @ Author: Anthony_Duan
  */
object SolutionScala {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def reverseList(head: ListNode) = {
    var ans: ListNode = null
    var curr = head
    while (curr != null) {
      val tmp = curr.next
      curr.next = ans
      ans = curr
      curr = tmp
    }
    ans
  }


  def reverseKGroup(head: ListNode, k: Int): ListNode = {

    var dealEnd: ListNode = null
    var toDeal = head
    var i = 0
    while (toDeal != null && i < k) {
      dealEnd = toDeal
      toDeal = toDeal.next
      i += 1
    }
    if (i != k) {
      return head
    }


    dealEnd.next = null
    val ans = reverseList(head)
    head.next = reverseKGroup(toDeal, k)
    ans
  }

}
