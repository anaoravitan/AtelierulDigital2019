package lab6.List;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static List<Integer> merge(List<Integer> L1, List<Integer> L2) {
        List<Integer> NewList = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < L1.size() && j < L2.size()) {
            if (L1.get(i) < L2.get(j)) {
                NewList.add(L1.get(i));
                i++;
            } else {
                NewList.add(L2.get(j));
                j++;
            }
        }

        while (i < L1.size()) {
            NewList.add(L1.get(i));
            i++;
        }

        while (j < L2.size()) {
            NewList.add(L2.get(j));
            j++;
        }

        return NewList;

    }
}
