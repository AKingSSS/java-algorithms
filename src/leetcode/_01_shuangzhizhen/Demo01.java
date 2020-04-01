package leetcode._01_shuangzhizhen;

/**
 * @ClassName Demo01
 * @Description 1有序数组的 Two Sum
 * @Author yangkang
 * @Date 2020/4/1 15:09
 * @Version 1.0
 **/
public class Demo01 {
    /**
     * 在有序数组中找出两个数，使它们的和为 target。
     * 注意：这里说的是有序的。无序会增加难度
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,8,10};
        int target = 10;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum[0]);
        System.out.println(twoSum[1]);
    }
}
