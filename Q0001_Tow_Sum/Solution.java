package Q0001_Tow_Sum;

/**
 * @ Description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @ Date: Created in 22:57 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        //暴力解法
        int[] re = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    re[0] = i;
                    re[1] = j;
                }
            }
        }
        return re;
    }


    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] x = new Solution().twoSum(nums, target);
        for (int t : x) {
            System.out.println(t + " ");
        }
    }
}
