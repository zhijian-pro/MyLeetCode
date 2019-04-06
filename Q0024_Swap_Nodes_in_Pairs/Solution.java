package Q0024_Swap_Nodes_in_Pairs;

/**
 * @ Description:
 * @ Date: Created in 17:08 2019-04-06
 * @ Author: Anthony_Duan
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode node1, node2, next = null;

        while (p.next != null && p.next.next != null) {
            node1 = p.next;
            node2 = node1.next;
            next = node2.next;

            p.next = node2;
            node2.next = node1;
            node1.next = next;
            p = node1;
        }

        return dummyHead.next;


    }
}
