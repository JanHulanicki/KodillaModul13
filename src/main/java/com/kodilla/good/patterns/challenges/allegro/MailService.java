package com.kodilla.good.patterns.challenges.allegro;

class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Wyslano mail z potwierdzeniem zamowienia");
    }
}
