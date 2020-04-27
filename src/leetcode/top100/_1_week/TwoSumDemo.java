package leetcode.top100._1_week;

import java.util.HashMap;

/**
 * @ClassName TwoSumDemo
 * @Description
 * @Author yk
 * @Date 2020/4/27 15:04
 * @Version 1.0
 **/
public class TwoSumDemo {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * 给定一个整数数组，返回两个数字的索引，以便它们加起来成为一个特定的目标。
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * 您可以假设每个输入都只有一个解决方案，并且您可能不会两次使用同一元素。
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    /**
     * 情况 一
     * 升序数组
     * 双指针
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumAddOrder(int[] nums, int target) {
        int[] index = new int[2];
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            if (left < right) {
                if (nums[left] + nums[right] == target) {
                    break;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            } else {
                break;
            }
        }
        index[0] = left;
        index[1] = right;
        return index;
    }

    /**
     * 无序数组
     * 由题意可知：数组无重复数字，可用 hashMap
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumAddDisorder(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                index[0] = i;
                index[1] = map.get(target-nums[i]);
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // 情况 一
        int[] nums1 = {1, 2, 3, 4, 5, 6, 11};
        int[] two1 = twoSumAddOrder(nums1, 10);
        System.out.println(two1[0]);
        System.out.println(two1[1]);
        // 情况 二
        int[] nums2 = {1, 3, 2, 4, 6, 5, 11};
        int[] two2 = twoSumAddDisorder(nums2, 10);
        System.out.println(two2[0]);
        System.out.println(two2[1]);
    }
}
