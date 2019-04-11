package Q0102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ Description:
 * @ Date: Created in 11:11 2019-04-11
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

    public List<List<Integer>> levelOrder(TreeNode root) {


        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> re = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> ls = new ArrayList<>();
            while (count > 0) {
                TreeNode node = queue.poll();

                assert node != null;

                ls.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            re.add(ls);
        }
        return re;
    }

}
