package leetcode.group.doublepoint;

import java.util.Arrays;

/**
 * @ClassName SmallestDifferenceDemo
 * @Description 面试题 16.06. 最小差
 *
 * 给定两个整数数组 a 和 b，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差
 * @Author aking
 * @Date 2020/6/14 15:01
 * @Version 1.0
 **/
public class SmallestDifferenceDemo {
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0,j=0;
        long ans = Integer.MAX_VALUE;
        while (i< a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans = Math.min((long) b[j] - (long) a[i++],ans);
            } else if (a[i] > b[j]) {
                ans = Math.min((long) a[i] - (long) b[j++],ans);
            } else {
                return 0;
            }
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        /**
         * 输入：{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
         * 输出： 3，即数值对(11, 8)
         */

/*        int[] a = {1, 3, 15, 11, 2};
        int[] b = {23, 127, 235, 19, 8};*/

        int[] a = {-2147483648,1};
        int[] b = {2147483647,0};
        final SmallestDifferenceDemo demo = new SmallestDifferenceDemo();
        System.out.println(demo.smallestDifference(a,b));


    }
}
