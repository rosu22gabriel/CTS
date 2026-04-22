package Sub5PantofiPrototype.incercare1.main;

import Sub5PantofiPrototype.incercare1.prototype.CererePantof;
import Sub5PantofiPrototype.incercare1.prototype.PantofPop;
import Sub5PantofiPrototype.incercare1.prototype.PantofRock;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Pas 1: Initializare Prototipuri (Incarcare costisitoare o singura data)
            CererePantof protoRock = new PantofRock(40, Arrays.asList("Heavy", "Metal"));
            CererePantof protoPop = new PantofPop(38, Arrays.asList("Star"));


            // Pas 2: Inregistrare 5 cereri prin clonare
            CererePantof c1 = protoRock.clone();
            CererePantof c2 = protoRock.clone();
            CererePantof c3 = protoRock.clone();
            CererePantof c4 = protoPop.clone();
            CererePantof c5 = protoPop.clone();

            // Pas 3: Parametrizare ulterioara cereri
            System.out.println("\n--- Modificare Cereri ---");
            c1.adaugaMesaj("Roll"); // Valabil (HeavyMetalRoll = 14 < 40)
            c4.adaugaMesaj("Pink"); // Valabil (StarPink = 8 < 38)

            // Pas 4: Verificare functionalitati si pret
            System.out.println(c1 + " | Pret: " + c1.calculeazaPret());
            System.out.println(c4 + " | Pret: " + c4.calculeazaPret());

            // Pas 5: Testare restrictie (Eroare la adaugare mesaj prea lung)
            System.out.println("\n--- Testare Restrictie ---");
            c5.adaugaMesaj("Acest mesaj este mult prea lung pentru a fi acceptat de sistem");

            // Pa
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
