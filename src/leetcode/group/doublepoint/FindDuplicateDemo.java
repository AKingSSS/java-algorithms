package leetcode.group.doublepoint;

import java.util.HashSet;

/**
 * @ClassName FindDuplicateDemo
 * @Description 287. 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums，
 * 其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 *
 * @Author aking
 * @Date 2020/6/14 00:18
 * @Version 1.0
 **/
public class FindDuplicateDemo {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }


}
