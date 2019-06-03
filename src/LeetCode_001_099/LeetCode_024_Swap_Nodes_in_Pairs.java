package LeetCode_001_099;

import structure.ListNode;

public class LeetCode_024_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        cur.next = head;
        while (cur.next != null) {
            ListNode first = cur.next;
            if (first.next == null) break;
            ListNode second = first.next;
            cur.next = second;
            first.next = second.next;
            second.next = first;
            cur = first;
        }
        return head;
    }
}
