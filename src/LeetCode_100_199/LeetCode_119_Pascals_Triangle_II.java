package LeetCode_100_199;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119_Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(1);
            for (int j = result.size() - 2; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        for (int i = 0; i < result.size(); i++) System.out.print(result.get(i) + " ");
        return result;
    }
}
