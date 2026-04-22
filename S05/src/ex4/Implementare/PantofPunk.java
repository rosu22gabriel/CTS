package ex4.Implementare;

import java.util.ArrayList;

public class PantofPunk extends CererePantofPersonalizat {
    public PantofPunk() {
        this.stilPantof = "Punk";
        this.mesajeText = new ArrayList<>();
        System.out.println("Incarcare mesaje predefinite stil PUNK din BD...");
        this.mesajeText.add("No limits");
    }


    @Override
    public float calculeazaPret() {
        return 200.0f + (mesajeText.size() * 15);
    }
}
