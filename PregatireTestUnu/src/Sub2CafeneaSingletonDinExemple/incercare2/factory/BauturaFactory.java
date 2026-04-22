package Sub2CafeneaSingletonDinExemple.incercare2.factory;

import Sub2CafeneaSingletonDinExemple.incercare1.factory.Ceai;

import java.util.NoSuchElementException;

public class BauturaFactory {
    public static Bautura creeazaBautura(String tip, String nume, int volum, double pret) {
        switch(tip.toLowerCase()) {
            case "cafea": return new Cafea(nume, volum, pret);
            default: throw new NoSuchElementException("Tipul furnizat nu este valid");
        }
    }
}
