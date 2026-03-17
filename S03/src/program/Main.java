package program;

import implementare.angajati.Lucrator;
import implementare.angajati.Manager;
import implementare.companie.Companie;

public class Main {
    public static void main(String[] args) {
        Companie companie = new Companie("SRL_SRL");
        companie.addAngajat(new Lucrator("Gigel", 80, 11, "2222"));
        companie.addAngajat(new Lucrator("Costel", 100, 11, "1119"));
        companie.addAngajat(new Lucrator("Viorel", 66, 22, "4567"));
        companie.addAngajat(new Manager("Sonia", 100.00, "1111"));
        System.out.println("Salariul total: " + companie.calculFondTotalSalarii());
        companie.afisareDetaliiCompanie();
    }
}
