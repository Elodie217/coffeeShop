package org.example;

public class Latte implements Coffee {

    public String name() {
        return "Café au lait";
    }

    public String prepare() {
        return "Préparation d'un Café au lait";
    }

    public double cost() {
        return 5;
    }

    public String condiments() {
        return "";
    }
}
