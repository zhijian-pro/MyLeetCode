package Q0009_Palindrome_Number;

/**
 * @ Description:判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @ Date: Created in 19:59 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        StringBuilder t = new StringBuilder(Integer.toString(x));
        StringBuilder old = new StringBuilder(t);
        t.reverse();
        if (old.toString().equals(t.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int i = 121;
        System.out.println(new Solution().isPalindrome(i));
    }
}
