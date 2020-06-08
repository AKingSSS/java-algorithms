package leetcode.group.digui;

/**
 * @ClassName TribonacciDemo
 * @Description
 * @Author yk
 * @Date 2020/6/5 11:49
 * @Version 1.0
 **/
public class TribonacciDemo {
    /**
     * 泰波那契序列 Tn 定义如下： 
     * <p>
     * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
     * <p>
     * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
     * 0 <= n <= 37
     */

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int[] num = new int[n+1];
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }
        return num[n];
    }

    public static void main(String[] args) {
        TribonacciDemo tribonacciDemo = new TribonacciDemo();
        int tribonacci = tribonacciDemo.tribonacci(4);
        System.out.println(tribonacci);
    }
}
