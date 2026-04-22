package Sub1CasaMarcat.incercare1.singleton;

public class Angajat implements AbstractAngajat {
    private String nume;
    public Angajat(String nume) { this.nume = nume; }

    @Override
    public String getNume() {
        return nume;
    }
}
