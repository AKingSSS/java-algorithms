package leetcode.doublepoint;

/**
 * @ClassName MaxAreaDemo
 * @Description 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * @Author aking
 * @Date 2020/6/14 14:46
 * @Version 1.0
 **/
public class MaxAreaDemo {

    public int maxArea(int[] height) {
        int left = 0,right=height.length-1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea,(right - left)*(Math.min(height[left],height[right])));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        /**
         * 输入：[1,8,6,2,5,4,8,3,7]
         * 输出：49
         */
        final MaxAreaDemo demo = new MaxAreaDemo();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(demo.maxArea(height));
    }
}
