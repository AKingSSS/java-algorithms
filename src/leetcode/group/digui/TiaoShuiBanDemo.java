package leetcode.group.digui;

/**
 * @ClassName TiaoShuiBanDemo
 * @Description
 * @Author yk
 * @Date 2020/6/5 11:09
 * @Version 1.0
 **/
public class TiaoShuiBanDemo {
    /**
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，
     * 其中长度较短的木板长度为 shorter，长度较长的木板长度为 longer。
     * 你必须正好使用 k 块木板。编写一个方法，生成跳水板所有可能的长度。
     * 返回的长度需要从小到大排列。
     * 输入：
     * shorter = 1
     * longer = 2
     * k = 3
     * 输出： {3,4,5,6}
     */

    /**
     * 数学归纳法
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k <= 0) {
            return new int[0];
        }
        if (shorter == longer) {
            int[] result = new int[1];
            result[0] = shorter * k;
            return result;
        }
        int[] result = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            result[i] = shorter * (k - i) + longer * i;
        }
        return result;
    }

    public static void main(String[] args) {
        TiaoShuiBanDemo tiaoShuiBanDemo = new TiaoShuiBanDemo();
        int[] ints = tiaoShuiBanDemo.divingBoard(1, 2, 3);
        for (int i : ints) {
            System.out.println(i);
        }

    }
}
