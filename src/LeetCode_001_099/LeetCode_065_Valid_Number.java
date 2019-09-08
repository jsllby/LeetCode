package LeetCode_001_099;

public class LeetCode_065_Valid_Number {
    public boolean isNumber(String s) {
        int state = 0;
        for (char c : s.toCharArray()) {
            switch (state) {
                case -1:
                    return false;
                case 0:
                    if (c >= '0' && c <= '9') state = 1;
                    else if (c == '+' || c == '-') state = 3;
                    else if (c == '.') state = 2;
                    else if (c != ' ') state = -1;
                    break;
                case 1:
                    if (c >= '0' && c <= '9') continue;
                    else if (c == 'e') state = 5;
                    else if (c == '.') state = 4;
                    else if (c == ' ') state = 8;
                    else state = -1;
                    break;
                case 2:
                    if (c >= '0' && c <= '9') state = 4;
                    else state = -1;
                    break;
                case 3:
                    if (c >= '0' && c <= '9') state = 1;
                    else if (c == '.') state = 2;
                    else state = -1;
                    break;
                case 4:
                    if (c >= '0' && c <= '9') continue;
                    else if (c == ' ') state = 8;
                    else if (c == 'e') state = 5;
                    else state = -1;
                    break;
                case 5:
                    if (c >= '0' && c <= '9') state = 7;
                    else if (c == '+' || c == '-') state = 6;
                    else state = -1;
                    break;
                case 6:
                    if (c >= '0' && c <= '9') state = 7;
                    else state = -1;
                    break;
                case 7:
                    if (c >= '0' && c <= '9') continue;
                    else if (c == ' ') state = 8;
                    else state = -1;
                    break;
                case 8:
                    if (c != ' ') state = -1;
                    break;
            }
        }
        return state == 1 || state == 4 || state == 7 || state == 8;
    }
}
