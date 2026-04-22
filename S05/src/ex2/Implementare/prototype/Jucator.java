package ex2.Implementare.prototype;

import ex2.Implementare.observer.ObservatorJucator;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements Cloneable, ObservatorJucator {
    private String nume;
    private String tipJucator; // Portar, Atacant, etc.
    private List<String> listaAntrenamente;

    private List<String> medicamenteInterzise;

    public Jucator(String tipJucator) {
        this.tipJucator = tipJucator;
        this.listaAntrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
        // Simulare proces consumator de timp
        System.out.println("Incarcare set date complexe pentru tipul: " + tipJucator);
    }

    public void setNume(String nume) { this.nume = nume; }
    public List<String> getListaAntrenament() { return listaAntrenamente; }


    // Implementare Prototype
    @Override
    public Jucator clone() {
        Jucator copie = null;
        try {
            copie = (Jucator) super.clone();
            copie.listaAntrenamente = new ArrayList<>(this.listaAntrenamente);
            copie.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copie;
    }

    // Implementare Observer
    @Override
    public void primesteNotificareMedicament(String medicament) {
        this.medicamenteInterzise.add(medicament);
        System.out.println("Jucatorul " + nume + " a actualizat lista. Medicament nou interzis: " + medicament);
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", tipJucator='" + tipJucator + '\'' +
                ", listaAntrenamente=" + listaAntrenamente +
                ", medicamenteInterzise=" + medicamenteInterzise +
                '}';
    }
}
