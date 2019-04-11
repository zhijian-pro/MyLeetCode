package Q0103_Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ Description:
 * @ Date: Created in 14:43 2019-04-11
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> re = new LinkedList<>();

        if (root == null) {
            return re;
        }

        //双端队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean right2left = true;

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> ls = new ArrayList<>(count);

            if (right2left) {
                while (count > 0) {
                    TreeNode node = queue.pollLast();
                    assert node != null;
                    ls.add(node.val);
                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                    count--;
                }
            } else {
                while (count > 0) {
                    TreeNode node = queue.pollFirst();
                    assert node != null;
                    ls.add(node.val);
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    count--;
                }
            }
            right2left = !right2left;
            re.add(ls);
        }
        return re;
    }

}
