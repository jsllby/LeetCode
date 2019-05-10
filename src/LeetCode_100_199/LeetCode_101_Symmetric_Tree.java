package LeetCode_100_199;

import java.util.Stack;

public class LeetCode_101_Symmetric_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return helper(root.left, root.right);
//    }
//
//    public boolean helper(TreeNode left, TreeNode right) {
//        if (left == null && right == null) return true;
//        if (left == null || right == null) return false;
//        if (left.val == right.val) return helper(left.left, right.right) & helper(left.right, right.left);
//        return false;
//    }

    public boolean isSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);


        if (root == null) return true;
        TreeNode left = root.left, right = root.right;
        Stack<TreeNode> temp = new Stack<>();
        temp.push(left);
        temp.push(right);
        do {

            right = temp.pop();
            left = temp.pop();

            if (right == null && left == null) continue;
            if ((right == null || left == null) || (right.val != left.val)) return false;


            temp.push(left.right);
            temp.push(right.left);

            temp.push(left.left);
            temp.push(right.right);


        } while (!temp.isEmpty());
        return true;
    }
}
