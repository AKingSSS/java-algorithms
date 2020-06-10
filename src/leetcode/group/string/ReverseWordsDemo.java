package leetcode.group.string;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ReverseWordsDemo
 * @Description 151. 翻转字符串里的单词
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * <p>
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * @Author yk
 * @Date 2020/6/10 16:10
 * @Version 1.0
 **/
public class ReverseWordsDemo {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        int len = words.length;
        StringBuilder sb = new StringBuilder();
        sb.append(words[len - 1]);
        for (int i = 1; i < len; i++) {
            if (!words[len - 1 - i].equals("")) {
                sb.append(" ").append(words[len-1-i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsDemo demo = new ReverseWordsDemo();
        String s = "a good   example";
        System.out.println(demo.reverseWords(s));
    }
}
