package org.example;

public interface Observer {
    CoffeeAction update(String notif, String name);
}