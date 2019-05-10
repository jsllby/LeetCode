package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_094_Binary_Tree_Inorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                result.add(cur.val);
                cur = cur.right;
            } else {
                TreeNode rightMost = cur.left;
                while (rightMost.right!=null) rightMost = rightMost.right;
                rightMost.right = cur;
                TreeNode temp = cur.left;
                cur.left = null;
                cur = temp;
            }
        }
        return result;

//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> temp = new Stack<>();
//        while (!temp.empty() || root != null) {
//            while (root != null) {
//                temp.push(root);
//                root = root.left;
//            }
//            root = temp.pop();
//            result.add(root.val);
//            root = root.right;
//        }
//        return result;


//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//
//        if (root.left != null) result.addAll(inorderTraversal(root.left));
//        result.add(root.val);
//        if (root.right != null) result.addAll(inorderTraversal(root.right));
//
//        return result;
    }
}
