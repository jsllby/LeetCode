package LeetCode_100_199;

public class LeetCode_104_Maximum_Depth_of_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root==null)  return 0;
        // if(root.left==null&&root.right==null)   return 1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
