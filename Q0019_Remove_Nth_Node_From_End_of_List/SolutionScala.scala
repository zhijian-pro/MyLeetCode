package Q0019_Remove_Nth_Node_From_End_of_List

/**
  * @ Description:
  * @ Date: Created in 12:36 2019-04-07
  * @ Author: Anthony_Duan
  */
object SolutionScala {


  class ListNode(var x: Int = 0, var next: ListNode = null)

  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    val dummyHead = new ListNode()
    dummyHead.next = head
    var p = dummyHead
    var q = dummyHead
    for (i <- 0 to n) {
      q = q.next
    }

    while (q != null) {
      p = p.next
      q = q.next
    }

    p.next = p.next.next

    dummyHead.next
  }

}
