package Singleton.EagerInitialization;

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private int ct;

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
