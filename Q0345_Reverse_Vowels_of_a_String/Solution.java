package Q0345_Reverse_Vowels_of_a_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ Description:编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * @ Date: Created in 08:18 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    /**
     * 输入: "hello"
     * 输出: "holle"
     */
    public String reverseVowels(String s) {

        StringBuilder stb = new StringBuilder(s);
        Character[] t = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> set = new HashSet<>(Arrays.asList(t));
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < s.length() && !set.contains(stb.charAt(l))) {
                l++;
            }
            while (r >= 0 && !set.contains(stb.charAt(r))) {
                r--;
            }
            if (l < r) {
                swap(stb, l++, r--);
            }
        }
        return stb.toString();
    }

    private void swap(StringBuilder stb, int l, int r) {
        char t = stb.charAt(l);
        stb.setCharAt(l, stb.charAt(r));
        stb.setCharAt(r, t);
    }

    public static void main(String[] args) {
        String s = "hello";
        String re = new Solution().reverseVowels(s);
        System.out.println(re);

    }
}
