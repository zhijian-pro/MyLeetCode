package Q0167_Two_Sum_II_Input_array_is_sorted;

/**
 * @ Description:
 * @ Date: Created in 21:50 2019-03-18
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /**
         * 输入: numbers = [2, 7, 11, 15], target = 9
         * 输出: [1,2]
         * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
         *
         *
         * 使用对撞指针
         */


        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        throw new IllegalArgumentException("没有正确结果");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] x = new Solution().twoSum(arr, target);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
