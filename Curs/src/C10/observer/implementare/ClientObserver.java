package C10.observer.implementare;

public class ClientObserver implements IObserver{
    private String nume;

    public ClientObserver(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit mesajul: " + mesaj);
    }
}
