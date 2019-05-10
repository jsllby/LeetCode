package LeetCode_100_199;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_144_Binary_Tree_Preorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> temp = new Stack<>();
        while (!temp.empty() || root != null) {
            while (root != null) {
                result.add(root.val);
                temp.push(root);
                root = root.left;
            }
            root = temp.pop();
            root = root.right;
        }
        return result;

        //只存储右子节点
//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> temp = new Stack<>();
//        while (!temp.empty() || root != null) {
//            result.add(root.val);
//            if (root.right != null) temp.push(root.right);
//            root = root.left;
//            if(root==null && !temp.empty()) root = temp.pop();
//        }
//        return result;

//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> temp = new Stack<>();
//        temp.push(root);
//        while (!temp.empty()) {
//            root = temp.pop();
//            if (root != null) {
//                result.add(root.val);
//                if (root.right != null) temp.push(root.right);
//                if (root.left != null) temp.push(root.left);
//            }
//        }
//        return result;

//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//        result.add(root.val);
//        if (root.left != null) result.addAll(preorderTraversal(root.left));
//        if (root.right != null) result.addAll(preorderTraversal(root.right));
//
//        return result;
    }
}
