package Q0222_Count_Complete_Tree_Nodes;

/**
 * @ Description:
 * @ Date: Created in 13:34 2019-04-13
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

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
