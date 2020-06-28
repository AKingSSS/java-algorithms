package leetcode.group.doublepoint;

/**
 * @ClassName KthToLastDemo
 * @Description 面试题 02.02. 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * @Author aking
 * @Date 2020/6/14 14:15
 * @Version 1.0
 **/
public class KthToLastDemo {
    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        while (p!=null) {
            p = p.next;
            head = head.next;
        }
        return head.val;
    }

    public static void main(String[] args) {
        final KthToLastDemo demo = new KthToLastDemo();

    }

}
