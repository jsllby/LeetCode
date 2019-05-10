package LeetCode_700_799;

class Solution {
    public int numJewelsInStones(String J, String S) {
//        1. O(m*n)
//        int count = 0;
//        for (int i = 0; i < S.length(); i++) {
//            if (J.indexOf(S.charAt(i)) != -1) {
//                count += 1;
//            }
//        }
//        return count;

//        2. O(m+n)
//        int count = 0;
//        int[] map = new int[256];
//        for (int i = 0; i < S.length(); i++) {
//            map[S.charAt(i)] += 1;
//        }
//        for (int i = 0; i < J.length(); i++) {
//            count += map[J.charAt(i)];
//        }
//        return count;

//        improve 2
        int count = 0;
        int[] map = new int[256];
        for (char i : S.toCharArray()) {
            map[i] += 1;
        }
        for (char i : J.toCharArray()) {
            count += map[i];
        }
        return count;
    }
}