package C05.Factory.FactoryMethod.Program;

import C05.Factory.FactoryMethod.Implementare.FactoryPizzaVegetariana;
import C05.Factory.FactoryMethod.Implementare.IFactory;
import C05.Factory.FactoryMethod.Implementare.IPizza;

public class Program {
    public static void main(String[] args){
        IFactory factory = null;
        factory = new FactoryPizzaVegetariana();

        IPizza pizza = null;
        pizza = factory.crearePizza("Raw");
        pizza.afisareDescriere();
    }
}
