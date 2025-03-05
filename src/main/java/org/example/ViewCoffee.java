package org.example;

import java.util.Scanner;

public class ViewCoffee {

    public CoffeeAction showMainMenu() {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Bienvenue dans le simulateur de commandes de café !" + "\n" );
        System.out.print( "Que souhaitez-vous faire ?" + "\n" );
        System.out.print( "1. Passer une commande" + "\n" );
        System.out.print( "2. Quitter" + "\n" );

        String choice = scanner.nextLine();

        if ("1".equals(choice)){

            System.out.print( "Quel type de café souhaitez-vous ?" + "\n" );
            System.out.print( "1. Espresso" + "\n" );
            System.out.print( "2. Café au lait" + "\n" );

            String choiceCoffee = scanner.nextLine();

            if ("1".equals(choiceCoffee)) {
                return CoffeeAction.PREPARE_ESPRESSO;
            } else if ("2".equals(choiceCoffee)){
                return CoffeeAction.PREPARE_LATTE;
            }

        }

        return CoffeeAction.EXIT;

    }


    public CoffeeAction showMenuSupplement() {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Souhaitez-vous ajouter des condiments ?" + "\n" );
        System.out.print( "1. Ajouter du chocolat (+0,5€)" + "\n" );
        System.out.print( "2. Ajouter du sucre (+0,2€)" + "\n" );
        System.out.print( "3. Ne pas (ou plus) ajouter de condiments" + "\n" );

        String choice = scanner.nextLine();

        if ("1".equals(choice)){
            return CoffeeAction.ADD_CHOCOLAT;
        } else if ("2".equals(choice)){
            return CoffeeAction.ADD_SUGAR;

        } else {
            return CoffeeAction.EXIT_SUPPLEMENT;

        }

    }

    public CoffeeAction showMenuPayement() {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Comment souhaitez-vous payer ?" + "\n" );
        System.out.print( "1. Carte bancaire" + "\n" );
        System.out.print( "2. PayPal" + "\n" );
        System.out.print( "3. Virement bancaire" + "\n" );

        String choice = scanner.nextLine();

        if ("1".equals(choice)){
            return CoffeeAction.CB;
        } else if ("2".equals(choice)){
            return CoffeeAction.PAYPAL;
        } else if ("3".equals(choice)){
            return CoffeeAction.VIREMENT;
        }

        return CoffeeAction.EXIT;
    }


    public CoffeeAction showRecap(Coffee coffee) {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Voici le récapitulatif de votre commande :" + "\n" );
        System.out.print( "Café : " + coffee.name() + "\n" );
        System.out.print( "Condiments : " + coffee.condiments() + "\n" );
        System.out.print( "Montant total : " + coffee.cost() + " €" + "\n\n" );
        System.out.print( "Confirmez-vous votre commande ?" + "\n" );
        System.out.print( "Oui" + "\n" );
        System.out.print( "Non" + "\n" );

        String choice = scanner.nextLine();

        if ("Oui".equals(choice)){
            return CoffeeAction.VALIDER;
        }

        return CoffeeAction.EXIT;
    }

    public CoffeeAction showPayement(String payement) {

        System.out.print( payement + "\n" );

        return CoffeeAction.EXIT;
    }
}
