package Q0082_Remove_Duplicates_from_Sorted_List_II

/**
  * @ Description:
  * @ Date: Created in 14:58 2019-04-06
  * @ Author: Anthony_Duan
  */

/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  * var next: ListNode = null
  * var x: Int = _x
  * }
  */


object SolutionScala {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def deleteDuplicates(head: ListNode): ListNode = {

    val dummyHead = new ListNode
    dummyHead.next = head
    var p = dummyHead
    var left: ListNode = null
    var right: ListNode = null
    while (p.next != null) {

      left = p.next
      right = left
      while (right.next != null && right.next.x == left.x) {
        right = right.next
      }
      if (left == right) {
        p = p.next
      } else {
        p.next = right.next
      }

    }
    dummyHead.next
  }

  def createLinkedList(arr: Array[Int]): ListNode = {

    if (arr.length == 0) {
      return null
    }
    val dummyHead = new ListNode
    var curr = dummyHead
    for (elem <- arr) {
      curr.next = new ListNode(elem)
      curr = curr.next
    }
    dummyHead.next
  }

  def printLinkedList(head: ListNode): Unit = {

    var myHead = head
    while (myHead != null) {
      print(myHead.x + "->")
      myHead = myHead.next
    }
    println("NULL")
  }


  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1, 1, 2)
    val head = createLinkedList(arr)
    val head2 = deleteDuplicates(head)
    printLinkedList(head2)
  }
}
