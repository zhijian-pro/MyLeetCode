package sort;

/**
 * @ Description:
 * @ Date: Created in 11:39 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Selection_Sort {


    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int minIndex) {
        int t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;
    }

    private void printArrys(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 3, -1, 0, -12, 2, 6};

        Selection_Sort ss = new Selection_Sort();
        ss.printArrys(ss.selectionSort(arr));

    }
}