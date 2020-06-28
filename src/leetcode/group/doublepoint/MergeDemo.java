package leetcode.group.doublepoint;

/**
 * @ClassName MergeDemo
 * @Description 面试题 10.01. 合并排序的数组
 * @Author aking
 * @Date 2020/6/14 00:55
 * @Version 1.0
 **/
public class MergeDemo {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            A[k--] = i >=0?(A[i] > B[j] ? A[i--] : B[j--]):B[j--];
        }
    }

    public static void main(String[] args) {
        /**
         * 输入:
         * A = [1,2,3,0,0,0], m = 3
         * B = [2,5,6],       n = 3
         *
         * 输出: [1,2,2,3,5,6]
         */
/*        int[] A = {1, 2, 3, 0, 0, 0}, B = {2, 5, 6};
        int m = 3, n = 3;*/
        int[] A = {0}, B = {2};
        int m = 0, n = 1;

        final MergeDemo demo = new MergeDemo();
        demo.merge(A, m, B, n);
        for (int i : A) {
            System.out.println("i=" + i);
        }

    }


}
