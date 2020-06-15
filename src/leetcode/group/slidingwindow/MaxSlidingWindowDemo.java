package leetcode.group.slidingwindow;

/**
 * @ClassName MaxSlidingWindowDemo
 * @Description
 * @Author yk
 * @Date 2020/6/15 10:17
 * @Version 1.0
 **/
public class MaxSlidingWindowDemo {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) {
            return new int[0];
        }
        int maxNum = Integer.MIN_VALUE;
        int maxNumIndex = -1;
        // 定义结果数组
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < len - k + 1; i++) {
            // 判断最大值下标是否在滑动窗口的范围内
            if (maxNumIndex >= i) {
                // 存在就只需要比较最后面的值是否大于上一个窗口最大值
                if (nums[k + i - 1] > maxNum) {
                    maxNum = nums[k + i - 1];
                    // 更新最大值下标
                    maxNumIndex = k + i - 1;
                }
            } else {
                maxNum = nums[i];
                for (int j = i; j < i + k; j++) {
                    if (maxNum < nums[j]) {
                        maxNum = nums[j];
                        maxNumIndex = j;
                    }
                }
            }
            res[i] = maxNum;
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSlidingWindowDemo demo = new MaxSlidingWindowDemo();
        int[] nums = {1, -1};
        int k = 1;
        int[] window = demo.maxSlidingWindow(nums, k);
        for (int i = 0; i < window.length; i++) {
            System.out.println(window[i]);
        }
    }
}
