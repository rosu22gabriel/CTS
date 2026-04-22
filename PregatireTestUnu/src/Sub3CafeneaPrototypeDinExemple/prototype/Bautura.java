package Sub3CafeneaPrototypeDinExemple.prototype;

import java.util.ArrayList;
import java.util.List;

// Interfata furnizata in enunt
public interface Bautura extends Cloneable {
    void preparare();
    String getDetalii();
    double getPret();
    void adaugaTopping(String topping);
    Bautura getCopie(); // Metoda pentru Prototype
}

abstract class BauturaBase implements Bautura {
    protected String nume;
    protected int volum;
    protected double pret;
    protected List<String> toppinguri = new ArrayList<>();

    public BauturaBase(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
        // Simulare incarcare costisitoare a retetei/configuratiei
        System.out.println("incarcare configuratie complexa pentru " + nume + "...");
    }

    @Override
    public void adaugaTopping(String topping) {
        this.toppinguri.add(topping);
    }

    @Override
    public double getPret() {
        return pret + (toppinguri.size() * 2.5);
    }

    @Override
    public String getDetalii() {
        return String.format("%s (%dml) - Pret: %.2f RON - Toppinguri: %s",
                nume, volum, getPret(), toppinguri.isEmpty() ? "Niciunul" : toppinguri);
    }

    @Override
    public Bautura getCopie() {
        try {
            BauturaBase copie = (BauturaBase) super.clone();
            // Deep copy pentru lista de toppinguri
            copie.toppinguri = new ArrayList<>(this.toppinguri);
            return copie;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

class Cafea extends BauturaBase {
    public Cafea(String nume, int volum, double pret) { super(nume, volum, pret); }
    @Override
    public void preparare() {
        System.out.println("Preparare Cafea: Macinare, infuzare, turnare.");
    }
}

class Ceai extends BauturaBase {
    public Ceai(String nume, int volum, double pret) { super(nume, volum, pret); }
    @Override
    public void preparare() {
        System.out.println("Preparare Ceai: Incalzire apa, infuzare frunze specifice");
    }
}

class CiocolataCalda extends BauturaBase {
    public CiocolataCalda(String nume, int volum, double pret) { super(nume, volum, pret); }
    @Override
    public void preparare() {
        System.out.println("Preparare Ciocolata: Topire pudra, amestecare lapte fierbinte.");
    }
}
