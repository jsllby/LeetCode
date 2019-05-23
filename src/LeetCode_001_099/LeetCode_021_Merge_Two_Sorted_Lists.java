package LeetCode_001_099;

import structure.ListNode;

public class LeetCode_021_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }else{
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        if(l1!=null)    head.next = l1;
        if(l2!=null)    head.next = l2;
        return dummy.next;

//        if (l1 == null) {
//            if (l2 == null) return l1;
//            else return l2;
//        }
//        if(l2==null)    return l1;
//        if (l1.val > l2.val) {
//            ListNode temp = l1;
//            l1 = l2;
//            l2 = temp;
//        }
//
//        ListNode x = l1;
//        ListNode y = l2;
//        while (x != null && y != null) {
//            if (x.next == null) {
//                x.next = y;
//                break;
//            } else {
//                if (x.next.val <= y.val) x = x.next;
//                else {
//                    ListNode temp = x.next;
//                    x.next = y;
//                    x = y;
//                    y = temp;
//                }
//            }
//        }
//
//        return l1;
    }
}
