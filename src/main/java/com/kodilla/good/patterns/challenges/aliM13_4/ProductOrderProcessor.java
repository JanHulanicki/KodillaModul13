package com.kodilla.good.patterns.challenges.aliM13_4;

public class ProductOrderProcessor {
    private ProductOrderingProc productOrderingProc;

    public ProductOrderProcessor(ProductOrderingProc productOrderingProc) {
        this.productOrderingProc = productOrderingProc;
    }

    public ProductOrderingProc getProductOrderingProc() {
        return productOrderingProc;
    }
}
