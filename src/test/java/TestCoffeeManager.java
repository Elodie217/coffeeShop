import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.CoffeeManager;

public class TestCoffeeManager {

    @Test // Tag fourni par JUnit
    public void testSingletonSingleInstance() { // Le nom de la fonction doit être suffisant pour comprendre ce qui est testé
        // Crée deux appels à la méthode getInstance()
        CoffeeManager instance1 = CoffeeManager.getInstance();
        CoffeeManager instance2 = CoffeeManager.getInstance();

        // Vérifie que les deux instances sont identiques (références du même objet dans le heap)
        assertSame(instance1, instance2, "Les deux instances doivent être identiques (Singleton)");
        // assertSame(...) est une fonction de la librairie JUnit
    }

    @Test
    public void testSingletonNotNull() {
        // J'ai choisi de tester cela également car il faut que notre getInstance ne renvoie jamais 'null'
        CoffeeManager instance = CoffeeManager.getInstance();
        assertNotNull(instance, "L'instance ne doit pas être nulle");
    }
}