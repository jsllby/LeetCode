package LeetCode_001_099;

import structure.ListNode;

public class LeetCode_023_Merge_k_Sorted_Lists {
    public static void example(String[] args) {
        int[] x = {1, 4, 5};
        int[] y = {1, 3, 4};
        int[] z = {2, 6};
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode l3 = null;
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
        for (int i = z.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(z[i]);
            temp.next = l3;
            l3 = temp;
        }

        ListNode[] list = {l1, l2, l3};

    }


    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            } else {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) head.next = l1;
        if (l2 != null) head.next = l2;
        return dummy.next;
    }


//    public static Comparator<ListNode> valComparator = new Comparator<ListNode>() {
//        public int compare(ListNode l1, ListNode l2) {
//            if (l1.val > l2.val) {
//                return 1;
//            } else if (l1.val < l2.val) {
//                return -1;
//            } else return 0;
//        }
//    };

    ListNode mergeLeftRight(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l = mergeLeftRight(lists, left, mid);
        ListNode r = mergeLeftRight(lists, mid + 1, right);
        return mergeTwoLists(l, r);
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergeLeftRight(lists, 0, lists.length - 1);

//        PriorityQueue<ListNode> list = new PriorityQueue<>(valComparator);
//        for (ListNode i : lists) {
//            if (i != null) list.add(i);
//        }
//        ListNode head = new ListNode(0);
//        ListNode cur = head;
//        while (list.peek() != null) {
//            cur.next = list.poll();
//            cur = cur.next;
//            if (cur.next != null) list.add(cur.next);
//        }
//        return head.next;


//        if(lists.length==0) return null;
//        if(lists.length==1) return lists[0];
//        ListNode result = mergeTwoLists(lists[0],lists[1]);
//        for(int i = 2;i<lists.length;i++)   result = mergeTwoLists(result,lists[i]);
//        return result;

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
