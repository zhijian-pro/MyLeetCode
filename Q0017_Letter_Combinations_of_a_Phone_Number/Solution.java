package Q0017_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Date: Created in 12:55 2019-04-18
 * @ Author: Anthony_Duan
 */
public class Solution {

    private List<String> res = new ArrayList<>();
    private final static String[] LETTER_MAP = {
            "",
            " ",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };


    /**
     * 寻找 digits[index] 匹配的数字，获得digits[0...index]的翻译得到的一个字符串
     *
     * @param digits
     * @param index
     * @param s      保存了此时从digits[0...index-1]翻译到的一个字母字符串
     */
    private void findCombination(String digits, int index, String s) {

        if (index == digits.length()) {
            res.add(s);
            return;
        }
        char c = digits.charAt(index);

        assert (c >= '0' && c <= '9' && c != '1');
        String letters = LETTER_MAP[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits, index + 1, s + letters.charAt(i));
        }

    }

    public List<String> letterCombinations(String digits) {

        if ("".equals(digits)) {
            return res;
        }

        findCombination(digits, 0, "");
        return res;
    }


    public static void main(String[] args) {
        String s = "";
        System.out.println(new Solution().letterCombinations(s));
    }
}
