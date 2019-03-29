package Q0014_Longest_Common_Prefix;

import java.util.Arrays;

/**
 * @ Description:编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @ Date: Created in 21:06 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }


        //字符串排序规则 ASCII 比如 从小到大排序例子 aac  abc  abd abda b bc
        //所以对字符串排序后，最小与最大的公共最长前缀就是整个字符串数组的公共最长前缀
        Arrays.sort(strs);
        String min = strs[0];
        String max = strs[strs.length - 1];

        int i = 0;
        for (; i < min.length(); i++) {
            if (min.charAt(i) == max.charAt(i)) {
                continue;
            } else {
                break;
            }
        }

        return min.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strArr = {"flower", "flow", "flight"};
        System.out.println(new Solution().longestCommonPrefix(strArr));

    }
}
