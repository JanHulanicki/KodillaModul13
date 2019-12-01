package com.kodilla.good.patterns.challenges;
public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderingService productOrderingService;
    private ProductOrderingRepository productOrderingRepository;
    public ProductOrderProcessor(InformationService informationService, ProductOrderingService productOrderingService, ProductOrderingRepository productOrderingRepository) {
        this.informationService = informationService;
        this.productOrderingService = productOrderingService;
        this.productOrderingRepository = productOrderingRepository;
    }
    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderingService.createProductOrdering(productOrderRequest.getUser(), productOrderRequest.getItem());
        if(isSold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderingRepository.createOrdering(productOrderRequest.getUser(), productOrderRequest.getItem());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
