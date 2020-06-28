package leetcode.group.dp;

/**
 * @ClassName WaysToChangeDemo
 * @Description 面试题 08.11. 硬币
 * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，
 * 编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 * @Author yk
 * @Date 2020/6/22 10:00
 * @Version 1.0
 **/
public class WaysToChangeDemo {

    public int waysToChange(int n) {
        // 定义数组
        int[] dp = new int[n + 1];
        // 初始条件
        dp[0] = 1;
        // 硬币数
        int[] coins = {1, 5, 10, 25};

        for (int coin : coins) {
            for (int i = coin; i < dp.length; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        WaysToChangeDemo demo = new WaysToChangeDemo();
        int ways = demo.waysToChange(100);
        System.out.println(ways);
    }
}
