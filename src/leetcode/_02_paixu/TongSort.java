package leetcode._02_paixu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TongSort
 * @Description
 * @Author yangkang
 * @Date 2020/4/1 17:17
 * @Version 1.0
 **/
public class TongSort {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // 1、定义map存放每个元素出现的次数
        Map<Integer,Integer>  frequencyForNum =new HashMap<>(16);
        for(int num:nums){
            frequencyForNum .put(num, frequencyForNum .getOrDefault(num,0)+1);
        }
        // 2、利用value值进行排序，从大到小，重新排序map，entrySet对
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : frequencyForNum.keySet()) {
            int frequency = frequencyForNum.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        // 3、取出前k个freq值对应的key,遍历list得到map里面排序后的元素
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
            if (buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= (k - topK.size())) {
                topK.addAll(buckets[i]);
            } else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,3,4};
        List<Integer> list = topKFrequent(nums, 2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
