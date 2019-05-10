package LeetCode_600_699;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_658_Find_K_Closest_Elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - k, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (Math.abs(x - arr[mid]) > Math.abs(x - arr[mid + k])) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        for (int i = 0; i < k; i++) result.add(arr[i + left]);
        return result;

//        //谁能想到，这居然比二分法快呢
//        List<Integer> result = new ArrayList<>();
//        int left = 0, right = arr.length - 1;
//        while (left < right - k + 1) {
//            if (Math.abs(x - arr[left]) <= Math.abs(arr[right] - x)) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        for(int i = left;i<=right;i++){
//            result.add(arr[i]);
//        }
//        return result;

        //太慢了
//        List<Integer> result = new ArrayList<>();
//        int left = 0, right = arr.length;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] < x) left = mid + 1;
//            else right = mid;
//        }
//        if(arr[left]!=x){
//            if(left==0) left=-1;
//            else if((x - arr[left - 1]) <= (arr[left] - x)) left--;
//        }
//
//        int start = left, end = left + 1;
//        for (int i = 0; i < k; i++) {
//            if (start < 0) result.add(arr[end++]);
//            else if (end >= arr.length) result.add(0, arr[start--]);
//            else if ((x - arr[start]) <= (arr[end] - x)) result.add(0, arr[start--]);
//            else result.add(arr[end++]);
//        }
//        return result;
    }
}
