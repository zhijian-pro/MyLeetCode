# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        dummy_head = ListNode
        dummy_head.next = head
        p = dummy_head
        while p.next is not None:
            left = p.next
            right = p.next
            while right.next is not None and right.next.val == left.val:
                right = right.next

            if left == right:
                p = p.next
            else:
                p.next = right.next

        return dummy_head.next
