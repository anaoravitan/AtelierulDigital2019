package lab6.Map;

public class Person {
    private String name;
    private int CNP;

    public Person(String name, int CNP) {
        this.name = name;
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CNP=" + CNP +
                '}';
    }
}
