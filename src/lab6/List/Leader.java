package lab6.List;

import java.util.Collections;
import java.util.List;

public class Leader {
    public static void DisplayLeaders(List<Integer> L) {
        Collections.reverse(L);
        int max = L.get(0);
        System.out.println("Leaders: ");
        System.out.println(max);
        for(int current: L){
            if(current >  max){
                System.out.println(current);
                max = current;
            }
        }
    }
}
