package lab1;

import java.lang.reflect.Method;

public class Main
{
    public static void main (String[] args)
    {
        System.out.println("hello world");

        Book book = new Book(30);
        System.out.println("Price: " + book.getPrice());
        displayMethods(book);
        System.out.println("\n");
        Cats();
    }

    private static void displayMethods(Book o)
    {
        Class c = o.getClass();
        Method[] allMethods = c.getMethods();
        for(Method m: allMethods)
        {
            System.out.println(m);
        }
    }

    private static void Cats ()
    {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
        myAnimal.classMethod();
        Cat.classMethod();
        //nu poti Animal.instance pt ca iti trebuie obiect animal
    }
}
