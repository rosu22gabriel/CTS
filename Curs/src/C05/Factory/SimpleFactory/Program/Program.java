package C05.Factory.SimpleFactory.Program;

import C05.Factory.SimpleFactory.Implementare.ETipPizza;
import C05.Factory.SimpleFactory.Implementare.IPizza;
import C05.Factory.SimpleFactory.Implementare.PizzaFactory;
import C05.Factory.SimpleFactory.Implementare.PizzaRoma;

public class Program {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        IPizza pizza = null;
        try {
            pizza = pizzaFactory.crearePizza(ETipPizza.ROMA);
            ((PizzaRoma)pizza).setCarne("pui");
            System.out.println(pizza.toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }

        pizza.afisareDescriere();
    }
}
