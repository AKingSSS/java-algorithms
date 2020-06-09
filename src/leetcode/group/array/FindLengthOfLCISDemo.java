package leetcode.group.array;

import java.util.LinkedList;

/**
 * @ClassName FindLengthOfLCISDemo
 * @Description 674. 最长连续递增序列
 * @Author yk
 * @Date 2020/6/8 16:19
 * @Version 1.0
 **/
public class FindLengthOfLCISDemo {
    /**
     * 输入: [1,3,5,4,7]
     * 输出: 3
     * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
     * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
     */
    public int findLengthOfLCIS(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        if (nums.length == 0) {
            return 0;
        }
        int maxSize = 1;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            if (list.isEmpty()) {
                list.add(nums[i]);
            } else {
                if (nums[i] > list.get(list.size() - 1)) {
                    list.add(nums[i]);
                    if (i == numsLength - 1) {
                        maxSize = list.size() > maxSize ? list.size() : maxSize;
                    }
                } else {
                    maxSize = list.size() > maxSize ? list.size() : maxSize;
                    if (maxSize > numsLength - i) {
                        break;
                    }
                    list.clear();
                    list.add(nums[i]);
                }
            }
        }
        return maxSize;
    }


    public int findLengthOfLCIS2(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        int maxLength = 0;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                if (len > maxLength) {
                    maxLength = len;
                }
                len = 1;
            }
        }
        return Math.max(maxLength, len);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        FindLengthOfLCISDemo demo = new FindLengthOfLCISDemo();
        System.out.println(demo.findLengthOfLCIS(nums));
        System.out.println(demo.findLengthOfLCIS2(nums));
    }
}
