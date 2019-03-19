package Q0535_Encode_and_Decode_TinyURL;

/**
 * @ Description:TinyURL是一种URL简化服务，
 * 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时，
 * 它将返回一个简化的URL http://tinyurl.com/4e9iAk.
 * @ Date: Created in 11:00 2019-03-19
 * @ Author: Anthony_Duan
 */
public class Solution {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        String head = longUrl.split("://")[0] + "://";

        StringBuilder sbt = new StringBuilder();
        char[] ch = longUrl.toCharArray();
        for (int i = head.length(); i < ch.length; i++) {
            char c = ch[i];
            sbt.append(Integer.valueOf(c) + 1);
            sbt.append("s");
        }
        sbt.insert(0, head);
        return sbt.toString();

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String head = shortUrl.split("://")[0] + "://";
        String tail = shortUrl.split("://")[1];
        String[] s = tail.split("s");

        StringBuilder sbt = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            char c = (char) (Integer.parseInt(s[i]) - 1);
            sbt.append(c);
        }
        sbt.insert(0, head);
        return sbt.toString();
    }


    public static void main(String[] args) {
        String url = "http://leetcode.com/problems/design-tinyurl";
        String x = new Solution().encode(url);
        System.out.println(x);
        String z = new Solution().decode(x);
        System.out.println(z);


    }
}
