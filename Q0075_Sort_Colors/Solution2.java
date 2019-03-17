package Q0075_Sort_Colors;

/**
 * @ Description:
 * @ Date: Created in 22:14 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public void sortColors(int[] nums) {

        //利用三路快排的partition操作的思想 扫描一次
        int zero = -1;
        int two = nums.length;

        // 0[0...zero]   1[i...two) 2[two...len]


        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
            } else {
                swap(nums, i++, ++zero);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 0};
        new Solution2().sortColors(arr);
        for (int t : arr) {
            System.out.print(" " + t);

        }
    }
}
