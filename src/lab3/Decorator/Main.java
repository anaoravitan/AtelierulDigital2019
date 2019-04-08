package lab3.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Beverage whip = new Whip("Sweet Whip", 10, darkRoast);
        Beverage milk = new Milk("Soya Milk", 2, whip);
        Beverage mocha = new Mocha("Mocha no 1", 3, milk);
        System.out.println("Total cost= " + mocha.getCost());
        System.out.println("Description= " + mocha.getDescription());

    }
}
