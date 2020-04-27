package leetcode.other._01_shuangzhizhen;

/**
 * @ClassName Demo02
 * @Description 5归并两个有序数组
 * @Author yangkang
 * @Date 2020/4/1 15:57
 * @Version 1.0
 **/
public class Demo02 {
    /**
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * Output: [1,2,2,3,5,6]
     * 把归并结果存到第一个数组上。
     */

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
        return nums1;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int[] merge = merge(nums1, 3, nums2, 3);
    }


}
