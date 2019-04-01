package Q0942_DI_String_Match;

/**
 * @ Description:给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 * @ Date: Created in 22:23 2019-03-31
 * @ Author: Anthony_Duan
 */
public class Solution {

    public int[] diStringMatch(String S) {

        //第一个I为0  第二个I为1 第一个D为len  第二个D为len-1
        int len = S.length();
        int[] re = new int[len + 1];
        int I = 0;
        int D = len;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == 'I') {
                re[i] = I;
                I++;
            } else {
                re[i] = D;
                D--;
            }
        }
        if (S.charAt(len - 1) == 'I') {
            re[len] = re[len - 1] + 1;
        } else {
            re[len] = re[len - 1] - 1;
        }
        return re;
    }

    public static void main(String[] args) {
        for (int idid : new Solution().diStringMatch("IDID")) {
            System.out.println(idid + " ");
        }
    }
}
