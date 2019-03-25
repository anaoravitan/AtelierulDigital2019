package lab2;

public abstract class Animal { //in schema era scris cu italic => abstract => nu putem face new object
    protected int legs; // avea # in schema

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("IT'S WALKING!");
    }

    public abstract void eat() ;
}
