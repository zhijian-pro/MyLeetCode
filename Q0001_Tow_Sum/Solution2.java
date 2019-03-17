package Q0001_Tow_Sum;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Description:
 * @ Date: Created in 23:15 2019-03-17
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //一遍 哈希表法
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{i, map.get(t)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] x = new Solution2().twoSum(nums, target);
        for (int t : x) {
            System.out.println(t + " ");
        }
    }

}
