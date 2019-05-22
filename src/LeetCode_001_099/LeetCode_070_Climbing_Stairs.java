package LeetCode_001_099;

public class LeetCode_070_Climbing_Stairs {
    public int climbStairs(int n) {
        int dp_1 = 1, dp_2 = 1;
        for(int i=2;i<=n;i++){
            int temp = dp_1+dp_2;
            dp_1 = dp_2;
            dp_2 = temp;
        }
        return dp_2;
    }
}
