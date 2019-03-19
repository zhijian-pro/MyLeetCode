package Q0209_Minimum_Size_Subarray_Sum;

/**
 * @ Description:给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。
 * 如果不存在符合条件的连续子数组，返回 0。
 * @ Date: Created in 13:54 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int minSubArrayLen(int s, int[] nums) {


        //使用滑动窗口
        int l = 0;
        int r = -1; //初始的时候 滑动窗口中没有任何元素
        int sum = 0;
        int res = nums.length + 1; //用于最后作比较 如果没有改变 就是没有符合条件的子数组

        while (l < nums.length) {

            if (r + 1 < nums.length && sum < s) {
                sum = sum + nums[++r];
            } else {
                sum = sum - nums[l++];
            }

            if (sum >= s) {
                res = Math.min(res, r - l + 1);  // r-l注意要+1
            }

        }
        if (res == nums.length + 1) {
            return 0;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 4, 3};
        int s = 7;
        int re = new Solution().minSubArrayLen(s, a);
        System.out.println(re);
    }
}
