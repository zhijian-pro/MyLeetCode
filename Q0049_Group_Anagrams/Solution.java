package Q0049_Group_Anagrams;

import java.util.*;

/**
 * @ Description:给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * @ Date: Created in 09:35 2019-04-05
 * @ Author: Anthony_Duan
 */
public class Solution {


    /**
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     * ["ate","eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     *
     * @param strs
     * @return
     */
    public ArrayList groupAnagrams(String[] strs) {


        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList(map.values());

    }

    public static void main(String[] args) {


        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> arrayList = new Solution().groupAnagrams(arr);
        System.out.println(arrayList);
    }

}
