package implementare.calculSalariu;

import implementare.angajati.Angajat;
import implementare.angajati.Lucrator;

public class CalculSalariuLucrator implements ICalculSalariu {

    @Override
    public double getBrutAngajat(Angajat a) {
        Lucrator l = (Lucrator) a;
        double salariuBrut = 0;
        salariuBrut= l.getTarifOrar()*l.getNrOreLucrate();
        return salariuBrut;
    }

}
