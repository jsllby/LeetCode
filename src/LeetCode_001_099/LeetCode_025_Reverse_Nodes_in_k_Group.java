package LeetCode_001_099;

import structure.ListNode;

public class LeetCode_025_Reverse_Nodes_in_k_Group {
    public ListNode reverseNodes(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur.next == null) return head;
            cur = cur.next;
        }

        cur = head.next;
        ListNode next = cur.next;
        for (int i = 0; i < k - 1; i++) {
            ListNode temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        head.next.next = next;   //head.next = 原顺序中的第一个node
        head.next = reverseNodes(head.next, k);
        head.next = cur;
        return head;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        return reverseNodes(dummy, k).next;
    }
}
