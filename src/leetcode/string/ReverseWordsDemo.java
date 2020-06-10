package leetcode.string;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ReverseWordsDemo
 * @Description 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * @Author aking
 * @Date 2020/6/10 23:16
 * @Version 1.0
 **/
public class ReverseWordsDemo {
    public String reverseWords(String s) {
        if (s == null) return s;
        final String[] words = s.split(" ");
        StringBuilder[] sbs = new StringBuilder[words.length];

        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            sbs[left] = new StringBuilder(words[left++]).reverse();
            sbs[right] = new StringBuilder(words[right--]).reverse();
        }
        if (left == right) {
            sbs[left] = new StringBuilder(words[left]).reverse();
        }
        return String.join(" ", sbs);
    }

    public static void main(String[] args) {
        final ReverseWordsDemo demo = new ReverseWordsDemo();
        System.out.println(demo.reverseWords("abc deg hij"));
    }
}
