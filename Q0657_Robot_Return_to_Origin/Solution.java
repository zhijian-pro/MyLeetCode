package Q0657_Robot_Return_to_Origin;

/**
 * @ Description:移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 * 如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * @ Date: Created in 11:17 2019-04-01
 * @ Author: Anthony_Duan
 */
public class Solution {
    public boolean judgeCircle(String moves) {

        int[] count = {0, 0, 0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':
                    count[0]++;
                    break;
                case 'L':
                    count[1]++;
                    break;
                case 'U':
                    count[2]++;
                    break;
                case 'D':
                    count[3]++;
                    break;
                default:
            }
        }
        if (count[0] - count[1] == 0 && count[2] - count[3] == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().judgeCircle("LL"));
    }
}
