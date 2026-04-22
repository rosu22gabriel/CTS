package Sub1CasaMarcat.incercare1.main;

import Sub1CasaMarcat.incercare1.singleton.AbstractAngajat;
import Sub1CasaMarcat.incercare1.singleton.Angajat;
import Sub1CasaMarcat.incercare1.singleton.CasaMarcat;

public class Main {
    public static void main(String[] args) {
        AbstractAngajat a1 = new Angajat("Popescu");
        AbstractAngajat a2 = new Angajat("Ionescu");

        // Simulare proces folosind doua fire de executie
        Thread t1 = new Thread(() -> {
            CasaMarcat c1 = CasaMarcat.getInstanta(1);
            c1.deschideComanda(a1);
            c1.adaugaProdus("Paine");
            c1.showInfoComanda();
        });

        Thread t2 = new Thread(() -> {
            CasaMarcat c2 = CasaMarcat.getInstanta(2);
            c2.deschideComanda(a2);
            c2.adaugaProdus("Lapte");
            c2.showInfoComanda();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

            // Demonstractie ca o comanda nu poate fi modificata de alt angajat
            System.out.println("\n--- Testare restrictie angajat ---");
            CasaMarcat testCasa = CasaMarcat.getInstanta(1);
            testCasa.inchideComanda(a2); // Ionescu incearca sa inchida comanda lui Popescu
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
