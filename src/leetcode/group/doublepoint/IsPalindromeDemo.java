package leetcode.group.doublepoint;

/**
 * @ClassName IsPalindromeDemo
 * @Description 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * @Author aking
 * @Date 2020/6/13 17:31
 * @Version 1.0
 **/
public class IsPalindromeDemo {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) return true;
        int  i= 0, j = s.length() - 1;
        String low = s.toLowerCase();

        while (i < j)
        {
            if (!Character.isLetterOrDigit(low.charAt(i)))
            {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(low.charAt(j)))
            {
                j--;
                continue;
            }
            if (low.charAt(i) != low.charAt(j))
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /**
         * 输入: "A man, a plan, a canal: Panama"
         * 输出: true
         *
         * 输入: "race a car"
         * 输出: false
         */
        final IsPalindromeDemo demo = new IsPalindromeDemo();
        System.out.println(demo.isPalindrome("race a car"));

    }

}
