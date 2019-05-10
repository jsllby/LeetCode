package LeetCode_100_199;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class LeetCode_116_Populating_Next_Right_Pointers_in_Each_Node {
    public Node connect(Node root) {
//        if (root == null) return null;
//        LeetCode_100_199.Node temp = root;
//        while (root.left != null) {  //root 是每一行的最左，处理完这一行的子节点
//            LeetCode_100_199.Node cur = root;
//            while (cur != null) {  //处理完当前节点的子节点
//                cur.left.next = cur.right;
//                if(cur.next!=null)  cur.right.next = cur.next.left;
//                cur = cur.next;
//            }
//            root = root.left;
//        }
//        return temp;

        if (root == null) return root;
        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) root.right.next = root.next.left;
            root.left = connect(root.left);
            root.right = connect(root.right);
        }
        return root;
    }
}
