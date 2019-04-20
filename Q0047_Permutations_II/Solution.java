package Q0047_Permutations_II;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ Description:
 * @ Date: Created in 14:48 2019-04-20
 * @ Author: Anthony_Duan
 */
public class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    //用数组判断当前数字是否使用过
    private Boolean[] used;


    public List<List<Integer>> permuteUnique(int[] nums) {
        res.clear();
        if (nums.length == 0) {
            return res;
        }
        used = new Boolean[nums.length];

        //数组快速填充
        Arrays.fill(used, false);

        List<Integer> p = new ArrayList<>();
        generatePermutation(nums, 0, p);
        //java8自带的去重方法
        List<List<Integer>> collect = res.stream().distinct().collect(Collectors.toList());
        return collect;

    }

    /**
     * 向这个队列末尾添加第index+1个元素获得第index+1长度的队列
     *
     * @param nums
     * @param index 当前队列的长度
     * @param p     中保留了一个由了index个元素的排列
     */
    private void generatePermutation(final int[] nums, int index, List<Integer> p) {
        if (index == nums.length) {
            //这里必须使用java深拷贝
            res.add(new ArrayList<>(p));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                p.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, index + 1, p);
                //将最后添加的元素去除掉 回溯回原来的状态，因为下次可能继续使用该元素
                p.remove(p.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(new Solution().permuteUnique(arr));
    }
}
