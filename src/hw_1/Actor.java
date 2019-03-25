package hw_1;

public class Actor {
    private String name;
    Integer varsta;
    Premiu[] premii;

    public Actor (String Name, int Varsta, Premiu[] Premii)
    {
        this.name = Name;
        this.varsta = Varsta;
        this.premii = Premii;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        System.out.println(premii);
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
}
