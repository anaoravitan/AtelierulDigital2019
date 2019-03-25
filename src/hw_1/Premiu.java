package hw_1;

public class Premiu {
    private String name;
    Integer an;

    public Premiu(String Name, int i) {
        this.an = i;
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
