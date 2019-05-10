package LeetCode_001_099;

public class LeetCode_002_Add_Two_Numbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers() {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);


        ListNode start = new ListNode(0);
        ListNode temp = start;
        int carry = 0;
        do {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(carry % 10);
            temp = temp.next;
            carry = carry / 10;
        } while (l1 != null || l2 != null);
        if (carry != 0) temp.next = new ListNode(carry);

        return start.next;
    }
}
