package org.example;

public class Virement implements PaymentStrategy{

    public String pay(double price) {
        return "Payement effectué via Virement pour un montant de " + price + " €.";
    }
}
