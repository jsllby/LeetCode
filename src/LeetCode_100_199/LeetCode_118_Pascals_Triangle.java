package LeetCode_100_199;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if (i < 3) {
                temp.add(1);
            } else {
                for (int j = 0; j < i - 2; j++) {
                    temp.set(j, temp.get(j) + temp.get(j + 1));
                }
                temp.add(0,1);
            }

            System.out.println(temp.size());
            result.add(new ArrayList<>(temp));
        }
        return result;
    }
}
