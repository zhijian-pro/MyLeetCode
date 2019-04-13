package Q0111_Minimum_Depth_of_Binary_Tree;

/**
 * @ Description:
 * @ Date: Created in 11:15 2019-04-13
 * @ Author: Anthony_Duan
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left >= right ? right + 1 : left + 1;
    }

}
