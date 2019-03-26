package Q0350_Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Description: 给定两个数组，编写一个函数来计算它们的交集。
 * @ Date: Created in 21:10 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        /**
         * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * 输出: [4,9]
         */

        Map<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> als = new ArrayList<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) != 0) {
                als.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] re = new int[als.size()];
        for (int i = 0; i < re.length; i++) {
            re[i] = als.get(i);
        }
        return re;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] re = new Solution().intersect(nums1, nums2);
        for (int i : re) {
            System.out.print(i + " ");

        }


    }
}
