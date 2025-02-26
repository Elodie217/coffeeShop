package org.example;

public class PayPal implements PaymentStrategy{

    public String pay(int price) {
        return "Payement effectué via PayPal pour un montant de " + price + " €.";
    }
}
