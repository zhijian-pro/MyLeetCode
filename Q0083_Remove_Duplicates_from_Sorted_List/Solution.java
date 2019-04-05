package Q0083_Remove_Duplicates_from_Sorted_List;

/**
 * @ Description:
 * @ Date: Created in 21:21 2019-04-05
 * @ Author: Anthony_Duan
 */


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * 1->1->2->3->3
 * 1->2->3
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        //一个节点或者没有节点
        if (head == null || head.next == null) {
            return head;
        }

        //至少两个节点的情况
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
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

        int[] arr = {1, 1, 2};
        ListNode head = createLinkedList(arr);
        printLinkedList(head);
        ListNode head2 = new Solution().deleteDuplicates(head);
        printLinkedList(head2);
    }
}
