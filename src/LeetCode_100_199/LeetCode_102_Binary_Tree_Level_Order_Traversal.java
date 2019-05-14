package LeetCode_100_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LeetCode_102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (queue.peek()!=null) {
            List<Integer> temp = new ArrayList<>();
            while(queue.peek()!=null){
                TreeNode cur = queue.poll();
                if(cur.left!=null)  queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
                temp.add(cur.val);
            }
            queue.poll();
            queue.offer(null);
            result.add(temp);
        }
        return result;
    }
}
