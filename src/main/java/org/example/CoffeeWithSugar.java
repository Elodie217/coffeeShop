package org.example;

public class CoffeeWithSugar {

    private Coffee baseCoffee;

    private CoffeeWithSugar(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    public String prepare(){
        return this.baseCoffee + " avec du sucre";
    }

    public int prepare(int price){
        return price + 2;
    }

}
