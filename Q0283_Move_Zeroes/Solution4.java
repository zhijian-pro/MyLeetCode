package Q0283_Move_Zeroes;

/**
 * @ Description:
 * @ Date: Created in 15:15 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution4 {
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

    public static void main(String[] args) {
        int[] arr = {2, 6, 0, 4, 1, 5, 0, 5, 0};

        new Solution4().moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");

        }
    }

}
