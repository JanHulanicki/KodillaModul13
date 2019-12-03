package com.kodilla.good.patterns.challenges.aliM13_4;



public class ProductOrderRequest {
    private Supplier supplier;
    private Item item;
    private int quantity;

    public ProductOrderRequest(Supplier supplier, Item item, int quantity) {
        this.supplier = supplier;
        this.item = item;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
