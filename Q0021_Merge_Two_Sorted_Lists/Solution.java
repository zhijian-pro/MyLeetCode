package Q0021_Merge_Two_Sorted_Lists;

/**
 * @ Description:
 * @ Date: Created in 16:11 2019-04-06
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

    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }

        }
        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }

        return dummyHead.next;
    }

}
