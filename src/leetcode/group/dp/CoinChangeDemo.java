package leetcode.group.dp;

import java.util.Arrays;

/**
 * @ClassName CoinChangeDemo
 * @Description 322. 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * <p>
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * <p>
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 * @Author yk
 * @Date 2020/6/22 14:42
 * @Version 1.0
 **/
public class CoinChangeDemo {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        CoinChangeDemo demo = new CoinChangeDemo();
        int i = demo.coinChange(coins, amount);
        System.out.println(i);
    }
}
