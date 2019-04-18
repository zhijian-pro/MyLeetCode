package Q0136_Single_Number;

/**
 * @ Description:
 * @ Date: Created in 16:51 2019-04-17
 * @ Author: Anthony_Duan
 */
class Solution {
    /**
     * 异或同一个数两次，原数不变。
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        System.out.println(new Solution().singleNumber(arr));
    }
}
