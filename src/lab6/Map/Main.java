package lab6.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person P1 = new Person("Varzoiu",1980206);
        Person P2 = new Person("Oravitan",2990923);
        Person P3 = new Person("Momoa",1850303);

        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(P1.getCNP(), P1);
        map.put(P2.getCNP(), P2);
        map.put(P3.getCNP(), P3);

        System.out.println("Person " + map.get(2990923));

    }
}
