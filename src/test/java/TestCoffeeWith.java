import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCoffeeWith {
    CoffeeFactory CoffeeFactory = new CoffeeFactory();

    @Test
    public void testCoffeeWithSugar() {

        Coffee Coffee = CoffeeFactory.createCoffee("Espresso");

        CoffeeWithSugar CoffeeWithSugar = new CoffeeWithSugar(Coffee);

        String resultCoffee = CoffeeWithSugar.prepare();


        assertEquals(resultCoffee, "Préparation d'un Espresso avec du sucre", "La phrase de retour doit être identique");

    }


    @Test
    public void testCoffeeWithChocolate() {

        Coffee Coffee = CoffeeFactory.createCoffee("Espresso");

        CoffeeWithChocolate CoffeeWithChocolate = new CoffeeWithChocolate(Coffee);

        String resultCoffee = CoffeeWithChocolate.prepare();


        assertEquals(resultCoffee, "Préparation d'un Espresso avec du chocolat", "La phrase de retour doit être identique");

    }
}
