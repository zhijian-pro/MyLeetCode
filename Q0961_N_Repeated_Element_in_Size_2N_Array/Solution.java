package Q0961_N_Repeated_Element_in_Size_2N_Array;

/**
 * @ Description:在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * @ Date: Created in 15:44 2019-04-01
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int repeatedNTimes(int[] A) {

        //两种排列情况，1 至少有一对相邻的元素相等 2 相邻的两个元素都不相等
        //情况1
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                return A[i];
            }
        }

        //情况2
        if (A[0] == A[2] || A[0] == A[3]) {
            return A[0];
        } else {
            return A[1];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3};
        System.out.println(new Solution().repeatedNTimes(arr));
    }
}
