package com.kodilla.good.patterns.challenges;

public class ProductOrderApp {
    public static void main(String[] args){
        ProductOrderRetriever productOrderRequestRetriever= new  ProductOrderRetriever();
        ProductOrderRequest productOrderRequest=productOrderRequestRetriever.retrieve();
        ProductOrderProcessor productOrderProcessor=new ProductOrderProcessor(new MailService(),new ProductOrderServiece(),new ProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
