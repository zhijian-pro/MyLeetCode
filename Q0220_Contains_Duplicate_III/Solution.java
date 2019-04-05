package Q0220_Contains_Duplicate_III;


import java.util.TreeSet;

/**
 * @ Description:
 * @ Date: Created in 14:46 2019-04-05
 * @ Author: Anthony_Duan
 */
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {


            Long ceiling = treeSet.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && treeSet.ceiling((long) nums[i] - t) <= (long) nums[i] + (long) t) {
                return true;
            }
            treeSet.add((long) nums[i]);
            if (treeSet.size() == k + 1) {
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 1, 5, 9};
        System.out.println(new Solution().containsNearbyAlmostDuplicate(arr, 2, 3));

    }
}
