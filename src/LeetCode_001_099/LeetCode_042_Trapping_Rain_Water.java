package LeetCode_001_099;

import java.util.Arrays;

public class LeetCode_042_Trapping_Rain_Water {
    public int trap(int[] height) {
        // dp O(2n)
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        Arrays.fill(maxLeft, 0);
        Arrays.fill(maxRight, 0);

//        for (int i = 1; i < height.length; i++) maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
        for (int i = height.length - 2; i > 0; i--) maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);

        int sum = 0;
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
            int max = Math.min(maxLeft[i], maxRight[i]);
            if (max > height[i]) sum += max - height[i];
        }
        return sum;


        // 2 pointers O(n)
//        int sum = 0;
//        int maxLeft = 0, maxRight = 0, left = 0, right = height.length - 1;
//        while (left <= right) {
//            maxLeft = Math.max(maxLeft, height[left]);
//            maxRight = Math.max(maxRight, height[right]);
//            if (maxLeft < maxRight)
//                sum += maxLeft - height[left++];
//            else sum += maxRight - height[right--];
//        }
//        return sum;

//        Stack<Integer> stack = new Stack<>();
//        int sum = 0;
//        for (int i = 0; i < height.length; i++) {
//            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
//                int cur = stack.pop();
//                if (!stack.isEmpty())
//                    sum += (i - stack.peek() - 1) * (Math.min(height[i], height[stack.peek()]) - height[cur]);
//            }
//            stack.push(i);
//        }
//        return sum;
    }
}
