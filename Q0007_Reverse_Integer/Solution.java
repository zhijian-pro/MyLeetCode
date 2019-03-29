package Q0007_Reverse_Integer;

/**
 * @ Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @ Date: Created in 18:52 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Solution {


    public int reverse(int x) {


        if (x == 0) {
            return 0;
        } else {
            StringBuilder stb = new StringBuilder(Integer.toString(x));
            if (x < 0) {
                stb.deleteCharAt(0);
            }
            stb.reverse();
            while (true) {
                int i = 0;
                if (stb.charAt(i) == '0') {
                    stb.deleteCharAt(i);
                } else {
                    break;
                }
            }
            long t = Long.valueOf(stb.toString());
            if (x > 0) {
                return t > Integer.MAX_VALUE ? 0 : (int) t;

            } else {
                return t * -1 < Integer.MIN_VALUE ? 0 : -1 * (int) t;
            }
        }
    }


    public static void main(String[] args) {
        int i = -105000;
        System.out.println(new Solution().reverse(i));
    }

}
