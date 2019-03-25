package hw_1;

public class Film {
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film (int a, String n, Actor[] A )
    {
        this.anAparitie = a;
        this.nume = n;
        this.actori = A;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}
