package leetcode.top100._2_week;

/**
 * @ClassName MostWater
 * @Description
 * @Author aking
 * @Date 2020/5/7 23:32
 * @Version 1.0
 **/
public class MostWater {
    /**
     * Given n non-negative integers a1, a2, ..., an ,
     * where each represents a point at coordinate (i, ai).
     * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). F
     * ind two lines, which together with x-axis forms a container,
     * such that the container contains the most water.
     * <p>
     * Note: You may not slant the container and n is at least 2.
     * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
     * the max area of water (blue section) the container can contain is 49.
     */
    /**
     * 算法一：双循环
     * Runtime: 506 ms, faster than 8.46% of Java online submissions for Container With Most Water.
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int area = (j - i) * (height[i] < height[j] ? height[i] : height[j]);
                maxArea = maxArea > area ? maxArea : area;
            }
        }
        return maxArea;
    }

    /**
     * 算法二：双指针
     * Runtime: 2 ms, faster than 94.92% of Java online submissions for Container With Most Water.
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int len = height.length - 1,
                left = 0,
                right = len,
                maxArea = 0;
        while (left <= right) {
            int area = (right-left)*(Math.min(height[left],height[right]));
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(array));
        System.out.println(maxArea2(array));
    }

}
