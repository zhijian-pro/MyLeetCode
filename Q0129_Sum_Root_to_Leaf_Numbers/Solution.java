package Q0129_Sum_Root_to_Leaf_Numbers;

/**
 * @ Description:
 * @ Date: Created in 10:00 2019-04-14
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

    int sum = 0;
//    static int sum = 0; 这里不能这么写 因为LeetCode会多次调用本类，static会保存上一次的值

    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return sum;
    }

    private void sumNumbers(TreeNode root, int preSum) {

        if (root == null) {
            return;
        }

        //进入下一轮递归前，先计算到目前递归深度时的总和
        int currSum = preSum * 10 + root.val;
        //如果已经是叶子节点了，将本路径的和加到sum上
        if (root.left == null && root.right == null) {
            sum += currSum;
        }
        sumNumbers(root.left, currSum);
        sumNumbers(root.right, currSum);

    }

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(0);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(1);
//        System.out.println(new Solution().sumNumbers(root));
//
//    }

}
