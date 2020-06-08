package leetcode.group.digui;

/**
 * @ClassName ChengfaDemo
 * @Description
 * @Author yk
 * @Date 2020/6/5 11:40
 * @Version 1.0
 **/
public class ChengfaDemo {
    /**
     * 递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。
     * 可以使用加号、减号、位移，但要吝啬一些。
     *  输入：A = 3, B = 4
     *  输出：12
     */
    public int multiply(int A, int B) {
        if (B == 1) {
            return A;
        }
        return multiply(A,B-1) + A;
    }

    public static void main(String[] args) {
        ChengfaDemo chengfaDemo = new ChengfaDemo();
        int num = chengfaDemo.multiply(6, 8);
        System.out.println("num = " + num);
    }
}
