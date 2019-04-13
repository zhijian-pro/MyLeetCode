package Q0404_Sum_of_Left_Leaves;

/**
 * @ Description:
 * @ Date: Created in 15:24 2019-04-13
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


    public int sumOfLeftLeaves(TreeNode root) {
        int count = 0;

        if (root == null) {
            return 0;
        }

        //如果是左叶子
        if (root.left != null && root.left.left == null && root.left.right == null) {
            count += root.left.val;

        }

        count += sumOfLeftLeaves(root.right);
        count += sumOfLeftLeaves(root.left);


        return count;
    }
}
