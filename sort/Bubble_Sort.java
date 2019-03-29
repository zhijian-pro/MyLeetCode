package sort;

/**
 * @ Description:
 * @ Date: Created in 11:31 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Bubble_Sort {

    public int[] bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }

        return arr;

    }

    private void printArrys(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 7, 2, 8, 9, 3, -1, 0, -12, 6};
        Bubble_Sort bs = new Bubble_Sort();
        bs.bubbleSort(arr);
        bs.printArrys(arr);


    }
}
