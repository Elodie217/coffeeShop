package org.example;

public class Espresso implements Coffee {

    public String name() {
        return "Espresso";
    }

    public String prepare() {
        return "Préparation d'un Espresso";
    }

    public double cost() {
        return 4;
    }

    public String condiments() {
        return "";
    }
}
