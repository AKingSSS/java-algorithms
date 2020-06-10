package leetcode.group.array;

import sun.text.resources.cldr.ii.FormatData_ii;

/**
 * @ClassName TwoSumDemo
 * @Description 167. 两数之和 II - 输入有序数组
 * @Author yk
 * @Date 2020/6/10 14:05
 * @Version 1.0
 **/
public class TwoSumDemo {

    public int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int left = 0, right = numbers.length-1,sum=0;
        while (left<right){
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                nums[0] = left + 1;
                nums[1] = right + 1;
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        TwoSumDemo demo = new TwoSumDemo();
        int[] twoSum = demo.twoSum(numbers, target);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
}
