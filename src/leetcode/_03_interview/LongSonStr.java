package leetcode._03_interview;

/**
 * @ClassName LongSonStr
 * @Description
 * @Author yangkang
 * @Date 2020/4/17 22:02
 * @Version 1.0
 **/
public class LongSonStr {

    /**
     * 查找最长子序列，并输出
     *
     * @param s
     * @return
     */
    public static String getLongSonStr(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        //连续子序列起始位置
        int startIndex = 0;
        //连续子序列结束位置
        int endIndex = 0;
        //最长子序列长度
        int longStrLen = 0;
        //子序列
        String longSonStr = s;
        //原字符串长度
        int sLen = s.length();
        //首字符
        char startChar = s.charAt(0);
        for (int i = 1; i < sLen; i++) {
            char c = s.charAt(i);
            //判断是否是连续字符
            if (c - startChar == i - startIndex) {
                endIndex = i;
                //当前子序列
                String tempStr = s.substring(startIndex, endIndex + 1);
                //当前子序列长度
                if (tempStr.length() > longStrLen) {
                    longStrLen = tempStr.length();
                    longSonStr = tempStr;
                }
            } else {
                //非连续字符,起始位置和终止位置前进
                startIndex = i;
                endIndex = i;
                startChar = s.charAt(i);
            }
        }
        return longSonStr;
    }


    public static void main(String[] args) {
        /**
         * 最长连续子序列
         * 比如 ababcabcd  >>> abcd
         */
        String s = "ababcabcd";
        System.out.println(getLongSonStr(s));
    }
}
