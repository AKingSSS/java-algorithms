package leetcode.group.dp;

/**
 * @ClassName MaxSubArrayDemo
 * @Description 面试题42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 * @Author yk
 * @Date 2020/6/19 11:24
 * @Version 1.0
 **/
public class MaxSubArrayDemo {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSubArrayDemo demo = new MaxSubArrayDemo();
        int[] nums = {1, -23, -12, 10, 9, -9, 13};
        int i = demo.maxSubArray(nums);
        System.out.println(i);
    }
}
