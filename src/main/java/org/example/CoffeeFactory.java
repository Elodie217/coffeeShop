package org.example;

public class CoffeeFactory {

    public Coffee createCoffee(String type){

         if (type.equals("Espresso") ){
             return new Espresso();
         } else if (type.equals("Latte") ){
             return new Latte();
         } else {
             throw new IllegalArgumentException("Type de café inconnu : " + type);
         }
    }

}
