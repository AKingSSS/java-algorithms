package leetcode._01_shuangzhizhen;

/**
 * @ClassName Demo03
 * @Description
 * @Author yangkang
 * @Date 2020/4/1 16:46
 * @Version 1.0
 **/
public class Demo03 {
    public boolean hasCycle(ListNode head){
        if (head == null) {
            return false;
        }
        ListNode l1 = head, l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null) {
            if (l1 == l2) {
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
