package Sub2CafeneaSingletonDinExemple.incercare1.factory;

// Implementare Cafea
public class Cafea implements Bautura {
    private String nume;
    private int volum;
    private double pret;

    public Cafea(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Cafea " + nume + ": Rasnire boabe, extragere shot, adaugare apa/lapte.");
    }

    @Override
    public String getDetalii() {
        return "Cafea: " + nume + " | Volum" + volum + "ml | Pret: " + pret + " RON";
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void adaugaTopping(String caramel) {
        
    }
}
