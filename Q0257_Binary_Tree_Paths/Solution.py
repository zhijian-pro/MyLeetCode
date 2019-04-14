# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def binaryTreePaths(self, root: TreeNode):
        res = []
        if root is None:
            return res

        if root.left is None and root.right is None:
            res.append(str(root.val))
            return res
        left_res = self.binaryTreePaths(root.left)
        for i in left_res:
            res.append(str(root.val) + "->" + i)
        right_res = self.binaryTreePaths(root.right)
        for i in right_res:
            res.append(str(root.val) + "->" + i)
        return res
