package Q0771_Jewels_and_Stones;

/**
 * @ Description:
 * @ Date: Created in 00:04 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution2 {
    public int numJewelsInStones(String J, String S) {

        //使用字符串的indexof方法
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        int re = new Solution2().numJewelsInStones(J, S);
        System.out.println(re);

    }

}
