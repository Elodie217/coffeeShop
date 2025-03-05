package org.example;

public class Payment {

    private PaymentStrategy PaymentStrategy;


    public void setPaymentStrategy(PaymentStrategy PaymentStrategy ){

        this.PaymentStrategy  = PaymentStrategy;
    }

    public String executePaymentStrategy(double price) {
        return PaymentStrategy.pay(price);

    }

}
