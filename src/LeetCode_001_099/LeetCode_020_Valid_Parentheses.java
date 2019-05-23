package LeetCode_001_099;

public class LeetCode_020_Valid_Parentheses {
    public boolean isValid(String string) {
        char[] s = string.toCharArray();
        int top = 0;
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (c == '(') s[top++] = ')';
            else if (c == '{') s[top++] = '}';
            else if (c == '[') s[top++] = ']';
            else if (top == 0 || s[top - 1] != c) return false;
            else    top--;
        }
        return top == 0;

//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c=='(')  stack.push(')');
//            else if(c=='{')  stack.push('}');
//            else if(c=='[') stack.push(']');
//            else if(stack.isEmpty()||c!=stack.pop()) return false;
//        }
//        return stack.isEmpty();
    }
}
