package leetcode.top100._2_week;

/**
 * @ClassName RegularExpressionMatching
 * @Description 动态规划
 * @Author yk
 * @Date 2020/5/2 21:22
 * @Version 1.0
 **/
public class RegularExpressionMatching {
    /**
     * Given an input string (s) and a pattern (p),
     * 给定一个输入字符串（s）和一个模式（p）
     * implement regular expression matching with support for '.' and '*'.
     * 实现支持“.”的正则表达式匹配和“ *”
     * '.' Matches any single character.
     * 匹配任何单个字符
     * '*' Matches zero or more of the preceding element.
     * 匹配零个或多个前一个元素
     *
     * s could be empty and contains only lowercase letters a-z.
     * s 可以为空，并且仅包含小写字母a-z
     * p could be empty and contains only lowercase letters a-z, and characters like . or *.
     * p 可以为空，并且仅包含小写字母a-z和诸如之类.的字符。要么 *
     *
     * Example 1:
     *
     * Input:
     * s = "aa"
     * p = "a"
     * Output: false
     * Explanation: "a" does not match the entire string "aa".
     * Example 2:
     *
     * Input:
     * s = "aa"
     * p = "a*"
     * Output: true
     * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
     * Example 3:
     *
     * Input:
     * s = "ab"
     * p = ".*"
     * Output: true
     * Explanation: ".*" means "zero or more (*) of any character (.)".
     * Example 4:
     *
     * Input:
     * s = "aab"
     * p = "c*a*b"
     * Output: true
     * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
     * Example 5:
     *
     * Input:
     * s = "mississippi"
     * p = "mis*is*p*."
     * Output: false
     */

    /**
     * 解法一
     *
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {




        return true;
    }

    public static void main(String[] args) {


    }
}
