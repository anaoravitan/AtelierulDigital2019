package lab6.List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = Arrays.asList(1, 5, 7, 8, 9);
        //Leader.DisplayLeaders(L);

        List<Integer> L2 = Arrays.asList(1, 2, 7, 9);
        List<Integer> Lnew = Merge.merge(L, L2);

        System.out.println(Lnew);

    }
}
