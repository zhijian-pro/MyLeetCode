package Q0011_Container_With_Most_Water;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ Description:给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @ Date: Created in 08:58 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    /**
     * 输入 [1,8,6,2,5,4,8,3,7]
     * 输出: 49
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {


        //保存面积的最大堆
        PriorityQueue<Integer> s = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        //保存高的最大堆
        PriorityQueue<Integer> h = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j + i < height.length; j++) {
                h.add(Math.min(height[j], height[j + i]));
            }
            s.add(i * h.peek());
            h.clear();
        }

        return s.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int re = new Solution().maxArea(arr);
        System.out.println(re);
    }
}
