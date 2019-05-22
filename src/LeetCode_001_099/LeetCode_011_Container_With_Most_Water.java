package LeetCode_001_099;

public class LeetCode_011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                max = Math.max(max, (right-left) * height[left]);
                left++;
            } else {
                max = Math.max(max, (right-left) * height[right]);
                right--;
            }
        }


//        int max = 0;
//        int high = 0;
//        for (int i = height.length - 1; i >= 0; i--) {
//            if (height[i] < high) continue;
//            high = Math.max(high, height[i]);
//            for (int j = 0; j < i; j++) {
//                max = Math.max(max, Math.min(height[i], height[j]) * (i - j));
//                if (height[j] >= height[i]) break;
//            }
//
//        }


//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = 0; j < i; j++) {
//                max = Math.max(max, Math.min(height[i], height[j]) * (i - j));
//                if (height[j] >= height[i]) break;
//            }
//        }
        return max;
    }
}
