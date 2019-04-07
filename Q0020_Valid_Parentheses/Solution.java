package Q0020_Valid_Parentheses;

import java.util.Stack;

/**
 * @ Description:
 * @ Date: Created in 14:30 2019-04-07
 * @ Author: Anthony_Duan
 */
public class Solution {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> charst = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (cc == '(' || cc == '{' || cc == '[') {
                charst.push(cc);

            } else {

                if (charst.size() == 0) {
                    return false;
                }

                switch (cc) {
                    case ')':
                        if (charst.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (charst.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (charst.pop() != '[') {
                            return false;
                        }
                        break;
                    default:
                        break;
                }

            }
        }

        if (charst.size() != 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        boolean b = new Solution().isValid("()");
        System.out.println(b);
    }

}
