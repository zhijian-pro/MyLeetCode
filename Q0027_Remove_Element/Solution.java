package Q0027_Remove_Element;

/**
 * @ Description:给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @ Date: Created in 16:31 2019-03-17
 * @ Author: Anthony_Duan
 */
class Solution {
    public int removeElement(int[] nums, int val) {


        //注意只有一个的元素还要删除的情况
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 34, 5};
        int val = 3;

        int x = new Solution().removeElement(nums, val);
        for (int i = 0; i < x; i++) {
            System.out.printf(nums[i] + " ");
        }
        System.out.println();

        System.out.print(x);
    }
}
