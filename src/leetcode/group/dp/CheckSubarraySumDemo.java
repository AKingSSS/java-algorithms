package leetcode.group.dp;

/**
 * @ClassName CheckSubarraySumDemo
 * @Description 523. 连续的子数组和
 * 给定一个包含 非负数 的数组和一个目标 整数 k，
 * 编写一个函数来判断该数组是否含有[连续的子数组]，
 * 其大小至少为 2，且总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 * @Author yk
 * @Date 2020/6/22 14:13
 * @Version 1.0
 **/
public class CheckSubarraySumDemo {

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) return false;
        // 使用前缀和
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = sums[j] - sums[i] + nums[i];
                if (sum == k || (k != 0 && sum % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        CheckSubarraySumDemo demo = new CheckSubarraySumDemo();
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        System.out.println(demo.checkSubarraySum(nums, k));
    }
}
