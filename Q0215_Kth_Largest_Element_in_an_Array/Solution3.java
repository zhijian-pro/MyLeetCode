package Q0215_Kth_Largest_Element_in_an_Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ Description:
 * @ Date: Created in 12:17 2019-03-18
 * @ Author: Anthony_Duan
 */
public class Solution3 {
    public int findKthLargest(int[] nums, int k) {

        /**
         * 使用快排的partition思想，每次把标定点放到正确的位置上，如果位置在左边就继续对右边的进行partition操作
         */

        // 随机化标定点 如果选取某个固定的值作为分界点(左边小于当前值,右边大于当前值)，当排序的数组近乎有序，极有可能退化成O(n^2)级别的算法，
        // 因为拆分的数组极不均匀，两边的数组大小相差太大。如果采取随机化选取分界点，这样的化退化成O(n^2)几乎为零。
        Collections.shuffle(Arrays.asList(nums));

        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    //双路快排的partition
    private int partition(int[] nums, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (i < hi && less(nums[++i], nums[lo])) {
                ;
            }
            while (j > lo && less(nums[lo], nums[--j])) {
                ;
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private boolean less(int v, int w) {
        return v < w;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5};
        int x = new Solution3().findKthLargest(arr, 2);
        System.out.println(x);

    }

}
