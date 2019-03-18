package Q0215_Kth_Largest_Element_in_an_Array;


import java.util.Arrays;

/**
 * @ Description: 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @ Date: Created in 11:01 2019-03-18
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {

        //使用数组进行排序
        //O(N lg N) running time + O(1) memory
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int x = new Solution().findKthLargest(arr, 2);
        System.out.println(x);

    }
}
