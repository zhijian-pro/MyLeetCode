package Q26Remove_Duplicates_from_Sorted_Array;

/**
 * @ Description:给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @ Date: Created in 18:14 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        int x = new Solution().removeDuplicates(arr);
        for (int t : arr) {
            System.out.printf(t + " ");
        }
        System.out.println();
        System.out.print(x);
    }
}

