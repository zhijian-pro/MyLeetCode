package Q0088_Merge_Sorted_Array;

/**
 * @ Description:给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * @ Date: Created in 23:38 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // 归并排序思想 从后往前排
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {4, 5, 0, 0, 0};
        int[] arr2 = {1, 2,};
        int n = 2, m = 2;
        new Solution().merge(arr1, m, arr2, n);
        for (int t : arr1) {
            System.out.print(t + " ");
        }
    }


}
