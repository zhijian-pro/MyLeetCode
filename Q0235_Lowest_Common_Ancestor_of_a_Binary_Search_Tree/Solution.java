package Q0235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

/**
 * @ Description:
 * @ Date: Created in 22:01 2019-04-14
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        //第一种情况 p q 都在节点的左侧
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        //第二种情况 p q 都在节点的右侧
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        //第三种情况 root是与p和q都相连的父节点  或者q是p的父节点 或者q是p的父节点 这三种情况都是返回root就好了
        return root;
    }
}
