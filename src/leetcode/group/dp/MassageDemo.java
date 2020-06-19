package leetcode.group.dp;

/**
 * @ClassName MassageDemo
 * @Description
 * @Author yk
 * @Date 2020/6/19 17:06
 * @Version 1.0
 **/
public class MassageDemo {

    public int massage(int[] nums) {
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
        int[] nums = {2, 1, 4, 5, 3, 1, 1, 3};
        MassageDemo demo = new MassageDemo();
        int massage = demo.massage(nums);
        System.out.println(massage);
    }

}
