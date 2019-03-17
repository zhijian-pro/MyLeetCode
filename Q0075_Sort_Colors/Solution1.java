package Q0075_Sort_Colors;

/**
 * @ Description:给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * @ Date: Created in 21:58 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution1 {

    public void sortColors(int[] nums) {

        //使用计数排序 两趟扫描排序

        int[] count = new int[3];

        for (int t : nums) {
            count[t]++;
        }


//        int index = 0;
//        for (int i = 0; i < count[0]; i++) {
//            nums[index++] = 0;
//        }
//        for (int i = 0; i < count[1]; i++) {
//            nums[index++] = 1;
//        }
//        for (int i = 0; i < count[2]; i++) {
//            nums[index++] = 2;
//        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[index++] = i;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        new Solution1().sortColors(arr);
        for (int t : arr) {
            System.out.print(" " + t);

        }
    }
}
