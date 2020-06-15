package leetcode.group.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName PairSumsDemo
 * @Description 面试题 16.24. 数对和
 * 输入: nums = [5,6,5,6], target = 11
 * 输出: [[5,6],[5,6]]
 * @Author yk
 * @Date 2020/6/15 9:17
 * @Version 1.0
 **/
public class PairSumsDemo {

    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> pairList = new LinkedList<>();
        if (nums == null || nums.length < 2) return pairList;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            List<Integer> list = new LinkedList<>();
            if (map.get(target - num) != null && map.get(target - num) > 0) {
                list.add(num);
                list.add(target - num);
                map.put(num, map.getOrDefault(num, 0) - 1);
                map.put(target - num, map.getOrDefault(target - num, 0) - 1);
                pairList.add(list);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return pairList;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,5,6};
        int target = 11;

        PairSumsDemo demo = new PairSumsDemo();
        List<List<Integer>> list = demo.pairSums(nums, target);
        System.out.println(list);
    }
}
