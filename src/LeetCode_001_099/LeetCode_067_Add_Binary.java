package LeetCode_001_099;

public class LeetCode_067_Add_Binary {
    public String addBinary(String a, String b) {

        // improve
        int x = a.length()-1;
        int y = b.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while(x>=0||y>=0){
            int temp = carry;
            if(x>=0)    temp+=a.charAt(x--)-'0';
            if(y>=0)    temp+=b.charAt(y--)-'0';
            carry = temp/2;
            result.insert(0,temp%2);
        }
        if(carry!=0)    result.insert(0,carry);

//        My Code
//        int x = a.length();
//        int y = b.length();
//        StringBuilder result = new StringBuilder();
//        int flag = 0;
//        for(int i =1;i<=x||i<=y;i++){
//            int temp = flag;
//            if(i<=x)    temp+=Integer.parseInt(String.valueOf(a.charAt(x-i)));
//            if(i<=y)    temp+=Integer.parseInt(String.valueOf(b.charAt(y-i)));
//            flag = temp/2;
//            temp = temp%2;
//            result.insert(0,temp);
//        }
//        if(flag!=0) result.insert(0,flag);
        return result.toString();
    }
}
