package Q0709_To_Lower_Case;

/**
 * @ Description:
 * @ Date: Created in 08:39 2019-03-28
 * @ Author: Anthony_Duan
 */
public class Solution {

    public String toLowerCase(String str) {


        StringBuffer stb = new StringBuffer();
        for (char t : str.toCharArray()) {
            stb.append((char) t >= 'A' && t <= 'Z' ? (32 + t) : t);
        }

        return stb.toString();
    }

    public static void main(String[] args) {
        String s = "abcABC";

        String re = new Solution().toLowerCase(s);
        System.out.println(re);

    }
}
