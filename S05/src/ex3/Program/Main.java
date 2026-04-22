package ex3.Program;

import ex3.Implementare.builder.CererePantof;
import ex3.Implementare.builder.RestrictedShoeException;

public class Main {
    public static void main(String[] args) {
        // Testare minim 5 cereri
        try {
            // 1. Cerere valida simpla
            CererePantof c1 = new CererePantof.PantofBuilder("Balerini", 38, 0.5, "Piele").build();
            System.out.println("Lansat: " + c1);

            // 2. Cerere cu materiale secundare
            CererePantof c2 = new CererePantof.PantofBuilder("Ghete", 42, 2.0, "Box")
                    .adaugaMaterialSecundar("Blana")
                    .adaugaMaterialSecundar("Capse")
                    .build();
            System.out.println("Lansat: " + c2 );

            // 3. Cerere cu mesaje text
            CererePantof c3 = new CererePantof.PantofBuilder("Tenisi", 40, 1.0, "Panza")
                    .adaugaMesajText("Run")
                    .adaugaMesajText("Fast")
                    .build();
            System.out.println("Lansat " + c3);

            // 4. Inca o cerere valida
            CererePantof c4 = new CererePantof.PantofBuilder("Stilleto", 36 , 10.0, "Catifea").build();
            System.out.println("Lansat: " + c4);

            // 5. Cerere care NU convine restrictiilor (Ex: Numar prea mare)
            System.out.println("Incercare cerere invalida...");
            CererePantof c5 = new CererePantof.PantofBuilder("Ghete", 50, 2.0, "Piele").build();


        } catch (RestrictedShoeException e) {
            System.err.println("Eroare validare: " + e.getMessage());
        }
    }
}
