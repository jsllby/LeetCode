package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_060_Permutation_Sequence {
    public String getPermutation(int n, int k) {
        List<Integer> s = new ArrayList<>();
        int production = 1;
        for (int i = 1; i < n; i++) {
            s.add(i);
            production *= i;
        }
        s.add(n);

        int temp = n - 1;
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            int pos = 0;
            while (k > production) {
                k -= production;
                pos++;
            }

//            int pos = k / production;
//            k %= production;
//            if (k == 0) {
//                k = production;
//                if (pos != 0) pos--;
//            }

            result.append(s.get(pos));
            s.remove(pos);
            if (temp != 0) production /= temp--;
        }
        return result.toString();

//        int part = 0, product = 1;
//        while (k < product) {
//            product *= ++part;
//        }
//        product /= part;
//        part--;
//
//        k -= product;
//
//        int[] s = new int[n];
//        for (int i = 0; i < n - part; i++) s[i] = i + 1;
//        for (int i = n - part; i < n; i++) s[i] = 2 * n - i - part;
//
//        for (int i = 1; i <= k; i++){
//            for (int x = n - 2; x >= 0; x--) {
//                if (s[x] < s[x + 1]) {
//                    int temp = n - 1;
//                    for (; temp >= 0; temp--) if (s[temp] > s[x]) break;
//                    int t = s[x];
//                    s[x] = s[temp];
//                    s[temp] = t;
//                    Arrays.sort(s, x + 1, n);
//                    break;
//                }
//            }
//        }

//        int[] s = new int[n];
//        for (int i = 1; i <= n; i++) s[i - 1] = i;
//        for (int i = 1; i < k; i++) {
//            for (int x = n - 2; x >= 0; x--) {
//                if (s[x] < s[x + 1]) {
//                    int temp = n - 1;
//                    for (; temp >= 0; temp--) if (s[temp] > s[x]) break;
//                    int t = s[x];
//                    s[x] = s[temp];
//                    s[temp] = t;
//                    Arrays.sort(s, x + 1, n);
//                    break;
//                }
//            }
//        }
//        StringBuilder result = new StringBuilder();
//        for(int x:s)    result.append(x);
//        return result.toString();
    }
}
