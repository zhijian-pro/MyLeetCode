package Q0019_Remove_Nth_Node_From_End_of_List;

/**
 * @ Description:
 * @ Date: Created in 12:27 2019-04-07
 * @ Author: Anthony_Duan
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead, q = dummyHead;
        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }

        while (q != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummyHead.next;
    }


}
