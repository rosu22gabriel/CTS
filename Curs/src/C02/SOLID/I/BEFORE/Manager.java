package C02.SOLID.I.BEFORE;

import java.util.List;

public class Manager implements Angajat {
    private String nume;
    private List<Angajat> listaSubordonati;

    @Override
    public void lucreaza() {
        System.out.println("Managerul " + nume + " lucreaza!");
    }

    @Override
    public void concediu() {
        System.out.println("Managerul" + nume + " este in concediu");
    }

    @Override
    public void gestioneazaSubAngajati() {

    }

    @Override
    public void acordaConcediu(Angajat a){
        for (Angajat ang : listaSubordonati) {
            if (ang == a) {
                ang.concediu();
            }
        }
    }
}
