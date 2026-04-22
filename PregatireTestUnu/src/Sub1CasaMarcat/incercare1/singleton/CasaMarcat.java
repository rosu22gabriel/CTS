package Sub1CasaMarcat.incercare1.singleton;

import java.util.ArrayList;
import java.util.List;

public class CasaMarcat implements AbstractCasaMarcat {
    private AbstractAngajat angajatResponsabil = null;
    private List<String> produse = new ArrayList<>();
    private boolean esteDeschisa = false;
    private int idCasa;

    // Multiton: Doua instante statice pentru cele doua case
    private static CasaMarcat instanta1 = null;
    private static CasaMarcat instanta2 = null;

    private CasaMarcat(int id) { this.idCasa = id; }

    // Metoda Thread-Safe pentru obtinerea instantei
    public static synchronized CasaMarcat getInstanta(int nr) {
        if (nr == 1) {
            if (instanta1 == null) instanta1 = new CasaMarcat(1);
            return instanta1;
        } else {
            if (instanta2 == null) instanta2 = new CasaMarcat(2);
            return instanta2;
        }
    }


    @Override
    public void deschideComanda(AbstractAngajat angajat) {
        if (!esteDeschisa) {
            this.angajatResponsabil = angajat;
            this.esteDeschisa = true;
            this.produse.clear();
            System.out.println("Casa " + idCasa + ": Deschisa de " + angajat.getNume());
        }
    }

    @Override
    public void adaugaProdus(String denumireProdus) {
        if (esteDeschisa) {
            produse.add(denumireProdus);
            System.out.println("Casa " + idCasa + ": Adaugat produs " + denumireProdus);
        }
    }

    @Override
    public void inchideComanda(AbstractAngajat angajat) {
        // Verificare: doar angajatul care a deschis-o o poate inchide
        if (esteDeschisa && angajatResponsabil.getNume().equals(angajat.getNume())) {
            this.esteDeschisa = false;
            this.angajatResponsabil = null;
            System.out.println("Casa " + idCasa + ": Comanda inchisa.");
        } else {
            System.out.println("Casa " + idCasa +": Actiune refuzata pentru " + angajat.getNume());
        }
    }


    @Override
    public void showInfoComanda() {
        System.out.println("Casa " + idCasa + " - Produse: " + produse);
    }
}
