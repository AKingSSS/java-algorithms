package leetcode.top100._2_week;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName PhoneNumber
 * @Description
 * @Author yk
 * @Date 2020/5/9 18:35
 * @Version 1.0
 **/
public class PhoneNumber {
    /**
     * Given a string containing digits from 2-9 inclusive,
     * return all possible letter combinations that the number could represent.
     *
     * A mapping of digit to letters (just like on the telephone buttons) is given below.
     * Note that 1 does not map to any letters.
     * Example:
     *
     * Input: "23"
     * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     * Note:
     *
     * Although the above answer is in lexicographical order,
     * your answer could be in any order you want.
     */

    public static List<String> letterCombinations(String digits) {
        String[] digitletter = { "", "", "abc", "def", "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz" };
        List<String> list = new LinkedList<>();
        if (digits == null) {
            return list;
        }

        return list;
    }

    public static void main(String[] args) {
        char a = 'a';
        System.out.println((char)(a + 1));
    }
}
