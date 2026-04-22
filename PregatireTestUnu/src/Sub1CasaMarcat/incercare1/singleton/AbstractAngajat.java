package Sub1CasaMarcat.incercare1.singleton;

public interface AbstractAngajat {
    String getNume();
}

interface AbstractCasaMarcat {
    void deschideComanda(AbstractAngajat angajat);
    void inchideComanda(AbstractAngajat angajat);
    void adaugaProdus(String denumireProdus);
    void showInfoComanda();
}

