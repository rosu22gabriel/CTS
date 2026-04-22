package Sub2CafeneaSingletonDinExemple.incercare1.main;

import Sub2CafeneaSingletonDinExemple.incercare1.factory.Bautura;
import Sub2CafeneaSingletonDinExemple.incercare1.factory.BauturaFactory;
import Sub2CafeneaSingletonDinExemple.incercare1.singleton.CasaMarcatManager;

public class Main {
    public static void main(String[] args) {
        // 1. Crearea a cel putin 4 obiecte folosind Factory
        Bautura c1 = BauturaFactory.creeazaBautura("cafea", "Espresso", 30, 8.5);
        Bautura c2 = BauturaFactory.creeazaBautura("cafea", "Cappuccino", 150, 12.0);
        Bautura t1 = BauturaFactory.creeazaBautura("ceai", "Verde", 200, 10.0);
        Bautura ch1 = BauturaFactory.creeazaBautura("ciocolata", "Clasica", 250, 15.0);

        // 2. Obtinerea managerului unic (Singleton)
        CasaMarcatManager manager = CasaMarcatManager.getInstanta();

        // 3. Simulare prima comanda
        System.out.println("--- Plasare comanda 1 ---");
        manager.adaugaBautura(c1);
        manager.adaugaBautura(t1);
        manager.adaugaBautura(c1); // Adaugare bautura similara (permis)

        manager.afiseazaComanda();
        System.out.println("Total: " + manager.calculeazaPretTotal() + " RON");

        // 4. Demonstrare Singleton (aceeasi instanta)
        CasaMarcatManager altManager = CasaMarcatManager.getInstanta();
        System.out.println("\n Sunt aceleasi instante? " + (manager == altManager));

        // 5. Resetare si plasare comanda a doua
        manager.resetComanda();
        System.out.println("\n--- PLASARE COMANDA 2 ---");
        manager.adaugaBautura(c2);
        manager.adaugaBautura(ch1);

        manager.afiseazaComanda();
        System.out.println("Total: " + manager.calculeazaPretTotal() + " RON");

        // Preparare bauturi
        System.out.println("\n--- Flux Preparare ---");
        c2.preparare();
        ch1.preparare();
    }
}
