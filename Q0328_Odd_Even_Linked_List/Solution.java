package Q0328_Odd_Even_Linked_List;

/**
 * @ Description:
 * @ Date: Created in 23:44 2019-04-05
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
     * 输入: 1->2->3->4->5->NULL
     * 输出: 1->3->5->2->4->NULL
     *
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode o = head;
        ListNode p = o.next;
        ListNode e = p;
        while (o.next != null && e.next != null) {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }

        o.next = p;
        return head;

    }
}
