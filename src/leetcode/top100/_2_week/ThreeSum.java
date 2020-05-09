package leetcode.top100._2_week;

import java.util.*;

/**
 * @ClassName ThreeSum
 * @Description
 * @Author yk
 * @Date 2020/5/8 16:46
 * @Version 1.0
 **/
public class ThreeSum {
    /**
     * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     *
     * Note:
     *
     * The solution set must not contain duplicate triplets.
     *
     * Example:
     *
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     *
     * A solution set is:
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     */
    /**
     * 方案一
     * Runtime: 379 ms, faster than 15.18% of Java online submissions for 3Sum.
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        // 数组
        List<List<Integer>> lists = new LinkedList<>();
        if (nums == null || nums.length < 3) {
            return lists;
        }
        // 升序排序
        Arrays.sort(nums);
        // 数组长度
        int len = nums.length;
        // list 去重
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len - 2; i++) {
            // 如果当前元素大于 0， 则三数之和大于 0
            if (nums[i] > 0) {
                break;
            }
            int low = i + 1;
            int hig = len - 1;
            while (low < hig) {
                if (nums[low] + nums[hig] == -nums[i]) {
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[hig]);
                    set.add(list);
                    low++;
                    hig--;
                } else if (nums[low] + nums[hig] > -nums[i]) {
                    hig--;
                } else {
                    low++;
                }
            }
        }
        for (List<Integer> list : set) {
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}
