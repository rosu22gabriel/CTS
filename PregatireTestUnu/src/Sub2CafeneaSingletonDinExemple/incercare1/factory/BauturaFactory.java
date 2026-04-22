package Sub2CafeneaSingletonDinExemple.incercare1.factory;

public class BauturaFactory {
    public static Bautura creeazaBautura(String tip, String nume, int volum, double pret) {
        switch (tip.toLowerCase()) {
            case "cafea": return new Cafea(nume, volum, pret);
            case "ceai": return new Ceai(nume, volum, pret);
            case "ciocolata": return new CiocolataCalda(nume, volum, pret);
            default: throw new IllegalArgumentException("Tip de bautura necunoscut.");
        }
    }
}
