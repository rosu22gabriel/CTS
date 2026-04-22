package C05.Factory.AbstractFactory.Program;

import C05.Factory.AbstractFactory.Implementare.AbstractBautura;
import C05.Factory.AbstractFactory.Implementare.AbstractFelPrincipal;
import C05.Factory.AbstractFactory.Implementare.RestaurantFactory;
import C05.Factory.AbstractFactory.Implementare.RestaurantItalianFactory;

public class Program {
    public static void plasareComanda(RestaurantFactory restaurant) {
        AbstractFelPrincipal felPrincipal = restaurant.getFelPrincipal();
        AbstractBautura bautura = restaurant.getBautura();
        System.out.println(felPrincipal.getDescriere());
        bautura.afisareDescriere();
    }

    public static void main(String[] args) {
        plasareComanda(new RestaurantItalianFactory());
    }
}
