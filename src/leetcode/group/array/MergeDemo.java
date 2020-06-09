package leetcode.group.array;

/**
 * @ClassName MergeDemo
 * @Description 88. 合并两个有序数组 ykdo
 * @Author yk
 * @Date 2020/6/8 18:04
 * @Version 1.0
 **/
public class MergeDemo {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * nums1 = [1,2,3,0,0,0], m = 3
         * nums2 = [2,5,6],       n = 3
         *
         * 输出: [1,2,2,3,5,6]
         */
        int i = m - 1, j = n - 1, k = m + n - 1;
        if (j < 0) {
            return;
        }
        if (k == 0) {
            nums1[0] = nums2[0];
            return;
        }
        while (j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i];
                nums1[i--] = 0;
                if (k == 0) {
                    nums1[0] = nums2[j];
                    break;
                }
            } else {
                nums1[k--] = nums2[j--];
                if (k == 0) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
/*        int[] nums1 = {2, 0}, nums2 = {1};
        int m = 1, n = 1;*/
/*        int[] nums1 = {0}, nums2 = {1};
        int m = 0, n = 1; */
/*        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3; */

/*        int[] nums1 = {1}, nums2 = {};
        int m = 1, n = 0;*/

        int[] nums1 = {4,5,6,0,0,0}, nums2 = {1,2,3};
        int m = 3, n = 3;
        MergeDemo demo = new MergeDemo();
        demo.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
