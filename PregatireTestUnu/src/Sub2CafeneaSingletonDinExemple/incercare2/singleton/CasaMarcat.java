package Sub2CafeneaSingletonDinExemple.incercare2.singleton;

import Sub2CafeneaSingletonDinExemple.incercare2.factory.Bautura;

import java.util.ArrayList;
import java.util.List;

public class CasaMarcat implements ComandaManager{
    private static CasaMarcat instanta = null;
    private List<Bautura> comanda = new ArrayList<>();

    // Constructor private pentru inaccesibilitate din exterior
    // instantiere multipla
    private CasaMarcat() {
        // aici se initializeaza datele din Singleton
    }

    // Acces unic in toata aplicatia - Thread Safe
    public static synchronized CasaMarcat getInstance() {
        if (instanta == null) {
            instanta = new CasaMarcat();
        }
        return instanta;
    }


    @Override
    public void AdaugaBautura(Bautura b) {
        comanda.add(b);
    }

    @Override
    public void AfiseazaComanda() {
        System.out.println("--- Detalii Comanda Curent ---");
        for (Bautura b : comanda) {
            System.out.println(b.getDetalii());
        }
    }

    @Override
    public double CalculeazaPretTotal() {
        System.out.println("--- Pretul Total Al Comenzii Curente ---");

        double total = 0;
        for (Bautura b : comanda) {
            total += b.getPret();
        }
        return total;
    }

    @Override
    public void ResetComanda() {
        comanda.clear();
    }
}
