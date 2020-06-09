package leetcode.group.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName FirstMissingPositiveDemo
 * @Description 41. 缺失的第一个正数
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 *
 * @Author yk
 * @Date 2020/6/8 17:38
 * @Version 1.0
 **/
public class FirstMissingPositiveDemo {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7};
        FirstMissingPositiveDemo demo = new FirstMissingPositiveDemo();
        System.out.println(demo.firstMissingPositive(nums));
    }
}
