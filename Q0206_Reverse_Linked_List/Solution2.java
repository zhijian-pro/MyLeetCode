package Q0206_Reverse_Linked_List;

/**
 * @ Description:
 * @ Date: Created in 18:13 2019-04-05
 * @ Author: Anthony_Duan
 */

class ListNode2 {
    int val;
    ListNode next;

    ListNode2(int x) {
        val = x;
    }
}

public class Solution2 {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        //这里的head是从倒数第二层开始，倒数第一层返回的是head
        head.next.next = head;
        head.next = null;
        return p;
    }
}
