package ex3.Implementare.builder;

// Orice restrictie arunca o exceptie custom
public class RestrictedShoeException extends Exception {
    public RestrictedShoeException(String mesaj) {
        super(mesaj);
    }
}
