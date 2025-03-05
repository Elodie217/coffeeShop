package org.example;

public class CoffeeWithChocolate implements Coffee {

    private Coffee baseCoffee;

    public CoffeeWithChocolate(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    @Override
    public String name() {
        return baseCoffee.name() + " avec du chocolat";
    }

    @Override
    public String prepare() {
        return baseCoffee.prepare() + " avec du chocolat";
    }

    @Override
    public double cost(){
        return baseCoffee.cost() + 0.5;
    }

    @Override
    public String condiments() {
        return baseCoffee.condiments() + "Chocolat ";
    }
}
