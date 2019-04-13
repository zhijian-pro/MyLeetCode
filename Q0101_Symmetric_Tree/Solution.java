package Q0101_Symmetric_Tree;

/**
 * @ Description:
 * @ Date: Created in 12:48 2019-04-13
 * @ Author: Anthony_Duan
 */
public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        if (isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left)) {
            return true;
        }
        return false;
    }
}
