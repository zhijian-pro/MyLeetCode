# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    is_first = True
    last = float('-inf')

    def isValidBST(self, root: TreeNode) -> bool:
        if root is None:
            return True
        if self.isValidBST(root.left):
            if self.last < root.val or self.is_first:
                self.is_first = False
                self.last = root.val
                return self.isValidBST(root.right)
        return False
