package Q0283_Move_Zeroes;

/**
 * @ Description: 不使用最后的赋值0，直接交换位置
 * @ Date: Created in 15:06 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution3 {
    public void moveZeroes(int[] nums) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, k++, i);
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String args[]) {

        int[] arr = {1, 0, 3, 0, 12, 0};

        (new Solution3()).moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
