package Q0086_Partition_List;

/**
 * @ Description:给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * @ Date: Created in 21:51 2019-04-05
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
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: 1->2->2->4->3->5
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode bigbegin = null;
        ListNode bigcurr = null;
        ListNode smallbegin = null;
        ListNode smallcurr = null;
        ListNode curr = head;
        while (curr != null) {

            if (curr.val < x) {
                if (smallbegin == null) {
                    smallbegin = smallcurr = curr;
                } else {
                    smallcurr.next = curr;
                    smallcurr = smallcurr.next;
                }
            } else {
                if (bigbegin == null) {
                    bigbegin = bigcurr = curr;
                } else {
                    bigcurr.next = curr;
                    bigcurr = bigcurr.next;
                }
            }
            curr = curr.next;

        }
        if (smallbegin != null) {
            smallcurr.next = bigbegin;
            if (bigcurr != null) {
                bigcurr.next = null;
            }
            return smallbegin;
        }
        bigcurr.next = null;
        return bigbegin;
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
        int[] arr = {1, 1};
        ListNode head = createLinkedList(arr);
        ListNode head2 = new Solution().partition(head, 2);
        printLinkedList(head2);
    }
}
