package leetcode.group.dp;

/**
 * @ClassName ClimbStairsDemo
 * @Description 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @Author yk
 * @Date 2020/6/19 14:49
 * @Version 1.0
 **/
public class ClimbStairsDemo {

    public int climbStairs(int n) {
        if (n <=1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        ClimbStairsDemo demo = new ClimbStairsDemo();
        int stairs = demo.climbStairs(10);
        System.out.println(stairs);
    }
}
