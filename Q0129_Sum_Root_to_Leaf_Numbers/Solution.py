# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    sum = 0

    def sumNumbers(self, root: TreeNode) -> int:
        self.my_sumnumbers(root, 0)
        return self.sum

    def my_sumnumbers(self, root: TreeNode, pre_sum: int):
        if root is None:
            return

        curr_sum = pre_sum * 10 + root.val

        if root.left is None and root.right is None:
            self.sum += curr_sum

        self.my_sumnumbers(root.left, curr_sum)
        self.my_sumnumbers(root.right, curr_sum)
