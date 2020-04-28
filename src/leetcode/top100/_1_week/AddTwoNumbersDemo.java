package leetcode.top100._1_week;

/**
 * @ClassName AddTwoNumbersDemo
 * @Description 单链表
 * @Author yk
 * @Date 2020/4/28 10:20
 * @Version 1.0
 **/
public class AddTwoNumbersDemo {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * 您将获得两个表示两个非负整数的非空链表。
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * 这些数字以相反的顺序存储，并且它们的每个节点都包含一个数字。
     * Add the two numbers and return it as a linked list.
     * 将两个数字相加，并将其作为链表返回
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * 您可能会假设两个数字除了数字 0本身以外都不包含任何前导零。
     *
     * Example:
     *
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */

    /**
     * 单链表相加
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
     * Memory Usage: 39.8 MB, less than 99.37% of Java online submissions for Add Two Numbers.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbersFirst(ListNode l1, ListNode l2) {
        //单链表相加组成的新链表
        ListNode llSumNode = null;
        //新链表下一个 node
        ListNode next = null;
        //链表相加的和
        int sum = 0;
        //进位值
        int enter = 0;
        //遍历 l1 和 l2
        while (l1 != null || l2 != null) {
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + enter;
            enter = sum > 9 ? 1 : 0;

            if (llSumNode == null) {
                next = new ListNode(sum % 10);
                llSumNode = next;
            } else {
                next.next = new ListNode(sum % 10);
                next = next.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        //循环完，如果还有进位，则分配下个节点
        if (enter == 1) {
            next.next = new ListNode(1);
        }

        return llSumNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);

        ListNode node = addTwoNumbersFirst(l1, l2);
        System.out.println(node.toString());

    }
}
