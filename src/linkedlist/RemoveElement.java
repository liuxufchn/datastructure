package linkedlist;

import javax.xml.soap.Node;

/**
 * @program: datastructure
 * @Date: 2020/12/28 18:59
 * @Author: Shaffer
 * @Description:
 */
public class RemoveElement {

    private class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val) {
                ListNode delNode = pre.next;
                pre.next = delNode.next;
                delNode.next = null;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (null == head) {
            return null;
        }

        head.next = removeElements2(head.next, val);

        return head.next.val == val ? head.next : head;
    }

}
