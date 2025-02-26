import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.Test;


public class TestPaymentStrategy {
    Payment Payment = new Payment();

    @Test
    public void testPaymentCB() {

        Payment.setPaymentStrategy(new CB());
        String result = Payment.executePaymentStrategy(10);

        assertEquals(result, "Payement effectué en carte bancaire pour un montant de 10 €.", "La phrase de retour doit être identique");

    }

    @Test
    public void testPaymentPayPal() {

        Payment.setPaymentStrategy(new PayPal());
        String result = Payment.executePaymentStrategy(20);

        assertEquals(result, "Payement effectué via PayPal pour un montant de 20 €.", "La phrase de retour doit être identique");

    }

}
