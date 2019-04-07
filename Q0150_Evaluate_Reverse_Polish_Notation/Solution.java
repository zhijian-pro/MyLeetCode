package Q0150_Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

/**
 * @ Description:
 * @ Date: Created in 19:48 2019-04-07
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                int re;
                switch (token) {
                    case "+":
                        re = a + b;
                        break;
                    case "-":
                        re = b - a;
                        break;
                    case "*":
                        re = a * b;
                        break;
                    case "/":
                        re = b / a;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + token);
                }
                stack.push(re);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] s = {"4", "-2", "/", "2", "-3", "-", "-"};
        System.out.println(new Solution().evalRPN(s));
    }

}
