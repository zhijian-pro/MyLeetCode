package Q0104_Maximum_Depth_of_Binary_Tree;

/**
 * @ Description:
 * @ Date: Created in 10:59 2019-04-13
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


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.left = new TreeNode(7);
        System.out.println(new Solution().maxDepth(head));


    }

}
