package Q0082_Remove_Duplicates_from_Sorted_List_II;

/**
 * @ Description:
 * @ Date: Created in 14:07 2019-04-06
 * @ Author: Anthony_Duan
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    /**
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->5
     */


    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode left, right;

        while (p.next != null) {
            left = p.next;
            right = left;
            while (right.next != null && right.next.val == left.val) {
                right = right.next;
            }
            if (left == right) {
                p = p.next;
            } else {
                p.next = right.next;
            }
        }
        return dummyHead.next;
    }
}
