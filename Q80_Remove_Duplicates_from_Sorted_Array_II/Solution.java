package Q80_Remove_Duplicates_from_Sorted_Array_II;

/**
 * @ Description:给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @ Date: Created in 20:16 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int removeDuplicates(int[] nums) {

        //[1,1,1,2,2,2,2,2,3]
        if (nums.length <= 2) {
            return nums.length;
        }
        //index 所指的是当前元素允许重复最大次数后的后一个位置
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int x = new Solution().removeDuplicates(arr);
        System.out.println(x);
        for (int i = 0; i < x; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
