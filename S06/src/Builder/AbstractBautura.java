package Builder;

public abstract class AbstractBautura implements IBautura{
    protected String nume;
    protected int volum;
    protected double pret;

    public AbstractBautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }
}
