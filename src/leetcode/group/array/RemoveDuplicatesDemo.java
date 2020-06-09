package leetcode.group.array;

/**
 * @ClassName RemoveDuplicatesDemo
 * @Description 26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O (1) 额外空间的条件下完成。
 * @Author yk
 * @Date 2020/6/9 17:25
 * @Version 1.0
 **/
public class RemoveDuplicatesDemo {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesDemo demo = new RemoveDuplicatesDemo();
        int[] nums = {1,2,2,3,4,5,5};
        int i = demo.removeDuplicates(nums);
        System.out.println("i = " + i);
    }
}
