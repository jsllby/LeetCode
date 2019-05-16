package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_006_ZigZag_Conversion {
    public String convert(String s, int numRows) {
//        if(numRows==1)  return s;
//        int[][] temp = new int[numRows][s.length()];
//        int x= 0,y=0;
//        for(int i = 0;i<s.length();i++){
//            temp[x][y] = s.charAt(i);
//            if(y%(numRows-1)==0&&x!=numRows-1)    x++;
//            else{
//                x--;
//                y++;
//            }
//
//        }
//        StringBuilder result = new StringBuilder();
//        for(int i = 0;i<numRows;i++){
//            for(int j=0;j<s.length();j++){
//                if(temp[i][j]!=0)   result.append((char)temp[i][j]);
//            }
//        }
//        return result.toString();

//        if(numRows==1)  return s;
//        StringBuilder result = new StringBuilder();
//        for (int x = 0; x < numRows; x++) {
//            if (x < s.length()) result.append(s.charAt(x));
//            int cur = 2 * (numRows - 1) - x;
//            if (cur == x) cur += 2 * (numRows - 1);
//            while (cur < s.length()) {
//                result.append(s.charAt(cur));
//                if (x != 0 && x != numRows - 1 && cur + 2 * x < s.length()) result.append(s.charAt(cur + 2 * x));
//                cur += 2 * (numRows - 1);
//            }
//        }
//        return result.toString();

        List<StringBuilder> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) result.add(new StringBuilder());
        int row = 0;
        int i = 0;
        int dir = 1;
        while (i < s.length()) {
            result.get(row).append(s.charAt(i++));
            if (row == 0) dir = 1;
            if (row == numRows - 1) dir = -1;
            row+=dir;
//            row = 0;
//            while (row < numRows && i < s.length()) {
//                result.get(row++).append(s.charAt(i++));
//            }
//            row = numRows - 2;
//            while (row > 0 && i < s.length()) {
//                result.get(row--).append(s.charAt(i++));
//            }
        }
        StringBuilder temp = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            temp.append(result.get(j));
        }
        return temp.toString();
    }
}
