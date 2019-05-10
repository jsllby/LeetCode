public class Main {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aaaaBBBB";
        System.out.println(Solution.numJewelsInStones(J, S));
    }
}

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
