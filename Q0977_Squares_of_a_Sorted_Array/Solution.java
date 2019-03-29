package Q0977_Squares_of_a_Sorted_Array;


/**
 * @ Description:
 * @ Date: Created in 16:35 2019-03-28
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(A[i], 2);
        }

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int t = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = t;
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int[] a = {-3, -2, -1, 2, 3, 4};
        int[] re = new Solution().sortedSquares(a);


        for (int i : re) {
            System.out.println(i + " ");
        }

    }
}
