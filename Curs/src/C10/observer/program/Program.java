package C10.observer.program;

import C10.observer.implementare.ClientObserver;
import C10.observer.implementare.Restaurant;

public class Program {
    public static void main(String[] args) {
        ClientObserver client1 = new ClientObserver("Florin");
        ClientObserver client2 = new ClientObserver("Florinel");
        ClientObserver client3 = new ClientObserver("Floricica");

        Restaurant restaurant = new Restaurant("Pizzeria ASE");
        restaurant.addObserver(client1);
        restaurant.addObserver(client2);
        restaurant.addObserver(client3);

        System.out.println("===== Adaugare produs nou in meniu =====");
        restaurant.addMeniu("Pizza vegetariana. 23 lei");
        restaurant.removeObserver(client1);
        System.out.println("\n===== Reducere pret produs din meniu =====");
        restaurant.reducerePretMeniu("Pizza vegetariana", 20);
    }
}
