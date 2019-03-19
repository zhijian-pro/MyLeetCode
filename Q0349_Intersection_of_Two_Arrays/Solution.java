package Q0349_Intersection_of_Two_Arrays;

import java.util.HashSet;

/**
 * @ Description: 给定两个数组，编写一个函数来计算它们的交集。
 * @ Date: Created in 19:50 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Object> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        //set 求交集操作
        set1.retainAll(set2);
        int[] re = new int[set1.size()];
        int i = 0;
        for (Object o : set1) {
            //Object对象转化为int类型
            re[i++] = Integer.parseInt(o.toString());

        }
        return re;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] re = new Solution().intersection(nums1, nums2);
        for (int r : re) {
            System.out.println(r);
        }
    }
}
