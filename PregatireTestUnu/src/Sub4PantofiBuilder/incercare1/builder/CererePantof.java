package Sub4PantofiBuilder.incercare1.builder;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CererePantof {
    private final String tipPantof;
    private final int numarPantof;
    private final double dimensiuneToc;
    private final String materialBaza;
    private final List<String> materialeSecundare;
    private final List<String> mesajeText;

    // Constructor package-private cu toate validarile incluse
    CererePantof(String tipPantof, int numarPantof, double dimensiuneToc,
                 String materialBaza, List<String> materialeSecundare, List<String> mesajeText) throws Exception {

        // Validare Numar Pantof
        if (numarPantof < 35 || numarPantof > 45) {
            throw new Exception("Numarul pantofului trebuie sa fie intre 35 si 45.");
        }

        // Validare Dimensiune Toc
        if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
            throw new Exception("Dimensiunea tocului trebuie sa fie intre 0.5 si 12.5");
        }

        // Validare restrictie specifica tipului (Ex: Ghetele trebuie sa aiba minim un material secundar)
        if (tipPantof.equalsIgnoreCase("ghete") && materialeSecundare.isEmpty()) {
            throw new Exception("Ghetele personalizate trebuie sa aiba cel putin un material secundar.");
        }

        // Validare Lungime Mesaje vs Numar Pantof
        int lungimeTotala = 0;
        for (String m : mesajeText) lungimeTotala += m.length();
        if (lungimeTotala >= numarPantof) {
            throw new Exception("Suma lungimilor mesajelor trebuie sa fie mai mica decat numarul pantofului.");
        }

        this.tipPantof = tipPantof;
        this.numarPantof = numarPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialeSecundare = new ArrayList<>(materialeSecundare);
        this.mesajeText = new ArrayList<>(mesajeText);
    }

    @Override
    public String toString() {
        return "Pantof " + tipPantof + "(Marime: " + numarPantof + ", Toc: " + dimensiuneToc + ");";
    }
}
