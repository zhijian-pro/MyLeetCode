# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy_head = ListNode(0)
        curr = dummy_head
        carry = 0
        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            s = x + y + carry
            carry = s // 10
            curr.next = ListNode(s % 10)
            curr = curr.next

            if l1 is not None:
                l1 = l1.next
            if l2 is not None:
                l2 = l2.next

        if carry > 0:
            curr.next = ListNode(carry)

        return dummy_head.next


def create_linked_list(arr: list) -> ListNode:
    if len(arr) == 0:
        return None

    head = ListNode(arr[0])
    curr = head
    for i in arr[1:]:
        curr.next = ListNode(i)
        curr = curr.next
    return head


def print_linked_list(head: ListNode):
    while head:
        print(str(head.val) + "->", end="")
        head = head.next

    print("Null\n")


if __name__ == '__main__':
    head = create_linked_list([1, 2, 3, 4])
    head2 = create_linked_list([1, 2, 3, 4])
    print_linked_list(head)
    print_linked_list(head2)

    new_head = Solution().addTwoNumbers(head, head2)
    print_linked_list(new_head)
