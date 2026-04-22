package Sub2CafeneaSingletonDinExemple.incercare1.singleton;

import Sub2CafeneaSingletonDinExemple.incercare1.factory.Bautura;

import java.util.ArrayList;
import java.util.List;

interface ComandaManager {
    void adaugaBautura(Bautura b);
    void afiseazaComanda();
    double calculeazaPretTotal();
    void resetComanda();
}
public class CasaMarcatManager implements ComandaManager {
    private static CasaMarcatManager instanta = null;
    private List<Bautura> listaBauturi = new ArrayList<>();

    // Constructor private - impiedica instantierea multipla
    private CasaMarcatManager() {}

    // Acces unic in toata aplicatia (Thread-safe)
    public static synchronized  CasaMarcatManager getInstanta() {
        if (instanta == null) {
            instanta = new CasaMarcatManager();
        }
        return instanta;
    }

    @Override
    public void adaugaBautura(Bautura b) {
        listaBauturi.add(b);
    }

    @Override
    public void afiseazaComanda() {
        System.out.println("--- Detalii Comanda Curenta ---");
        for (Bautura b : listaBauturi) {
            System.out.println(b.getDetalii());
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for (Bautura b : listaBauturi) { total += b.getPret(); }
        return total;
    }

    @Override
    public void resetComanda() {
        listaBauturi.clear();
        System.out.println("Sistemul este gata pentru o noua comandaq");
    }
}
