package Sub2CafeneaSingletonDinExemple.incercare2.factory;

public class Cafea implements Bautura{
    public String nume;
    public int volum; // mililitri
    public double pret;

    public Cafea(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Metoda preparare pentru: " + this.nume);
        System.out.println("1. Macinare boabe");
        System.out.println("2. Umplere portafiltru");
        System.out.println("3. Extractie in ceasca");
    }

    @Override
    public String getDetalii() {
        return String.format("produs: %s -- volum:  %d mililitri -- pret %f",
                this.nume,
                this.volum,
                this.pret);
    }

    @Override
    public double getPret() {
        return pret;
    }
}
