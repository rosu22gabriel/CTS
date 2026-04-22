package Sub2CafeneaSingletonDinExemple.incercare2.main;

import Sub2CafeneaSingletonDinExemple.incercare2.factory.Bautura;
import Sub2CafeneaSingletonDinExemple.incercare2.factory.BauturaFactory;
import Sub2CafeneaSingletonDinExemple.incercare2.singleton.CasaMarcat;

public class Main {
    public static void main(String[] args) {
        // 1. Creare de bauturi
        Bautura c1 = BauturaFactory.creeazaBautura("Cafea", "Americano", 200, 8);
        Bautura c2 = BauturaFactory.creeazaBautura("Cafea", "Cappuccino", 300, 10);


        // 2. Instantiere CasaMarcat
        CasaMarcat casaMarcat1 = CasaMarcat.getInstance();

        casaMarcat1.AdaugaBautura(c1);
        casaMarcat1.AfiseazaComanda();
        System.out.println(casaMarcat1.CalculeazaPretTotal());
        casaMarcat1.ResetComanda();

        // 3. Exemplificare instantiere multipla

        CasaMarcat casaMarcat2 = CasaMarcat.getInstance();
        System.out.println("Sunt aceleasi instante? -- " + (casaMarcat2 == casaMarcat1));

        // 4. Exemplificare plasare doua comenzi simultan
        casaMarcat1.AdaugaBautura(c2);
        casaMarcat1.AdaugaBautura(c1);

        casaMarcat1.AfiseazaComanda();

        // Preparare
        c1.preparare();
        c2.preparare();


    }
}
