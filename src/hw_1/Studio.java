package hw_1;

public class Studio {
    String nume;
    Film[] filme;

    public Studio (String n, Film[] f)
    {
        this.nume = n;
        this.filme = f;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }
}

