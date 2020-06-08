package leetcode.group.digui;

/**
 * @ClassName TaiJieDemo
 * @Description
 * @Author yk
 * @Date 2020/6/5 14:45
 * @Version 1.0
 **/
public class TaiJieDemo {
    /**
     * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级台阶。
     * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     * <p>
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     * 输入：n = 7
     * 输出：21
     * <p>
     * 0 <= n <= 100
     */

    public int numWays(int n) {
        /**
         * 分析：由于青蛙一次能跳 1 级台阶 或者 2 级台阶
         * 最后一次要么跳 1 级 ，要么跳 2 级
         * 根据递归思想，前 n-1级台阶的可能性 + 前 n-2 级台阶的可能性 即是 答案
         * numWays(n) = numWays(n - 1) + numWays(n - 2)
         */

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int[] num = new int[n + 1];
        num[0] = 1;
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
        System.out.println(new TaiJieDemo().numWays(7));
    }
}
