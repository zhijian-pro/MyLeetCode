package Q0061_Rotate_List;

/**
 * @ Description:
 * @ Date: Created in 13:03 2019-04-07
 * @ Author: Anthony_Duan
 */


class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}

public class Solution {


    /**
     * 说是循环旋转，但其实本质上是将尾部向前数第K个元素作为头，原来的头接到原来的尾上
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode q = dummyHead;

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        k = (k >= count) ? k % count : k;

        for (int i = 0; i < k; i++) {
            q = q.next;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = dummyHead.next;
        dummyHead.next = p.next;
        p.next = null;

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
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(arr);
        ListNode head2 = new Solution().rotateRight(head, 2);
        printLinkedList(head2);


    }

}
