package lab2;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal spider  = new Spider();
        Animal fish = new Fish();
        Pet fishPet = new Fish();
        Pet catPet = new Cat("Mitzi");
        catPet.play();
        fish.walk();
        ((Fish) fishPet).eat();
        System.out.println(spider.legs);

    }
}
