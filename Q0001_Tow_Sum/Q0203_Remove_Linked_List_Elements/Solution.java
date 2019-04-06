package Q0001_Tow_Sum.Q0203_Remove_Linked_List_Elements;

/**
 * @ Description:
 * @ Date: Created in 12:20 2019-04-06
 * @ Author: Anthony_Duan
 */


public class Solution {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        /**
         * 注意这里返回的一定是dummyHead.next 不能是head
         * 因为可能头结点就是要删除的节点 但是head已经不是头结点了
         */
        return dummyHead.next;
    }
}
