package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_068_Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int start = 0, sum = 0;
        for (int i = 0; i <= words.length; i++) {
            if (i == words.length || sum + words[i].length() > maxWidth) {
                StringBuilder s = new StringBuilder();
                int remainSpace = maxWidth - sum + (i - start), interval = i - start - 1;
                if (interval == 0) {
                    s.append(words[start]);
                    for (int j = 0; j < remainSpace; j++) s.append(' ');
                } else if (i == words.length) {
                    for (int j = start; j < i - 1; j++) {
                        s.append(words[j]);
                        s.append(' ');
                        remainSpace--;
                    }
                    s.append(words[i - 1]);
                    for (int j = 0; j < remainSpace; j++) s.append(' ');
                } else {
                    int space = remainSpace / (interval), remain = remainSpace % interval;
                    for (int j = start; j < i - 1; j++) {
                        s.append(words[j]);
                        for (int k = 0; k < space; k++) s.append(' ');
                        if (remain != 0) {
                            s.append(' ');
                            remain--;
                        }
                    }
                    s.append(words[i - 1]);
                }
                result.add(s.toString());
                start = i;
            }
            if (i != words.length) sum += words[i].length() + 1;
        }
        return result;
    }
}
