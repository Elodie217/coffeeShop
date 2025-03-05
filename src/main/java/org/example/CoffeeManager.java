package org.example;
import org.example.CoffeeFactory;

import java.util.ArrayList;
import java.util.List;


public class CoffeeManager {

    private static CoffeeManager instance;
    final private ViewCoffee view = new ViewCoffee();
    private List<Observer> observers = new ArrayList<>();

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

    public void run(){

        CoffeeAction choice;
        Coffee coffee = null;
        CoffeeFactory CoffeeFactory = new CoffeeFactory();

        choice = view.showMainMenu();
        switch (choice) {
            case CoffeeAction.PREPARE_ESPRESSO:
                coffee = CoffeeFactory.createCoffee("Espresso");
                break;
            case CoffeeAction.PREPARE_LATTE:
                coffee = CoffeeFactory.createCoffee("Latte");
                break;
            default:
                break;
        }


        if (choice != CoffeeAction.EXIT) {

            String coffeePrepare;
            CoffeeAction choiceSupplement;

            do {
                choiceSupplement = view.showMenuSupplement();
                switch (choiceSupplement) {
                    case CoffeeAction.ADD_CHOCOLAT:
                        coffee = new CoffeeWithChocolate(coffee);

                        break;
                    case CoffeeAction.ADD_SUGAR:
                        coffee = new CoffeeWithSugar(coffee);

                        break;
                }

            } while (choiceSupplement != CoffeeAction.EXIT_SUPPLEMENT);




            String payementCoffee = "";
            CoffeeAction choicePayement = CoffeeAction.EXIT;
            Payment Payment = new Payment();

            do {
                choicePayement = view.showMenuPayement();
                switch (choicePayement) {
                    case CoffeeAction.CB:
                        Payment.setPaymentStrategy(new CB());
                        payementCoffee = Payment.executePaymentStrategy(coffee.cost());
                        break;
                    case CoffeeAction.PAYPAL:
                        Payment.setPaymentStrategy(new PayPal());
                        payementCoffee = Payment.executePaymentStrategy(coffee.cost());
                        break;
                    case CoffeeAction.VIREMENT:
                        Payment.setPaymentStrategy(new Virement());
                        payementCoffee = Payment.executePaymentStrategy(coffee.cost());
                        break;
                }

            } while (choicePayement == CoffeeAction.EXIT);


            CoffeeAction validerCommande = view.showRecap(coffee);

            if (validerCommande == CoffeeAction.VALIDER){

                view.showPayement(payementCoffee);

                notifyObservers(coffee.prepare(), coffee.name());
            }

        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String notif, String name) {
        for (Observer observer : observers) {
            observer.update(notif, name);
        }
    }
}
