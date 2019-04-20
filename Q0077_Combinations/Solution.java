package Q0077_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Date: Created in 15:52 2019-04-20
 * @ Author: Anthony_Duan
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        res.clear();
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        List<Integer> c = new ArrayList<>();
        generateCombinations(n, k, 1, c);

        return res;
    }

    private void generateCombinations(int n, int k, int start, List<Integer> c) {
        if (c.size() == k) {
            res.add(new ArrayList<>(c));
            return;
        }
        //剪枝操作
        for (int i = start; i <= n - (k - c.size()) + 1; i++) {
            c.add(i);
            generateCombinations(n, k, i + 1, c);
            c.remove(c.size() - 1);
        }

    }


    public static void main(String[] args) {
        System.out.println(new Solution().combine(4, 2));
    }

}
