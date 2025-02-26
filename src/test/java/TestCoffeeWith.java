import org.example.CB;
import org.example.CoffeeFactory;
import org.example.PayPal;
import org.example.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCoffeeWith {
    CoffeeFactory CoffeeFactory = new CoffeeFactory();

    @Test
    public void testCoffeeWithSugar() {

        CoffeeWithSugar = CoffeeWithSugar naw CoffeeWithSugar;

        Coffee Coffee = CoffeeFactory.createCoffee("Espresso");
        String result = CoffeeFactory.executePaymentStrategy(Coffee);


        assertEquals(result, "Payement effectué en carte bancaire pour un montant de 10 €.", "La phrase de retour doit être identique");

    }

//    @Test
//    public void testPaymentPayPal() {
//
//        Payment.setPaymentStrategy(new PayPal());
//        String result = Payment.executePaymentStrategy(20);
//
//        assertEquals(result, "Payement effectué via PayPal pour un montant de 20 €.", "La phrase de retour doit être identique");
//
//    }

}
