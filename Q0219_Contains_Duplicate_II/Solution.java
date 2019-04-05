package Q0219_Contains_Duplicate_II;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Description:
 * @ Date: Created in 13:48 2019-04-05
 * @ Author: Anthony_Duan
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1};
        System.out.println(new Solution().containsNearbyDuplicate(arr, 2));
    }
}
