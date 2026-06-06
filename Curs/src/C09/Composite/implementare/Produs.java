package C09.Composite.implementare;

public class Produs extends ANod {

    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return null;
    }

    @Override
    public int getPret() {
        return 0;
    }
}
