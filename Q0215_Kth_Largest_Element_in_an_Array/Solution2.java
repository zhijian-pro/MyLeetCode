package Q0215_Kth_Largest_Element_in_an_Array;

import java.util.PriorityQueue;

/**
 * @ Description:
 * @ Date: Created in 12:12 2019-03-18
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public int findKthLargest(int[] nums, int k) {

        //使用面向最小堆的优先队列
        //O(N) best case / O(N^2) worst case running time + O(1) memory
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int t : nums) {
            pq.add(t);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int x = new Solution2().findKthLargest(arr, 2);
        System.out.println(x);

    }
}
