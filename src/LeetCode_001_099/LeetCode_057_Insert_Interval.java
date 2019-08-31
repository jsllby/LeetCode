package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_057_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        boolean add = false;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0])
                list.add(intervals[i]);
            else if (intervals[i][0] > newInterval[1]) {
                if (!add || i == 0) {
                    add = true;
                    list.add(newInterval);
                }
                list.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!add) list.add(newInterval);

//        int[] start = new int[intervals.length + 1], end = new int[intervals.length + 1];
//        int indexStart = 0, indexEnd = 0;
//        for (int i = 0; i < intervals.length; i++) {
//            if (indexStart == i && newInterval[0] < intervals[i][0])
//                start[indexStart++] = newInterval[0];
//
//            if (indexEnd == i && newInterval[1] < intervals[i][1])
//                end[indexEnd++] = newInterval[1];
//
//            start[indexStart++] = intervals[i][0];
//            end[indexEnd++] = intervals[i][1];
//        }
//        if (indexStart != start.length) start[indexStart] = newInterval[0];
//        if (indexEnd != end.length) end[indexEnd] = newInterval[1];
//
//        List<int[]> list = new ArrayList<>();
//        for (int i = 0, j = 0; i < start.length; i++) {
//            if (i == start.length - 1 || start[i + 1] > end[i]) {
//                list.add(new int[]{start[j], end[i]});
//                j = i + 1;
//            }
//        }
//
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
}
