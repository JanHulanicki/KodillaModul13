package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderServiece implements ProductOrderingService {
    public boolean createProductOrdering(User user, Item item){
        System.out.println("Utworzono zamowienie");
        return true;
    }
}
