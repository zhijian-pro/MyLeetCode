package Q0461_Hamming_Distance;

/**
 * @ Description:两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * @ Date: Created in 14:39 2019-04-01
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int hammingDistance(int x, int y) {

        int count = 0;
        //异或运算，返回的是x y转换为二进制后进行异或运算然后返回结果的的十进制表示
        int tmp = x ^ y;
        //查二进制由几个1，这用到与运算，如果都是1结果为1
        while (tmp != 0) {
            count++;
            tmp = (tmp - 1) & tmp;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1, 4));
    }
}
