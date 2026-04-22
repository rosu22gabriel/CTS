package Sub2CafeneaSingletonDinExemple.incercare2.singleton;

import Sub2CafeneaSingletonDinExemple.incercare2.factory.Bautura;

public interface ComandaManager {
    void AdaugaBautura(Bautura b);
    void AfiseazaComanda();
    double CalculeazaPretTotal();
    void ResetComanda();
}
