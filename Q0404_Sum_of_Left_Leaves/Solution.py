# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def sumOfLeftLeaves(self, root: TreeNode) -> int:
        count = 0
        if root is None:
            return 0
        if root.left is not None and root.left.left is None and root.left.right is None:
            count += root.left.val

        count += self.sumOfLeftLeaves(root.left)
        count += self.sumOfLeftLeaves(root.right)
        return count
