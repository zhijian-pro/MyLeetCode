package Q0438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ Description:给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * @ Date: Created in 15:59 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {


        //使用滑动窗口 然后把窗口内的字符放入到hashmap中 把p也放入到hashmap中 然后比较两个hashmap是否相等 可以直接使用equals方法
        int l = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> pmap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pmap.put(p.charAt(i), pmap.getOrDefault(p.charAt(i), 0) + 1);
        }
        while (l < s.length() - p.length() + 1) {
            HashMap<Character, Integer> tmp = new HashMap<>();
            for (int i = l; i < p.length() + l; i++) {
                tmp.put(s.charAt(i), tmp.getOrDefault(s.charAt(i), 0) + 1);
            }
            if (pmap.equals(tmp)) {
                list.add(l);
            }
            l++;
        }

        return list;

    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new Solution().findAnagrams(s, p);
        for (int t : list) {
            System.out.print(t + " ");
        }
    }


}
