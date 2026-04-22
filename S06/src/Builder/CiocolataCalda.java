package Builder;

public class CiocolataCalda extends AbstractBautura{
    private String tipCiocolata;
    private boolean areFrisca;

    CiocolataCalda(String nume, int volum, double pret, String tipCiocolata, boolean areFrisca) {
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
