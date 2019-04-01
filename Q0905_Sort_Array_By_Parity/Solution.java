package Q0905_Sort_Array_By_Parity;

/**
 * @ Description:给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * @ Date: Created in 07:58 2019-04-01
 * @ Author: Anthony_Duan
 */
public class Solution {

    /**
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     */
    public int[] sortArrayByParity(int[] A) {

        int[] re = new int[A.length];
        int p = 0, q = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                re[p++] = A[i];
            } else {
                re[q--] = A[i];
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        for (int i : new Solution().sortArrayByParity(arr)) {
            System.out.println(i);
        }
    }

}
