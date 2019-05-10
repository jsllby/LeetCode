package LeetCode_100_199;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) return null;
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int pre_start, int pre_end, int[] inorder, int in_start, int in_end) {
        if(pre_end-pre_start<0)  return null;
        TreeNode root = new TreeNode(preorder[pre_start]);
        int index = in_start;
        if(map.containsKey(root.val))   index = map.get(root.val);
        else{
            while(inorder[index]!=root.val){
                map.put(inorder[index],index);
                index++;
            }
        }
        root.left = helper(preorder, pre_start+1,index-in_start+pre_start,inorder,in_start,index-1);
        root.right = helper(preorder,index-in_start+pre_start+1,pre_end,inorder,index+1,in_end);
        return root;
    }
}
