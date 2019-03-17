package Q0283_Move_Zeroes;

import java.util.ArrayList;

/**
 * @ Description:
 * @ Date: Created in 14:09 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution1 {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> nonZeroElements = new ArrayList<Integer>();

        // put all the non zero elements into a new vector
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeroElements.add(nums[i]);
            }
        }

        // make nums[0...nonZeroElements.size()) all non zero elements
        for (int i = 0; i < nonZeroElements.size(); i++) {
            nums[i] = nonZeroElements.get(i);
        }

        // make nums[nonZeroElements.size()...nums.size()) all zero elements
        for (int i = nonZeroElements.size(); i < nums.length; i++) {

            nums[i] = 0;
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int[] arr = {0, 1, 0, 3, 12};
        (new Solution1()).moveZeroes(arr);
        printArr(arr);
    }
}

