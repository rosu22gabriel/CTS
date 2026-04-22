package Sub5PantofiPrototype.incercare1.prototype;

import Sub4PantofiBuilder.incercare1.builder.CererePantofBuilder;

import java.util.ArrayList;
import java.util.List;

public abstract class CererePantof implements Cloneable {
    private String stil;
    private int marime;
    private List<String> mesajeText;

    // Constructor package-private cu validari incluse
    CererePantof(String stil, int marime, List<String> mesajeInitial) throws Exception {
        validareMesaje(mesajeInitial, marime);
        this.stil = stil;
        this.marime = marime;
        this.mesajeText = new ArrayList<>(mesajeInitial);
    }

    // Metoda de validare ceruta in restrictii
    private void validareMesaje(List<String> mesaje, int marime) throws Exception {
        int totalCaractere = 0;
        for (String mesaj : mesaje) {
            totalCaractere += mesaj.length();
        }
        if (totalCaractere > marime) {
            throw new Exception("Eroare: Insumarea caracterelor (" + totalCaractere +
                    ") depaseste marimea pantofului (" + marime + ")!");
        }
    }

    public void adaugaMesaj(String mesaj) throws Exception {
        List<String> nouaLista = new ArrayList<>(this.mesajeText);
        nouaLista.add(mesaj);
        validareMesaje(nouaLista, this.marime); // Revalidare la modificare
    }

    public abstract double calculeazaPret(); // Cerinta testare


    @Override
    public CererePantof clone(){
        try {
            CererePantof copie = (CererePantof)  super.clone();
            copie.mesajeText = new ArrayList<>(this.mesajeText);
            return copie;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "CererePantof{" +
                "stil='" + stil + '\'' +
                ", marime=" + marime +
                ", mesajeText=" + mesajeText +
                '}';
    }
}
