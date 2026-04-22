package ex2.Program;

import ex2.Implementare.observer.CentruControlAnitDoping;
import ex2.Implementare.prototype.Jucator;

public class Main {
    public static void main(String[] args) {
        // 1. Initializare prototiouri (proces greoi facut o singura data)
        Jucator prototipAtacant = new Jucator("Atacant");
        prototipAtacant.getListaAntrenament().add("Sut la poarta");

        Jucator prototipPortar = new Jucator("Portar");
        prototipPortar.getListaAntrenament().add("Reflexe");

        // 2. Initializare sistem Anti-Doping
        CentruControlAnitDoping anad = new CentruControlAnitDoping();

        // 3. Inregistrare 3 jucatori (2 de acelasi tip) prin clonare
        Jucator j1 = prototipAtacant.clone();
        j1.setNume("Popescu");
        anad.adaugaJucator(j1);

        Jucator j2 = prototipAtacant.clone();
        j2.setNume("Ionescu");
        anad.adaugaJucator(j2);

        Jucator j3 = prototipPortar.clone();
        j3.setNume("Duckadam");
        anad.adaugaJucator(j3);

        // 4. Simulare procese
        System.out.println("--- Simulare adaugare medicament interzis ---");
        anad.notificaJucatori("SubstantaX_2026");

        System.out.println("--- Actualizare antrenament personal ---");
        j1.getListaAntrenament().add("Antrenament specific viteza");

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
    }
}
