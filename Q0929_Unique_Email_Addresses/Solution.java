package Q0929_Unique_Email_Addresses;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Description:
 * @ Date: Created in 23:48 2019-03-29
 * @ Author: Anthony_Duan
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String domain = emails[i].split("@")[1];
            String local = emails[i].split("@")[0];
            String newLocal = localName(local);
            set.add(newLocal + domain);
        }


        return set.size();

    }

    private String localName(String local) {
        StringBuilder stb = new StringBuilder(local);
        for (int i = 0; i < stb.length(); i++) {
            if (stb.charAt(i) == '+') {
                return stb.substring(0, i);
            } else if (stb.charAt(i) == '.') {
                stb.deleteCharAt(i);
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {

        String[] ss = {"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(new Solution().numUniqueEmails(ss));

    }

}
