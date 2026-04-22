package Sub2CafeneaSingletonDinExemple.incercare1.factory;

// Implementare Ciocolata Calda
public class CiocolataCalda implements Bautura {
    private String nume;
    private int volum;
    private double pret;

    public CiocolataCalda(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Ciocolata " + nume + ": Incalzire lapte, topire tableta ciocolata, mixare.");
    }

    @Override
    public String getDetalii() {
        return "Ciocolata: " + nume + " | Volum: " + volum + "ml | Pret: " + " RON";
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void adaugaTopping(String caramel) {
        
    }
}
