package com.kodilla.good.patterns.challenges.aliM13_4;



public class ProductOrderRetriever {
    public ProductOrderRequest retrieve() {
        Item item1 = new Item("Duch Puszczy");
        Supplier supplier1 = new Supplier("ExtraFoodShop");
        return new ProductOrderRequest(supplier1, item1, 10);
    }
}
