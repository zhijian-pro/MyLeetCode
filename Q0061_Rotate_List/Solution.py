# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head is None or k == 0:
            return head
        dummy_head = ListNode
        dummy_head.next = head
        count = 0
        while head is not None:
            count += 1
            head = head.next

        k = k if k < count else k % count

        p, q = dummy_head, dummy_head
        for i in range(k):
            q = q.next

        while q.next is not None:
            p = p.next
            q = q.next

        q.next = dummy_head.next
        dummy_head.next = p.next
        p.next = None

        return dummy_head.next
