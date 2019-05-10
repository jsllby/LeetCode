package LeetCode_100_199;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_145_Binary_Tree_Postorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null || cur.right == null) {
                result.add(0,cur.val);
                if (cur.left == null) cur = cur.right;
                else cur = cur.left;
            } else {
                TreeNode right_left_most = cur.right;
                while (right_left_most.left != null) right_left_most = right_left_most.left;
                TreeNode temp = cur.left;
                cur.left = null;
                right_left_most.left = temp;
            }
        }
        return result;

//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> temp = new Stack<>();
//        while (!temp.isEmpty() || root != null) {
//            while(root!=null){
//                result.add(0,root.val);
//                temp.push(root);
//                root = root.right;
//            }
//            root = temp.pop();
//            root = root.left;
//        }
//        return result;

//        List<Integer> result = new ArrayList<>();
//        if(root==null)  return result;
//        result.addAll(postorderTraversal(root.left));
//        result.addAll(postorderTraversal(root.right));
//        result.add(root.val);
//        return result;
    }
}
