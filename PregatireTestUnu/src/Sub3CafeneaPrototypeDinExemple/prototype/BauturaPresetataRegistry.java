package Sub3CafeneaPrototypeDinExemple.prototype;

import java.util.HashMap;
import java.util.Map;

public class BauturaPresetataRegistry {
    private static Map<String, Bautura> sabloane = new HashMap<>();

    public static void adaugaSablon(String cheie, Bautura b) {
        sabloane.put(cheie, b);
    }

    public static Bautura getBauturaPersonalizata(String cheie) {
        Bautura sablon = sabloane.get(cheie);
        if (sablon != null) {
            return sablon.getCopie(); // Returneaza o copie, nu originalul
        }
        return null;
    }
}
