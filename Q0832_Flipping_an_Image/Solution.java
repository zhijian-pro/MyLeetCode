package Q0832_Flipping_an_Image;

/**
 * @ Description:
 * @ Date: Created in 22:59 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int k = A[i].length - 1;
            for (int j = 0; j <= k; j++, k--) {
                if (A[i][j] != A[i][k]) {
                    continue;
                } else {
                    if (A[i][j] == 0) {
                        A[i][j] = A[i][k] = 1;
                    } else {
                        A[i][j] = A[i][k] = 0;
                    }
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int[][] aa = {{1, 1, 0}, {1, 0, 1}};
        int[][] bb = new Solution().flipAndInvertImage(aa);
        for (int[] ints : bb) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
