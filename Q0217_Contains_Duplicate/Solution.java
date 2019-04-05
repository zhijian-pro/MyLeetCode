package Q0217_Contains_Duplicate;

import java.util.HashSet;

/**
 * @ Description:
 * @ Date: Created in 14:21 2019-04-05
 * @ Author: Anthony_Duan
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hst = new HashSet<>();
        for (int num : nums) {
            if (hst.contains(num)) {
                return true;
            } else {
                hst.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(new Solution().containsDuplicate(arr));
    }
}
