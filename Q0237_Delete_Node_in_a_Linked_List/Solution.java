package Q0237_Delete_Node_in_a_Linked_List;

/**
 * @ Description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * @ Date: Created in 18:38 2019-03-29
 * @ Author: Anthony_Duan
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }

}
