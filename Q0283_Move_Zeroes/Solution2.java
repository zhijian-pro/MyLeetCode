package Q0283_Move_Zeroes;

/**
 * @ Description: 原地(in place)解决该问题
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 * @ Date: Created in 14:59 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public void moveZeroes(int[] nums) {
        // [0...k)的元素均为非0元素
        int k = 0;

        // 遍历到第i个元素后,保证[0...i]中所有非0元素
        // 都按照顺序排列在[0...k)中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        // 剩余的都放0
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 2, 0, 2, 0,};
        new Solution2().moveZeroes(arr);
        for (int a : arr) {
            System.out.printf(a + " ");
        }
    }
}
