package implementare.calculSalariu;

import implementare.angajati.Angajat;
import implementare.angajati.Manager;

public class CalculSalariuManager implements ICalculSalariu{
    @Override
    public double getBrutAngajat(Angajat a) {
        Manager m = (Manager) a;
        double salariuBrut = 2000 * m.getCoeficientDeStres();
        return salariuBrut;
    }
}
