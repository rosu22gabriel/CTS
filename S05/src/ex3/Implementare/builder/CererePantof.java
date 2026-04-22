package ex3.Implementare.builder;

import java.util.ArrayList;
import java.util.List;

public class CererePantof {
    // Atribute obligatorii
    private String tipPantof;
    private int numarPantof;
    private double dimensiuneToc;
    private String materialBaza;

    // Atribute optionale
    private List<String> materialeSecundare;
    private List<String> mesajeText;

    // COnstructor privat pentru a asigura imutabilitatea
    public CererePantof() {}

    @Override
    public String toString() {
        return "CererePantof [Tip=" + tipPantof + ", Nr=" + numarPantof +
                ", Toc=" + dimensiuneToc + ", Material=" + materialBaza +
                ", Secundare=" + materialeSecundare + ", Mesaje=" + mesajeText + "]";
    }

    public static class PantofBuilder {
        private CererePantof pantof = new CererePantof();

        public PantofBuilder(String tip, int numar, double toc, String material) {
            pantof.tipPantof = tip;
            pantof.numarPantof = numar;
            pantof.dimensiuneToc = toc;
            pantof.materialBaza = material;
            pantof.materialeSecundare = new ArrayList<>();
            pantof.mesajeText = new ArrayList<>();
        }

        public PantofBuilder adaugaMaterialSecundar(String material) {
            pantof.materialeSecundare.add(material);
            return this;
        }

        public PantofBuilder adaugaMesajText(String mesaj) {
            pantof.mesajeText.add(mesaj);
            return this;
        }

        public CererePantof build() throws RestrictedShoeException {
            // Validare: Numar pantof intre 35 si 45
            if (pantof.numarPantof < 35 || pantof.numarPantof > 45) {
                throw new RestrictedShoeException("Numar pantof invalid (35-45)!");
            }

            // Validare: Dimensiune toc intre 0.5 || pantof.dimensiuneToc > 12.5 {
            if (pantof.dimensiuneToc < 0.5 || pantof.dimensiuneToc > 12.5) {
                throw new RestrictedShoeException("Dimensiune toc invalida (0.5-12.5)!");
            }

            // Validare: Restrictie materiale secundare vs tip (ex: Stiletto max 2)
            if (pantof.tipPantof.equalsIgnoreCase("stilletto") && pantof.materialeSecundare.size() > 2) {
                throw new RestrictedShoeException("Stiletto nu poate avea mai mult de 2 materiale secundare!");
            }

            // Validare: Lungime mesaje < numar pantof
            int lungimeTotala = 0;
            for (String s : pantof.mesajeText) lungimeTotala += s.length();
            if (lungimeTotala >= pantof.numarPantof) {
                throw new RestrictedShoeException("Suma lungimilor mesajelor depaseste numarul pantofului!");
            }
            return pantof;
        }

    }
}
