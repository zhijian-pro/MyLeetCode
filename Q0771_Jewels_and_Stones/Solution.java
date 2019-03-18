package Q0771_Jewels_and_Stones;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Description: 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * @ Date: Created in 23:48 2019-03-18
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {

        /**
         * 输入: J = "aA", S = "aAAbbbb"
         * 输出: 3
         */

        //HashMap方法实现

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        int sum = 0;
        for (int i = 0; i < J.length(); i++) {
            sum += map.getOrDefault(J.charAt(i), 0);
        }
        return sum;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        int re = new Solution().numJewelsInStones(J, S);
        System.out.println(re);

    }
}
