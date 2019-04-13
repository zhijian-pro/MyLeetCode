package Q0023_Merge_k_Sorted_Lists;


import java.util.PriorityQueue;

import static java.util.Comparator.comparingInt;

/**
 * @ Description:合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 用容量为K的最小堆优先队列，把链表的头结点都放进去，然后出队当前优先队列中最小的，挂上链表，
 * 然后让出队的那个节点的下一个入队，再出队当前优先队列中最小的，直到优先队列为空。
 * @ Date: Created in 17:40 2019-04-12
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

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(comparingInt(o -> o.val));

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }
        while (!pq.isEmpty()) {
            ListNode nextNode = pq.poll();
            curr.next = nextNode;
            curr = curr.next;
            if (nextNode.next != null) {
                pq.add(nextNode.next);
            }
        }
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

        int[] arr1 = {1, 4, 5};
        int[] arr2 = {1, 3, 4};
        int[] arr3 = {2, 6};


        ListNode head1 = createLinkedList(arr1);
        ListNode head2 = createLinkedList(arr2);
        ListNode head3 = createLinkedList(arr3);
        ListNode[] ls = new ListNode[3];
        ls[0] = head1;
        ls[1] = head2;
        ls[2] = head3;

        ListNode newHead = new Solution().mergeKLists(ls);
        printLinkedList(newHead);

    }
}
