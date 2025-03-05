package org.example;

import java.util.Scanner;

public class ViewNotif implements Observer{

    @Override
    public CoffeeAction update(String notif, String name) {

        System.out.print( notif + " ..." + "\n" );
        System.out.print( "Votre commande est prête : " + name + "\n" );


        return CoffeeAction.EXIT;
    }
}
