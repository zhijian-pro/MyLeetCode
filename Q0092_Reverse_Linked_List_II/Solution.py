# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def revers_list(head):
    ans = ListNode
    curr = head
    while curr is not None:
        tmp = curr.next
        curr.next = ans
        ans = curr
        curr = tmp
    return ans


class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        deal_end = ListNode
        to_deal = head
        i = 0
        while to_deal is not None and i < k:
            deal_end = to_deal
            to_deal = to_deal.next
            i += 1

        if i != k:
            return head

        deal_end.next = None
        ans = revers_list(head)
        head.next = self.reverseKGroup(to_deal, k)
        return ans
