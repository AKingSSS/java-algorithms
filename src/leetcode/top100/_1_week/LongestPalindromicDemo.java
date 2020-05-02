package leetcode.top100._1_week;

/**
 * @ClassName LongestPalindromicDemo
 * @Description 查找最长回文字符串
 * @Author yk
 * @Date 2020/5/1 15:07
 * @Version 1.0
 **/
public class LongestPalindromicDemo {
    /**
     * Given a string s, find the longest palindromic substring in s.
     * 给定字符串s，找到s中最长的回文子字符串
     * You may assume that the maximum length of s is 1000.
     * 您可以假设s的最大长度为 1000
     * Example 1:
     *
     * Input: "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     * Example 2:
     *
     * Input: "cbbd"
     * Output: "bb"
     */

    /**
     * 方案一
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        //将字符串转char数组
        char[] ch = s.toCharArray();
        //子串长度
        int len = s.length();
        while (len > 0) {
            //采用滑动窗口，将符合长度的子串都进行一次判断
            for (int i = 0; i <= s.length() - len; i++) {
                boolean b = isPalindromicNumber(ch, i, i + len - 1);
                if (b) {
                    return s.substring(i, i + len);
                }
            }
            len--;
        }
        return "";
    }

    /**
     * 判断是否是回文数
     *
     * @param ch
     * @param start
     * @param end
     * @return
     */
    public static boolean isPalindromicNumber(char[] ch, int start, int end) {
        while (start < end) {
            if (ch[start] == ch[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "babad";
        System.out.println(longestPalindrome(s1));
    }
}
