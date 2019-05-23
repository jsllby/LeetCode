package LeetCode_001_099;
import structure.ListNode;

public class LeetCode_019_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode n_to_remove = temp;

        ListNode cur = head;
        for (int i = 0; i < n - 1; i++) cur = cur.next;
        while (cur.next != null) {
            cur = cur.next;
            n_to_remove = n_to_remove.next;
        }
        n_to_remove.next = n_to_remove.next.next;

        return temp.next;

//        ListNode cur = head;
//        for (int i = 0; i < n - 1; i++) cur = cur.next;
//        if (cur.next == null) return head.next;
//
//        ListNode temp = new ListNode(0);
//        temp.next = head;
//        while (cur.next != null){
//            cur = cur.next;
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//
//        return head;
    }
}
