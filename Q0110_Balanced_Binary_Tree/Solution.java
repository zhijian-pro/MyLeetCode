package Q0110_Balanced_Binary_Tree;

/**
 * @ Description:
 * @ Date: Created in 13:50 2019-04-13
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


    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int lh = getHigh(root.left);
        int rh = getHigh(root.right);
        if (Math.abs(lh - rh) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getHigh(node.left);
        int right = getHigh(node.right);

        return left >= right ? left + 1 : right + 1;

    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.left = new TreeNode(7);
        System.out.println(new Solution().isBalanced(head));


    }

}
