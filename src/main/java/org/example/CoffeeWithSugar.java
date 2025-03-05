package org.example;

public class CoffeeWithSugar implements Coffee {

    private Coffee baseCoffee;

    public CoffeeWithSugar(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    @Override
    public String name() {
        return baseCoffee.name() + " avec du sucre";
    }

    @Override
    public String prepare() {
        return baseCoffee.prepare() + " avec du sucre";
    }

    public double cost(){
        return baseCoffee.cost() + 0.2;
    }

    @Override
    public String condiments() {
        return baseCoffee.condiments() + "Sucre ";
    }

}
