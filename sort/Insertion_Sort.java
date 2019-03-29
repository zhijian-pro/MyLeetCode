package sort;

/**
 * @ Description:
 * @ Date: Created in 12:25 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Insertion_Sort {
    public int[] InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
        return arr;
    }


    private void swap(int[] arr, int j, int i) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private void printArrys(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 7, 0, -3, 2};
        Insertion_Sort is = new Insertion_Sort();
        is.printArrys(is.InsertionSort(arr));
    }
}
