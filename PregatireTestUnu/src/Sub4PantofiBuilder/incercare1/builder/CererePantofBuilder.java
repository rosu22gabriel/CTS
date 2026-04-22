package Sub4PantofiBuilder.incercare1.builder;

import java.util.ArrayList;
import java.util.List;

public class CererePantofBuilder {
    private String tipPantof;
    private int numarPantof;
    private double dimensiuneToc;
    private String materialBaza;
    private List<String> materialeSecundare = new ArrayList<>();
    private List<String> mesajeText = new ArrayList<>();

    public CererePantofBuilder(String tipPantof, int numarPantof) {
        this.tipPantof = tipPantof;
        this.numarPantof = numarPantof;
    }

    public CererePantofBuilder dimensiuneToc(double dimensiuneToc) {
        this.dimensiuneToc = dimensiuneToc;
        return this;
    }

    public CererePantofBuilder materialBaza(String materialBaza) {
        this.materialBaza = materialBaza;
        return this;
    }

    public CererePantofBuilder adaugaMaterialSecundar(String material) {
        this.materialeSecundare.add(material);
        return this;
    }

    public CererePantofBuilder adaugaMesajText(String mesaj) {
        this.mesajeText.add(mesaj);
        return this;
    }

    public CererePantof build() throws Exception {
        // Apelam constructorul care va executa validarile finale
        return new CererePantof(tipPantof, numarPantof, dimensiuneToc, materialBaza,
                materialeSecundare, mesajeText);
    }
}
