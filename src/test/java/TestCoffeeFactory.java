import static org.junit.jupiter.api.Assertions.*;

import org.example.Coffee;
import org.example.CoffeeFactory;
import org.example.Espresso;
import org.example.Latte;
import org.junit.jupiter.api.Test;

public class TestCoffeeFactory {

    CoffeeFactory CoffeeFactory = new CoffeeFactory();

    @Test
    public void testCreateEspresso() {

        Coffee instance = CoffeeFactory.createCoffee("Espresso");
        assertTrue(instance instanceof Espresso, "Un espresso doit être créer");

    }


    @Test
    public void testCreateLatte() {
        Coffee instance = CoffeeFactory.createCoffee("Latte");
        assertTrue(instance instanceof Latte, "Un Café au lait doit être créer");

    }
}
