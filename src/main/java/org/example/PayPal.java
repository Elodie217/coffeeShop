package org.example;

public class PayPal implements PaymentStrategy{

    public String pay(double price) {
        return "Payement effectué via PayPal pour un montant de " + price + " €.";
    }
}
