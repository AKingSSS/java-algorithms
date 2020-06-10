package leetcode.group.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSumNoOrderDemo
 * @Description 1. 两数之和
 * @Author yk
 * @Date 2020/6/10 14:25
 * @Version 1.0
 **/
public class TwoSumNoOrderDemo {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     */

    public int[] twoSum(int[] nums, int target) {
       int[] twoSum = new int[2];
       HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                twoSum[0] = map.get(target-nums[i]);
                twoSum[1] = i;
            }
            map.put(nums[i],map.getOrDefault(nums[i],i));
        }
        return twoSum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 5, 1};
        int target = 7;
        TwoSumNoOrderDemo demo = new TwoSumNoOrderDemo();
        int[] twoSum = demo.twoSum(numbers, target);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
}
