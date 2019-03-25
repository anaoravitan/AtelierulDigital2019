package lab2;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play ()
    {
        System.out.println("THE FISH IS PLAYING");
    }
    public void eat ()
    {
        System.out.println("THE FISH IS EATING");
    }

    public void walk ()
    {
        System.out.println("THE FISH IS SWIMMING");
    }
}
