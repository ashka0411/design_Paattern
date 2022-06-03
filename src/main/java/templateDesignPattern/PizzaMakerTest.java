package templateDesignPattern;

import org.junit.jupiter.api.Test;

public class PizzaMakerTest {
    @Test
    public void testMakePizza() throws Exception {
        System.out.println("-----Making Veg Pizza-----");
        Pizzamaker vegPizzaMaker = new VegPizzaMaker();
        vegPizzaMaker.makePizza();
        System.out.println("-----Making Non Veg Pizza-----");
        Pizzamaker nonVegPizzaMaker = new NonVegPizzaMaker();
        nonVegPizzaMaker.makePizza();
        System.out.println("-----Making In-House Assorted Pizza-----");
        Pizzamaker inHouseAssortedPizzaMaker = new InHouseAssortedPizzaMaker();
        inHouseAssortedPizzaMaker.makePizza();
    }
}
