package Q0257_Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Date: Created in 16:12 2019-04-13
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

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }

        List<String> ls = binaryTreePaths(root.left);
        for (String l : ls) {
            res.add(root.val + "->" + l);
        }
        List<String> rs = binaryTreePaths(root.right);
        for (String r : rs) {
            res.add(root.val + "->" + r);
        }

        return res;

    }
}
