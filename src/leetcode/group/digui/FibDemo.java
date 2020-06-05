package leetcode.group.digui;

/**
 * @ClassName FibDemo
 * @Description
 * @Author yk
 * @Date 2020/6/5 14:24
 * @Version 1.0
 **/
public class FibDemo {
    /**
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     */

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];
            if (num[i] > 1000000007) {
                num[i] -= 1000000007;
            }
        }
        return num[n];
    }

    public static void main(String[] args) {
        // 807526948
        System.out.println(new FibDemo().fib(48));
    }
}
