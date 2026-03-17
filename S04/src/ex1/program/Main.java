package ex1.program;

import ex1.implementare.Masa;
import ex1.implementare.Ospatar;
import ex1.implementare.Restaurant;

public class Main {
    public static void main(String[] args) {
        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");

        Restaurant restaurant = Restaurant.getInstance();

        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));
        restaurant.addMasa(new Masa(5));

        // restaurant.addAll(10);

        restaurant.afisareMese();

        ospatar1.preluareComanda("Pizza, cola", 2);
        ospatar1.preluareComanda("Pizza, cola", 1);
        ospatar1.preluareComanda("Pizza, cola", 4);
        ospatar1.preluareComanda("Pizza, cola", 3);
        ospatar1.afisareSituatieMese();
        ospatar2.afisareSituatieMese();
    }
}
