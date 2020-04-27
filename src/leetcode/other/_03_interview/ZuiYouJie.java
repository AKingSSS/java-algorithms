package leetcode.other._03_interview;

import java.util.*;

/**
 * @ClassName ZuiYouJie
 * @Description
 * @Author yangkang
 * @Date 2020/4/21 15:28
 * @Version 1.0
 **/
public class ZuiYouJie {
    public static void main(String[] args) {
        /**
         * 某公司内有 4 个项⽬目组，项⽬目组 A、B、C、D，
         * 项⽬目组A现有10⼈人，项⽬目组B现有7⼈人，项⽬目组C现 有5⼈人，项⽬目组D现有4⼈人。
         * 为了了实现跨项⽬目组协作，公司决定每⽉月从⼈人数最多的项⽬目组中抽调 3 ⼈人 出来，
         * 到其他剩下 3 组中，每组 1 ⼈人，这称之为�次调整优化（亦即经过第一次调整后，A组有7 ⼈人，B组有8⼈人，C组有6⼈人，D组有5⼈人）。
         * 那么请问，经过⼗年的优化调整后，各项⽬目组各有⼏几⼈人？
         * 编程求解该问题，并思考是否为最优解
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 7);
        map.put("C", 5);
        map.put("D", 4);


        for (int i = 0; i < 10; i++) {
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    //按照value值，用compareTo()方法默认是从大到小排序
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            for (int j = 0; j < list.size(); j++) {
                if (j == 0) {
                    map.put(list.get(j).getKey(), list.get(j).getValue() - 3);
                } else {
                    map.put(list.get(j).getKey(), list.get(j).getValue() + 1);
                }
            }
        }

        for (Map.Entry s : map.entrySet()) {
            System.out.println(s.getKey() + "--" + s.getValue());
        }
    }

}
