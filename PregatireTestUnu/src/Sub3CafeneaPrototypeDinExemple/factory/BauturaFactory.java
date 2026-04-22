package Sub3CafeneaPrototypeDinExemple.factory;

import Sub2CafeneaSingletonDinExemple.incercare1.factory.Bautura;
import Sub2CafeneaSingletonDinExemple.incercare1.factory.Cafea;
import Sub2CafeneaSingletonDinExemple.incercare1.factory.Ceai;
import Sub2CafeneaSingletonDinExemple.incercare1.factory.CiocolataCalda;

public class BauturaFactory {
    public static Bautura creeazaBautura(String tip, String nume, int volum, double pret) {
        switch (tip.toLowerCase()) {
            case "cafea": return new Cafea(nume, volum, pret);
            case "ceai": return new Ceai(nume, volum, pret);
            case "ciocolata": return new CiocolataCalda(nume, volum, pret);
            default: throw new IllegalArgumentException("Tip necunoscut");
        }
    }
}
