package Q0454_4Sum_II;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Description:给定四个包含整数的数组列表 A , B , C , D ,
 * 计算有多少个元组 (i, j, k, l) ，
 * 使得 A[i] + B[j] + C[k] + D[l] = 0。
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，
 * 且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，
 * 最终结果不会超过 231 - 1 。
 * @ Date: Created in 08:32 2019-03-26
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        /**
         * 将C D 中的元素相加放到map查找表中 然后利用查找表的特性降低时间复杂度
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int t = C[i] + D[j];
                map.put(t, map.getOrDefault(t, 0) + 1);
            }
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int t = A[i] + B[j];
                result += map.getOrDefault(0 - t, 0);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};

        int re = new Solution().fourSumCount(a, b, c, d);
        System.out.println(re);
    }

}
