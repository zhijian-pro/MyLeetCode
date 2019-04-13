# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:
            return True
        return self.my_is_symmetric(root.left, root.right)

    def my_is_symmetric(self, left_node: TreeNode, right_node: TreeNode) -> bool:
        if left_node is None and right_node is None:
            return True
        if left_node is None or right_node is None:
            return False
        if left_node.val != right_node.val:
            return False
        if self.my_is_symmetric(left_node.left, right_node.right) and self.my_is_symmetric(left_node.right,
                                                                                           right_node.left):
            return True
        return False
