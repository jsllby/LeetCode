package LeetCode_500_599;

public class LeetCode_557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
//        1.
        char[] result = s.toCharArray();
        int cur = 0;
        while (cur<result.length){
            if(result[cur]== ' '){
                cur++;
                continue;
            }
            int end = s.indexOf(' ', cur);
            if(end == -1)   end = result.length;
            for(int i = end-1;i>cur;i--){
                char temp = result[i];
                result[i] = result[cur];
                result[cur++] = temp;
            }
            cur = end+1;
        }
        return String.valueOf(result);

//        2.
//        StringBuilder result = new StringBuilder();
//        int cur = 0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!=' '){
//                result.insert(cur, s.charAt(i));
//            }
//            else{
//                result.insert(i,' ');
//                cur = i+1;
//            }
//        }
//        return result.toString();
    }
}
