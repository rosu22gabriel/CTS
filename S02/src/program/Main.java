import implementare.angajati.Lucrator;
import implementare.companie.Companie;
import implementare.taxare.Taxe;

void main() {
    Companie companie = new Companie("SRL_SRL");
    companie.addAngajati(new Lucrator("Costel", 100, 12));
    companie.addAngajati(new Lucrator("Gigel", 80, 11 ));
    companie.addAngajati(new Lucrator("Viorel", 66, 22));
    System.out.println("Salariul total: " + companie.calculFondTotalSalarii());
}