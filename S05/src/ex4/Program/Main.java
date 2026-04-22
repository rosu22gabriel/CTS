package ex4.Program;

import ex4.Implementare.CererePantofPersonalizat;
import ex4.Implementare.PantofPunk;
import ex4.Implementare.PantofRock;

public class Main {
    public static void main(String[] args) {
        try {
            // Initializare prototipuri ( o singura data din BD)
            PantofRock prototipRock = new PantofRock();
            PantofPunk prototipPunk = new PantofPunk();

            // Inregistrare 5 cereri noi prin clonare
            CererePantofPersonalizat c1 = prototipRock.clone();
            c1.setMarimePantof(42);

            CererePantofPersonalizat c2 = prototipRock.clone();
            c2.setMarimePantof(38);

            CererePantofPersonalizat c3 = prototipPunk.clone();
            c3.setMarimePantof(40);

            CererePantofPersonalizat c4 = prototipPunk.clone();
            c4.setMarimePantof(36);

            CererePantofPersonalizat c5 = prototipRock.clone();
            c5.setMarimePantof(44);

            // Parametrizare ulterioara a cel putin 2 pantofi
            System.out.println("\n--- Modificare Cereri ---");
            c1.adaugaMesaj("Metal"); // Valid
            c3.adaugaMesaj("Anarchy"); // Valid

            // Verificare pret si functionalitate
            System.out.println("Pret cerere 1: " + c1.calculeazaPret() + " RON");
            System.out.println("Status c1: " + c1);

            // Testare restrictie caractere (va esua daca mesajul e prea lung)
            System.out.println("\n--- Testare Restrictie ---");
            c4.adaugaMesaj("Acesta este un mesaj mult prea lung pentru un pantof de marime mica");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
