package Q0098_Validate_Binary_Search_Tree;

/**
 * @ Description:
 * @ Date: Created in 22:24 2019-04-14
 * @ Author: Anthony_Duan
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    //定义一个最小的数字
    double last = -Double.MAX_VALUE;
    //标记是否是根节点 根节点要做特殊处理
    boolean isFirst = true;

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (isValidBST(root.left)) {
            if (last < root.val || isFirst) {
                isFirst = false;
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
