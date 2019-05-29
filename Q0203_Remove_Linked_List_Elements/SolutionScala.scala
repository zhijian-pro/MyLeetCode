package Q0203_Remove_Linked_List_Elements

/**
  * @ Description:
  * @ Date: Created in 12:36 2019-04-06
  * @ Author: Anthony_Duan
  */
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x = _x
}


object SolutionScala {

  def removeElements(head: ListNode, `val`: Int): ListNode = {

    var dummyHead = new ListNode
    dummyHead.next = head
    var prev = dummyHead
    while (prev.next != null) {
      if (prev.next._x == `val`) {
        prev.next = prev.next.next
      } else {
        prev = prev.next
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
      print(myHead._x + "->")
      myHead = myHead.next
    }
    println("NULL")
  }


  def main(args: Array[String]): Unit = {

    val arr = Array[Int](1, 2, 2, 2, 3, 4, 5)
    val head = createLinkedList(arr)
    printLinkedList(head)
    val newHead = removeElements(head, 2)
    printLinkedList(newHead)

  }

}
