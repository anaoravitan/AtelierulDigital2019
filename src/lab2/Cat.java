package lab2;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() { //pisicile salbatice...
        super(4);
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
        System.out.println("THE CAT IS PLAYING");
    }
    public void eat ()
    {
        System.out.println("THE CAT IS EATING");
    }
}
