package leetcode.group.dp;

/**
 * @ClassName NumArrayDemo
 * @Description 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j)
 * 范围内元素的总和，包含 i,  j 两点。
 * @Author yk
 * @Date 2020/6/19 14:15
 * @Version 1.0
 **/
public class NumArrayDemo {

    private int[] sum;

    public NumArrayDemo(int[] nums) {
        // 前缀和思想
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArrayDemo demo = new NumArrayDemo(nums);
        int i = demo.sumRange(0, 2);
        int j = demo.sumRange(2, 5);
        int k = demo.sumRange(0, 5);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
