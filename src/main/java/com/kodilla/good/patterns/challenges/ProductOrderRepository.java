package com.kodilla.good.patterns.challenges;
public class ProductOrderRepository implements ProductOrderingRepository {
    public   boolean createOrdering(User user,Item item){
        System.out.println("Zapisano zamowienie");
        return true;
    }
}
