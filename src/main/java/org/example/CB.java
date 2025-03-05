package org.example;

public class CB implements PaymentStrategy{

    public String pay(double price) {
        return "Payement effectué en carte bancaire pour un montant de " + price + " €.";
    }
}
