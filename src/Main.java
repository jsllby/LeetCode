import java.util.*;

import structure.ListNode;

public class Main {
    public static void main(String[] args) {
        int[] x = {1, 2, 4};
        int[] y = {1, 3, 4};
        ListNode l1 = null;
        ListNode l2 = null;
        for (int i = x.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(x[i]);
            temp.next = l1;
            l1 = temp;
        }
        for (int i = y.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(y[i]);
            temp.next = l2;
            l2 = temp;
        }


        Solution temp = new Solution();
        ListNode n = temp.mergeTwoLists(l1, l2);
        while (n.next != null) {
            System.out.println(n.val);
            n = n.next;
        }
        return;
    }
}


class Solution {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ListNode result = mergeTwoLists(lists[0],lists[1]);
        for(int i = 2;i<lists.length;i++)   result = mergeTwoLists(result,lists[i]);
        return result;

//        ListNode dummy = new ListNode(0);
//        ListNode cur = dummy;
//
//        int count = lists.length;
//        for (ListNode n : lists) {
//            if (n == null) count--;
//        }
//
//        while (count > 1) {
//            int index = -1, min = Integer.MAX_VALUE;
//            for (int i = 0; i < lists.length; i++) {
//                if (lists[i] != null && lists[i].val <= min) {
//                    min = lists[i].val;
//                    index = i;
//                }
//            }
//
//            cur.next = lists[index];
//            cur = cur.next;
//            lists[index] = lists[index].next;
//            if(lists[index]==null)  count--;
//        }
//
//        for(ListNode n:lists){
//            if(n!=null){
//                cur.next = n;
//                break;;
//            }
//        }
//        return dummy.next;

    }
}



