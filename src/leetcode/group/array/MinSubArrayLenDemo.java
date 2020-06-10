package leetcode.group.array;

/**
 * @ClassName MinSubArrayLenDemo
 * @Description 209. 长度最小的子数组
 * @Author yk
 * @Date 2020/6/9 17:58
 * @Version 1.0
 **/
public class MinSubArrayLenDemo {
    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 s ，
     * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。
     * 如果不存在符合条件的连续子数组，返回 0。
     */
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                minLen = Math.min(minLen, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }

    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        MinSubArrayLenDemo demo = new MinSubArrayLenDemo();
        int minSubArrayLen = demo.minSubArrayLen(s, nums);
        System.out.println(minSubArrayLen);
    }
}
