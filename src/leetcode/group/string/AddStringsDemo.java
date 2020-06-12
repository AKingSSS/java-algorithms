package leetcode.group.string;

import java.util.Arrays;

/**
 * @ClassName AddStringsDemo
 * @Description
 * @Author yk
 * @Date 2020/6/11 10:13
 * @Version 1.0
 **/
public class AddStringsDemo {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        // 十进一标识
        int flag = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0) {
            // 不够用 0 补充
            int a = len1 >= 0?num1.charAt(len1--) - '0':0;
            int b = len2 >= 0?num2.charAt(len2--) - '0':0;
            int sum = a + b + flag;
            if (sum >= 10) {
                flag = 1;
                sb.append(sum % 10);
            } else {
                flag = 0;
                sb.append(sum);
            }
        }
        if (flag == 1) {
            return "1" + sb.reverse();
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddStringsDemo demo = new AddStringsDemo();
        System.out.println(demo.addStrings("128","72"));
    }
}
