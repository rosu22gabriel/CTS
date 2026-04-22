package Builder;

public class Ceai extends AbstractBautura {
    Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {

    }

    @Override
    public String getDetalii() {
        return null;
    }

    @Override
    public double getPret() {
        return 0;
    }
}
