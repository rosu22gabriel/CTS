package ex4.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class CererePantofPersonalizat implements Cloneable {
    protected String stilPantof; // rock, pop, punk
    protected int marimePantof;
    protected List<String> mesajeText;

    public abstract float calculeazaPret();

    // Metoda de clonare conform pattern-ului Prototype
    @Override
    public CererePantofPersonalizat clone() throws CloneNotSupportedException {
        CererePantofPersonalizat copie = (CererePantofPersonalizat) super.clone();
        // Deep copy pentru lista de mesaje pentru a permite modificari ulterioare
        copie.mesajeText = new ArrayList<>(this.mesajeText);
        return copie;
    }

    public void adaugaMesaj(String mesaj) throws Exception {
        int lungimeCurenta = 0;
        for (String m : mesajeText) lungimeCurenta += m.length();

        // Restrictie: Suma caracterelor nu depaseste marimea pantofului
        if (lungimeCurenta + mesaj.length() > marimePantof) {
            throw new Exception("Eroare: Lungimea mesajelor depaseste marimea pantofului" + marimePantof);
        }
        this.mesajeText.add(mesaj);
        System.out.println("Mesaj adaugat cu succes: " + mesaj);
    }

    public void setMarimePantof(int marime) { this.marimePantof = marime; };

    @Override
    public String toString() {
        return "Pantof " + stilPantof + " (Marime: " + marimePantof + ") - Mesaje: "  + mesajeText;
    }
}
