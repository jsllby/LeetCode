package LeetCode_001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_056_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        List<int[]> res = new ArrayList<>();
        for (int i = 0, j = 0; i < start.length; i++) {
            if (i == start.length - 1 || start[i + 1] > end[i]) {
                res.add(new int[]{start[j], end[i]});
                j = i + 1;
            }
        }
        int[][] result = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) result[i] = res.get(i);
        return result;

//        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] < o2[0]) return -1;
//                else if (o1[0] == o2[0]) return 0;
//                else return 1;
//            }
//        });
//
//
//        int[][] result = new int[intervals.length][];
//        int count = 0;
//        for (int[] interval : intervals) {
//            if (count == 0 || interval[0] > result[count - 1][1]) result[count++] = interval;
//            else
//                result[count - 1][1] = Math.max(result[count - 1][1], interval[1]);
//        }
//        return Arrays.copyOfRange(result, 0, count);

//        List<int[]> res = new ArrayList<>();
//        res.add(intervals[0]);
//        int[] last = res.get(res.size() - 1);
//        for (int i = 1; i < intervals.length; ) {
//            if (intervals[i][0] > last[1]) {
//                res.add(intervals[i]);
//                last = res.get(res.size() - 1);
//            } else if (intervals[i][1] < last[1]) continue;
//            else last[1] = intervals[i][1];
//        }

//        Stack<int[]> stack = new Stack<>();
//        for (int[] interval : intervals) {
//            if (stack.isEmpty() || interval[0] > stack.peek()[1]) stack.push(interval);
//            else{
//                stack.peek()[1] = Math.max(stack.peek()[1], interval[1]);
//            }
//        }
//        int[][] result = new int[stack.size()][2];
//        for(int i=0;i<result.length;i++)    result[i] = stack.pop();
//        return result;


    }
}
