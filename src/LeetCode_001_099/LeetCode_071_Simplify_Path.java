package LeetCode_001_099;

import java.util.Stack;

public class LeetCode_071_Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> directory = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!directory.isEmpty()) directory.pop();
            } else if (!s.equals("") && !s.equals(".")) directory.add(s);
        }
        StringBuilder result = new StringBuilder();
        for (String s : directory) {
            result.append('/');
            result.append(s.toString());
        }
        if (result.length() == 0) result.append('/');
        return result.toString();


//        List<StringBuilder> directory = new ArrayList<>();
//        StringBuilder temp = new StringBuilder();
//        boolean inDirectory = false;
//        for (char c : path.toCharArray()) {
//            if (c == '/' && inDirectory) {
//                inDirectory = false;
//                if (temp.toString().equals("..") && directory.size() != 0)
//                    directory.remove(directory.size() - 1);
//                else if (!temp.toString().equals("..") && !temp.toString().equals("."))
//                    directory.add(temp);
//                temp = new StringBuilder();
//            } else if (c != '/') {
//                temp.append(c);
//                inDirectory = true;
//            }
//        }
//        if (temp.toString().equals("..") && directory.size() != 0)
//            directory.remove(directory.size() - 1);
//        else if (!temp.toString().equals("..") && !temp.toString().equals(".") && temp.toString().length() != 0)
//            directory.add(temp);
//
//        StringBuilder result = new StringBuilder();
//        for (StringBuilder s : directory) {
//            result.append('/');
//            result.append(s.toString());
//        }
//        if (result.length() == 0) result.append('/');
//        return result.toString();
    }
}
