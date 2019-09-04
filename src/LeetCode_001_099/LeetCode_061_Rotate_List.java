package LeetCode_001_099;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LeetCode_061_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        ListNode end = head;
        int length = 1;
        while (end != null && end.next != null) {
            end = end.next;
            length++;
        }
        k = k % length;
        if (k == 0) return head;

        ListNode pre = head;
        for (int i = 1; i < (length-k); i++) pre = pre.next;
        ListNode newHead = pre.next;
        pre.next = null;
        end.next = head;
        return newHead;

//        if (head == null) return head;
//        ListNode dummy = new ListNode(0), pre = dummy, end = dummy;
//        dummy.next = head;
//        for (int i = 0; i < k; i++) {
//            if (end.next == null) {
//                k %= i;
//                i = -1;
//                end = pre;
//            } else end = end.next;
//        }
//
//        if (end.next == null) return head;
//        while (end.next != null) {
//            pre = pre.next;
//            end = end.next;
//        }
//        end.next = head;
//        dummy.next = pre.next;
//        pre.next = null;
//        return dummy.next;
    }
}
