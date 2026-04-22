package Sub4PantofiBuilder.incercare1.main;

import Sub4PantofiBuilder.incercare1.builder.CererePantof;
import Sub4PantofiBuilder.incercare1.builder.CererePantofBuilder;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Cerere valida cu materiale secundare
            CererePantof c1 = new CererePantofBuilder("ghete", 42)
                    .dimensiuneToc(3.0)
                    .materialBaza("Piele")
                    .adaugaMaterialSecundar("Blana")
                    .build();
            System.out.println("Creat: " + c1);


            // 2. Cerere valida cu mesaje text
            CererePantof c2 = new CererePantofBuilder("stiletto", 38)
                    .dimensiuneToc(10.0)
                    .materialBaza("Satin")
                    .adaugaMesajText("Love")
                    .build();
            System.out.println("Creat: " + c2);

            // 3. Cerere valida simpla
            CererePantof c3 = new CererePantofBuilder("balerini", 36)
                    .dimensiuneToc(0.5)
                    .materialBaza("Textil")
                    .build();
            System.out.println("Creat: " + c3);

            // 4. Inca o cerere valida
            CererePantof c4 = new CererePantofBuilder("tenisi", 44)
                    .dimensiuneToc(1.0)
                    .materialBaza("Panza")
                    .build();
            System.out.println("Creat: " + c4);

            // 5. Cerere care incalca restrictiile (Mesaje prea lungi)
            System.out.println("Se incearca crearea unei cereri valide");
            CererePantof c5 = new CererePantofBuilder("tenisi", 35)
                    .dimensiuneToc(1.0)
                    .materialBaza("Panza")
                    .adaugaMesajText("Acest mesaj text are o lungime mult prea mare pentru marimea 35")
                    .build();

        } catch (Exception e ) {
            System.out.println("Exceptie prinsa: " + e.getMessage());
        }
    }
}
