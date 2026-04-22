package ex4.Implementare;

import java.util.ArrayList;

public class PantofRock extends CererePantofPersonalizat {
    public PantofRock() {
        this.stilPantof = "Rock";
        this.mesajeText = new ArrayList<>();
        // Simulare incarcare greoaie din baza de date
        System.out.println("Incarcare mesaje predefinite stil ROCK din BD (proces costisitor)...");
        this.mesajeText.add("Born to be Wild");
    }

    @Override
    public float calculeazaPret() {
        return 250.0f + (mesajeText.size() * 10); // Exemplu calcul pret
    }
}


