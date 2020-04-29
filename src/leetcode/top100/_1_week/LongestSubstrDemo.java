package leetcode.top100._1_week;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @ClassName LongestSubstrDemo
 * @Descriptio
 * @Author yk
 * @Date 2020/4/29 17:16
 * @Version 1.0
 **/
public class LongestSubstrDemo {
    /**
     * Given a string,
     * 给定一个字符串
     * find the length of the longest substring without repeating characters.
     * 查找最长子串的长度而无需重复字符
     *
     * Example 1:
     *
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     *
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     *
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    /**
     * 方法一
     * 利用 hashmap 解题
     * 响应速度慢
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        /**
         * 解题思路：advdfe
         * 利用 hashmap 特性，key：单个字符，value 是 下角标
         * 当遇到重复字符，下角标回到重复对应字符的后一位，重新计数
         */
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        //最长子字符串长度
        int longestLen = 0;

        //使用 hashmap 存储
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // 比如说 abcddef
            if (longestLen >= s.length() - i + map.size()) {
                break;
            }
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i),i);
                if (map.size() > longestLen) {
                    longestLen = map.size();
                }
            } else {
                //获取重复数字最初的位置
                i = map.get(s.charAt(i));
                map.clear();
            }
        }
        return longestLen;
    }

    public static void main(String[] args) {
        /**
         * 方法一
         */
        String s = "advdfe";
        System.out.println(lengthOfLongestSubstring(s) + "");
        String s1 = "auasdf";
        System.out.println(lengthOfLongestSubstring(s1) + "");
        String s2 = "aua";
        System.out.println(lengthOfLongestSubstring(s2) + "");
        String s3 = "abcddef";
        System.out.println(lengthOfLongestSubstring(s3) + "");
    }

}
