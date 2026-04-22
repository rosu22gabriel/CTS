package Sub2CafeneaSingletonDinExemple.incercare1.factory;

public class Ceai implements Bautura {
    private String nume;
    private int volum;
    private double pret;

    public Ceai(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Ceai " + nume + ": Fierbere apa la 80 de grade, infuzare frunze 3 minute");
    }

    @Override
    public String getDetalii() {
        return "Ceai: " + nume + " | Volum: " + volum + "ml | Pret: " + pret + " RON";
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void adaugaTopping(String caramel) {
        
    }
}
