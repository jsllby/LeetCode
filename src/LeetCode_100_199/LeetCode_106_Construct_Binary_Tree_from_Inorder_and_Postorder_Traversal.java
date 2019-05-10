package LeetCode_100_199;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public Map<Integer, Integer> map = new HashMap<>();

    //复杂度高
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if (inorder.length == 0) return null;
//        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
//        int index = 0;
//        while (inorder[index] != postorder[postorder.length - 1]) index++;
//        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
//        root.right = buildTree(Arrays.copyOfRange(inorder, index + 1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length - 1));
//        return root;
//    }


    //用hashmap保存
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if (inorder == null || inorder.length == 0) return null;
//        return helper(inorder, postorder, 0, 0, inorder.length);
//    }
//
//    public TreeNode helper(int[] inorder, int[] postorder, int in_start, int pos_start, int length) {
//        if (length <= 0) return null;
//        TreeNode root = new TreeNode(postorder[pos_start + length - 1]);
//        int index = in_start;
//        if (map.containsKey(root.val)) index = map.get(root.val);
//        else {
//            while (inorder[index] != root.val) {
//                map.put(inorder[index], index);
//                index++;
//            }
//        }
//        root.left = helper(inorder, postorder, in_start, pos_start, index - in_start);
//        root.right = helper(inorder, postorder, index + 1, pos_start + index-in_start, length-index+in_start-1);
//        return root;
//    }


    //不用hashmap，没搞懂
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int[] inIdx = new int[1], postIdx = new int[1]; // use array so it can pass by reference

        postIdx[0] = postorder.length-1;

        inIdx[0] = inorder.length-1;

        return helper(inorder, inIdx, postorder, postIdx, null);

    }
    // finish node means end of current subtree
    // for example, postorder = [9,15,7,20,3], numbers just before 3 is it's right subtree (20, 7, 15), and their finish node is 3.
    private TreeNode helper(int[] inorder, int[] inIdx, int[] postorder, int[] postIdx, TreeNode finish) {
        if (postIdx[0] < 0 || (finish != null && inorder[inIdx[0]] == finish.val)) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIdx[0]--]);

        root.right = helper(inorder, inIdx, postorder, postIdx, root);

        inIdx[0]--;

        root.left = helper(inorder, inIdx, postorder, postIdx, finish);

        return root;
    }
}
