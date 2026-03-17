package implementare.angajati;

public interface  Angajat {
    public double calculSalariu();
    default String getCOR() {
        return null;
    }
}
