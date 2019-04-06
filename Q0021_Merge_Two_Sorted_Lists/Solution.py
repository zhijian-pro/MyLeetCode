# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy_head = ListNode
        curr = dummy_head
        while l1 is not None and l2 is not None:
            if l1.val < l2.val:
                curr.next = l1
                curr = curr.next
                l1 = l1.next
            else:
                curr.next = l2
                curr = curr.next
                l2 = l2.next

        if l1 is None:
            curr.next = l2
        else:
            curr.next = l1

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
    head1 = create_linked_list([1, 2, 4])
    head2 = create_linked_list([1, 3, 4])
    head3 = Solution().mergeTwoLists(head1, head2)
    print_linked_list(head3)
