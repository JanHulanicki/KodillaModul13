package com.kodilla.good.patterns.challenges.aliM13_4;

public class ProductOrderApp {
    public static void main(String[] args){
        ProductOrderRetriever productOrderRequestRetriever= new  ProductOrderRetriever();
        ProductOrderRequest productOrderRequest=productOrderRequestRetriever.retrieve();
        ProductOrderProcessor productOrderProcessor=new ProductOrderProcessor(productOrderRequest.getSupplier());
        productOrderProcessor.getProductOrderingProc().process(productOrderRequest.getSupplier(),productOrderRequest.getItem());
    }
}
