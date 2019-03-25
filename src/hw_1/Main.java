package hw_1;

public class Main {
    public static void main(String[] args) {
        //System.out.println("89");
        //FizzBuzz();
        //String_compute(1735);
        //String_compute2(53);
        MovieDatabase();
    }

    public static void FizzBuzz() {
        int i;
        for (i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz ");
            else if (i % 3 != 0 && i % 5 == 0)
                System.out.println("Buzz ");
            else if (i % 15 == 0)
                System.out.println("FizzBuzz ");
            else if (i % 7 == 0)
                System.out.println("Rizz");
            else if (i % 9 ==0)
                System.out.println("Jazz");
            else
                System.out.println(i + " ");
    }

    public static void String_compute(int x)
    {
        int number = x;
        int digit;
        if(x%3==0)
            System.out.println("Foo");
        else if (x%5==0)
            System.out.println("Bar");
        else if (x%7==0)
            System.out.println("Qix");
        while(x>1)
        {
            digit = x%10;
            if(digit==3)
                System.out.println("Foo");
            else if (digit==5)
                System.out.println("Bar");
            else if (digit==7)
                System.out.println("Qix");
            x=x/10;
        }
    }

    public static void String_compute2(int x)
    {
        //int number = x;
        int digit;
        if(x%3==0)
            System.out.println("Foo");
        else if (x%5==0)
            System.out.println("Bar");
        else if (x%7==0)
            System.out.println("Qix");
        while(x>0)
        {
            digit = x%10;
            if(digit==3)
                System.out.println("Foo");
            else if (digit==5)
                System.out.println("Bar");
            else if (digit==7)
                System.out.println("Qix");
            else if (digit==0)
                System.out.println("*");
            else
                System.out.println(digit);
            x=x/10;
        }
    }

    public static void MovieDatabase()
    {
        /*Premiu P1 = new Premiu("Oscar pentru Supporting Male Role", 2019);
        System.out.println("Name " + P1.getName());
        System.out.println("Year " + P1.getAn());
        Premiu[] Premii1 = new Premiu[] {P1};
        Actor A1;
        A1 = new Actor ("Mahershala Ali",45, Premii1);
        System.out.println("Name: "+A1.getName()+"\nVarsta: "+A1.getVarsta());
        System.out.println("\nPremii: "+A1.getPremii());*/
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};


    }


}
