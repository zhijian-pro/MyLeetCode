package Q0113_Path_Sum_II;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Date: Created in 16:51 2019-04-13
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

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        pathSum(root, sum, new ArrayList<Integer>());
        return res;
    }

    /**
     * @param root
     * @param sum
     * @param list 这个list保存的是路径
     */
    private void pathSum(TreeNode root, int sum, ArrayList<Integer> list) {

        //根节点为空 直接返回
        if (root == null) {
            return;
        }
        //当前节点放入路径中
        list.add(root.val);
        //如果节点是叶子节点，说明本路径到底了，这是如果sum刚好和节点值相等 证明这是符合条件的路径 加入到最后路径集合里去
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(list);
        }

        //这个要把当前的list备份一下传给右子树，而且需要在进入左子树前面
        ArrayList<Integer> list2 = new ArrayList<>(list);

        //如果不是叶子节点 依次递归进入左右子树
        if (root.left != null) {
            //这里要更新sum值
            pathSum(root.left, sum - root.val, list);
        }

        if (root.right != null) {
            //这里要用一个新的链表保存数据
            pathSum(root.right, sum - root.val, list2);
        }
    }
}
