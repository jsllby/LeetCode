package LeetCode_001_099;

public class LeetCode_014_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {

        int end = 0;
        int length = strs.length;
        if(length==0)  return "";
        int min = strs[0].length();
        for(int i=1;i<length;i++){
            if(strs[i].length()<min)    min = strs[i].length();
        }
        out:
        for(int i=0;i<min;i++){
            for(int j = 1;j<length;j++){
                if(strs[j-1].charAt(i)!=strs[j].charAt(i))  break out;
            }
            end+=1;
        }
        String result = strs[0].substring(0,end);
        if(result.isEmpty())    return "";
        return result;

//        StringBuilder result = new StringBuilder();
//        out:
//        if(strs.length != 0){
//            int min = strs[0].length();
//            for (int i = 1; i < strs.length; i++) {
//                if (strs[i].length() < min) min = strs[i].length();
//            }
//            for (int i = 0; i < min; i++) {
//                char temp = strs[0].charAt(i);
//                for(int k =1;k<strs.length;k++){
//                    if(strs[k].charAt(i)!=temp) break out;
//                }
//                result.append(temp);
//            }
//        }
//        return result.toString();
    }
}
