package leetcode.group.dp;

/**
 * @ClassName RobDemo
 * @Description 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。
 * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * @Author yk
 * @Date 2020/6/19 16:24
 * @Version 1.0
 **/
public class RobDemo {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        if (len == 1) return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        RobDemo demo = new RobDemo();
        int[] nums = {2, 7, 9, 3, 1};
        int rob = demo.rob(nums);
        System.out.println(rob);
    }
}
