package implementare.calculSalariu;

import implementare.angajati.Angajat;
import implementare.angajati.Lucrator;
import implementare.angajati.Manager;

import java.util.HashMap;
import java.util.Map;

public class FactoryCalculSalariu {
    private static Map<String, ICalculSalariu> mapa = new HashMap<>();
    static {
        mapa.put(Lucrator.class.getName(), new CalculSalariuLucrator());
        mapa.put(Manager.class.getName(), new CalculSalariuLucrator());
    }

    public static ICalculSalariu getCalculatorDupaAngajat(Angajat a ){
        return mapa.getOrDefault(a.getClass().getName(), new CalculSalariuLucrator());
    }

}
