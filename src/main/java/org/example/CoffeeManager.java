package org.example;

public class CoffeeManager {

    private static CoffeeManager instance;

    // Constructeur
    private CoffeeManager() {}

    public static CoffeeManager getInstance(){
        // Si l'instance n'est pas créer alors je la créer
        if (CoffeeManager.instance == null){
            CoffeeManager.instance = new CoffeeManager();
        }

        // Je retourne l'instance
        return CoffeeManager.instance;
    }
}
