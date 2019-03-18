package Q0125_Valid_Palindrome;

/**
 * @ Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * @ Date: Created in 22:14 2019-03-18
 * @ Author: Anthony_Duan
 */


public class Solution {
    public boolean isPalindrome(String s) {

        /**
         * 输入: "A man, a plan, a canal: Panama"
         * 输出: true
         */
        int l = 0;
        int r = s.length() - 1;
        String ss = s.toLowerCase();
        while (l < r) {

            while (l < r && !(Character.isLetter(ss.charAt(l)) || Character.isDigit(ss.charAt(l)))) {
                l++;
            }
            while (l < r && !(Character.isLetter(ss.charAt(r)) || Character.isDigit(ss.charAt(r)))) {
                r--;
            }
            if (ss.charAt(l) != ss.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = ",.";
//        String s = "race a car";
//        String s = "0P";
        boolean re = new Solution().isPalindrome(s);
        System.out.println(re);

    }
}
