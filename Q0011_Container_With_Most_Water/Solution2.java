package Q0011_Container_With_Most_Water;

/**
 * @ Description:
 * @ Date: Created in 10:41 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public int maxArea(int[] height) {

        // area 受限于两条边中最短的那个边限制 如果将最短的边往中间移动 可能得到更大的面积
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int re = new Solution2().maxArea(arr);
        System.out.println(re);
    }

}
