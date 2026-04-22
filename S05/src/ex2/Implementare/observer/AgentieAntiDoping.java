package ex2.Implementare.observer;

// Interfata pentru subiectul observat (AntiDopingCenter)
public interface AgentieAntiDoping {
    void adaugaJucator(ObservatorJucator jucator);
    void eliminaJucator(ObservatorJucator jucator);
    void notificaJucatori(String medicamentNou);
}

