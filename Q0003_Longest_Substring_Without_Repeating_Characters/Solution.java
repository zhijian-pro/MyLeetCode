package Q0003_Longest_Substring_Without_Repeating_Characters;

/**
 * @ Description:
 * @ Date: Created in 15:25 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {


        //使用滑动窗口
        int l = 0;
        int r = -1;
        int[] ch = new int[256]; //这里使用256长度的数组，以字母的ASCII码为索引，保存字母出现的次数
        int res = 0;
        StringBuilder stb = new StringBuilder(s);

        while (l < s.length()) {
            if (r + 1 < s.length() && ch[Integer.valueOf(stb.charAt(r + 1))] == 0) {
                r++;
                ch[Integer.valueOf(stb.charAt(r))]++;

            } else {
                ch[Integer.valueOf(stb.charAt(l))]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int res = new Solution().lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}

