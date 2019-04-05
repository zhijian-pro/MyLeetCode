package Q0092_Reverse_Linked_List_II;

/**
 * @ Description:反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。1 ≤ m ≤ n ≤ 链表长度。
 * @ Date: Created in 19:57 2019-04-05
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

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        /**
         * 规划边界 (,first]  [first+1,last-1]   [last,)
         */
        // 前半部分
        ListNode first = dummyHead;
        for (int i = 0; i < m - 1; i++) {
            first = first.next;
        }


        //后半部分
        ListNode last = dummyHead;
        for (int i = 0; i <= n; i++) {
            last = last.next;
        }

        //翻转部分 [first+1,last-1]

        ListNode curr = first.next;
        ListNode prev = last;
        for (int i = m; i < n; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        first.next = curr;
        return dummyHead.next;

    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }


    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("Null\n");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ListNode head = createLinkedList(arr);
        printLinkedList(head);

        ListNode head2 = new Solution().reverseBetween(head, 3, 5);
        printLinkedList(head2);

    }
}





