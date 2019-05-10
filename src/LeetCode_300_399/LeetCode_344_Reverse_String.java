package LeetCode_300_399;

public class LeetCode_344_Reverse_String {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start++]=s[end];
            s[end--] = temp;
        }
    }
}
