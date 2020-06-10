package leetcode.string;

/**
 * @ClassName LengthOfLastWordDemo
 * @Description 58. 最后一个单词的长度
 * @Author aking
 * @Date 2020/6/11 00:10
 * @Version 1.0
 **/
public class LengthOfLastWordDemo {
    public int lengthOfLastWord(String s) {
        if(s == null) return 0;
        if (s.trim().equals("")) return 0;
        final String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        final LengthOfLastWordDemo demo = new LengthOfLastWordDemo();
        final int length = demo.lengthOfLastWord(" ");
        System.out.println("len = " + length);
    }

}
