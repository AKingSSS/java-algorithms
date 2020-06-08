package leetcode.top100._1_week;

/**
 * @ClassName MedianArrayDemo
 * @Description
 * @Author yk
 * @Date 2020/4/30 21:21
 * @Version 1.0
 **/
public class MedianArrayDemo {
    /**
     * “中位数（又称中值，英语：Median），统计学中的专有名词，代表一个样本、种群或概率分布中的一个数值，其可将数值集合划分为相等的上下两部分。
     * 对于有限的数集，可以通过把所有观察值高低排序后找出正中间的一个作为中位数。如果观察值有偶数个，通常取最中间的两个数值的平均数作为中位数。”
     *
     * There are two sorted arrays nums1 and nums2 of size m and n respectively.
     * 有两个分别为大小 m和 n的排序数组 nums1和nums2。
     * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
     * 找到两个排序数组的中位数。总体时间复杂度应为O（log（m + n））。
     * You may assume nums1 and nums2 cannot be both empty.
     * 您可以假设nums1和nums2不能都为空。
     *
     * Example 1:
     *
     * nums1 = [1, 3]
     * nums2 = [2]
     *
     * The median is 2.0
     * Example 2:
     *
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     *
     * The median is (2 + 3)/2 = 2.5
     */

    /**
     * 算法 一
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double medianNum = 0;
        if (nums1 == null) {
            //如果 nums2 个数为偶数
            int nums2Len = nums2.length;
            if (nums2Len % 2 == 0) {
                medianNum = (nums2[nums2Len / 2 - 1] + nums2[nums2Len / 2]) / 2;
            } else {
                medianNum = nums2[(nums2Len - 1) / 2];
            }
        } else if (nums2 == null) {
            //如果 nums1 个数为偶数
            int nums1Len = nums1.length;
            if (nums1Len % 2 == 0) {
                medianNum = (nums2[nums1Len / 2 - 1] + nums2[nums1Len / 2]) / 2;
            } else {
                medianNum = nums2[(nums1Len - 1) / 2];
            }
        } else {
            int nums1Len = nums1.length;
            int nums2Len = nums2.length;
            /**
             * [1,5,7] [2,6]
             */
            if ((nums1Len + nums2Len) % 2 == 0) {

            }


        }


        return medianNum;

    }


}
