# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        dummy_head = ListNode
        dummy_head.next = head
        p = dummy_head
        while p.next is not None and p.next.next is not None:
            node1, node2, next = p.next, p.next.next, p.next.next.next
            p.next = node2
            node2.next = node1
            node1.next = next
            p = node1
        return dummy_head.next
