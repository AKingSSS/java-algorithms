package leetcode.group.binarysearch;

/**
 * @ClassName IsSubsequenceDemo
 * @Description  392. 判断子序列
 *
 * @Author yk
 * @Date 2020/6/19 10:45
 * @Version 1.0
 **/
public class IsSubsequenceDemo {

    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int j = -1;
        for (int i = 0; i < chars.length; i++) {
            // indexOf(char c,int m)意思是从第m位置开始寻找该索引，找到则返回该索引，否则返回-1
            j = t.indexOf(chars[i],j+1);
            if (j == - 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequenceDemo demo = new IsSubsequenceDemo();
        String s = "abc",t="qweabc";
        boolean b = demo.isSubsequence(s, t);
        System.out.println(b);

    }

}
