package leetcode.group.digui;

/**
 * @ClassName MyPow
 * @Description
 * @Author yk
 * @Date 2020/6/5 15:21
 * @Version 1.0
 **/
public class MyPow {
    /**
     * 实现函数 double Power (double base, int exponent)，
     * 求 base 的 exponent 次方。不得使用库函数，同时不需要考虑大数问题。
     * 输入: 2.10000, 3
     * 输出: 9.26100
     * 经典二分快速幂
     */
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        if (b % 2 == 0) {
            double t = myPow(x, (int) (b / 2));
            return t * t;
        } else {
            double t = myPow(x, (int) (b / 2));
            return t * t * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(2.00000, -1));
    }
}
