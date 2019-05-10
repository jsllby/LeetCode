package LeetCode_001_099;

public class LeetCode_028_Implement_strStr {
    public int strStr(String haystack, String needle) {
//        KPM
        if(needle.length()==0)  return 0;
        int[] next = Next(needle);
        int i = 0;
        int j = 0;
        while(i<haystack.length()&&j<needle.length()){
            if(j==-1 || haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }
        if(j==needle.length()){
            return i-j;
        }
        return -1;

//        // 1.
//        for (int i = 0; ; i++) {
//            for (int j = 0; ; j++) {
//                if (j == needle.length()) return i;
//                if (i + j == haystack.length()) return -1;
//                if (needle.charAt(j) != haystack.charAt(i + j)) break;
//            }
//        }

        // 2.
//        if (needle.length() == 0) return 0;
//        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
//            for (int j = 0; j < needle.length(); j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) break;
//                if (j == needle.length()-1) return i;
//            }
//        }
//        return -1;
    }

    //KMP wait to be improved
    public int[] Next(String s) {
        int[] next = new int[s.length()];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < s.length() - 1) {
            if (k == -1 || s.charAt(k) == s.charAt(j)) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
        for(int x:next){
            System.out.print(x+", ");
        }
        System.out.println();
        return next;
    }
}
