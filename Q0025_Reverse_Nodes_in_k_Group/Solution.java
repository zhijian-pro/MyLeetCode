package Q0025_Reverse_Nodes_in_k_Group;

/**
 * @ Description:
 * @ Date: Created in 17:36 2019-04-06
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

    public ListNode reverseKGroup(ListNode head, int k) {

        /**
         * 每一次递归的时候的链表结构
         * [....dealEnd][toDeal...]
         */
        ListNode dealEnd = null;
        ListNode toDeal = head;
        int i = 0;
        while (toDeal != null && i < k) {
            dealEnd = toDeal;
            toDeal = toDeal.next;
            i++;
        }

        //递归终止条件 如果i不等于k表示剩余的长度不够k，不需要翻转，直接返回head
        if (i != k) {
            return head;
        }

        dealEnd.next = null;

        ListNode ans = reverseList(head);

        //head 是翻转后的最后一个节点
        head.next = reverseKGroup(toDeal, k);
        return ans;

    }

    /* 插头法翻转链表 */
    private ListNode reverseList(ListNode head) {

        ListNode ans = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = ans;
            ans = curr;
            curr = next;
        }
        return ans;
    }

}
