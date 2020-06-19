package leetcode.group.dp;

/**
 * @ClassName WaysToStepDemo
 * @Description 面试题 08.01. 三步问题
 * <p>
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
 * 小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。
 * 结果可能很大，你需要对结果模1000000007。
 * @Author yk
 * @Date 2020/6/19 15:21
 * @Version 1.0
 **/
public class WaysToStepDemo {
    public int waysToStep(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] + dp[i - 3]) % 1000000007) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        WaysToStepDemo demo = new WaysToStepDemo();
        int step = demo.waysToStep(61);
        System.out.println(step);
    }
}
