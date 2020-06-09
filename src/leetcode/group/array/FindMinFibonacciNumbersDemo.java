package leetcode.group.array;

/**
 * @ClassName FindMinFibonacciNumbersDemo
 * @Description 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 * @Author yk
 * @Date 2020/6/8 15:38
 * @Version 1.0
 **/
public class FindMinFibonacciNumbersDemo {
    public int findMinFibonacciNumbers(int k) {
        int num = 0;
        while (k != 0) {
            int number = getFibonacciNumber(k);
            num ++;
            k = k - number;
        }
        return num;
    }

    public static int getFibonacciNumber(int maxNum) {
        int f1 = 1;
        int f2 = 1;
        while (maxNum > f2) {
            int temp = f1;
            f1 = f2;
            f2 = temp + f2;
        }
        if (f2 > maxNum) {
            return f1;
        }
        return f2;
    }

    public static void main(String[] args) {
        FindMinFibonacciNumbersDemo demo = new FindMinFibonacciNumbersDemo();
        System.out.println(demo.findMinFibonacciNumbers(19));
    }
}
