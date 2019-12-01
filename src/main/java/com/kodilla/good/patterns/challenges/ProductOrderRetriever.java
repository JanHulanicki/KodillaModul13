package com.kodilla.good.patterns.challenges;

public class ProductOrderRetriever {
    public ProductOrderRequest retrieve(){
        User user = new User("John","Smith");
        Item item = new Item ("Kapcie");
        return new ProductOrderRequest(user,item);
    }
}
