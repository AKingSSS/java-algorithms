package leetcode.group.array;

/**
 * @ClassName SubarraySumDemo
 * @Description 560. 和为 K 的子数组
 * @Author yk
 * @Date 2020/6/10 10:05
 * @Version 1.0
 **/
public class SubarraySumDemo {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            while (j < nums.length) {
                sum += nums[j++];
                if (sum == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, 1};
        int k = 0;
        SubarraySumDemo demo = new SubarraySumDemo();
        System.out.println(demo.subarraySum(nums, k));
    }
}
