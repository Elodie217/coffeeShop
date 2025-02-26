package org.example;

import java.util.Scanner;

public class ViewCoffee {

    public void showMainMenu() {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Bienvenue dans le simulateur de commandes de café !" + "\n" );
        System.out.print( "Que souhaitez-vous faire ?" + "\n" );
        System.out.print( "1. Passer une commande" + "\n" );
        System.out.print( "2. Quitter" + "\n" );

        String choice = scanner.nextLine();

        if ("1".equals(choice)){
        } else {
        }


    }
}
