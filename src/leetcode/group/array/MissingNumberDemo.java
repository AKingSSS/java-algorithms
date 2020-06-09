package leetcode.group.array;

/**
 * @ClassName MissingNumberDemo
 * @Description 面试题 53 - II. 0～n-1 中缺失的数字
 * @Author yk
 * @Date 2020/6/8 11:22
 * @Version 1.0
 **/
public class MissingNumberDemo {

    public int missingNumber(int[] nums) {
        if (nums[0]==1) return 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=i) return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        MissingNumberDemo demo = new MissingNumberDemo();
        int s = demo.missingNumber(nums);
        System.out.println("s = " + s);
    }
}
