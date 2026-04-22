package ex2.Implementare.observer;

import java.util.ArrayList;
import java.util.List;

public class CentruControlAnitDoping implements AgentieAntiDoping{
    private List<ObservatorJucator> jucatori = new ArrayList<>();
    @Override
    public void adaugaJucator(ObservatorJucator jucator) {
        jucatori.add(jucator);
    }

    @Override
    public void eliminaJucator(ObservatorJucator jucator) {
        jucatori.remove(jucator);
    }

    @Override
    public void notificaJucatori(String medicamentNou) {
        for (ObservatorJucator j : jucatori) {
            j.primesteNotificareMedicament(medicamentNou);
        }
    }
}
