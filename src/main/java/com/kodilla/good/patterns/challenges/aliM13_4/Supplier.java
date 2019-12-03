
package com.kodilla.good.patterns.challenges.aliM13_4;

public class Supplier implements  ProductOrderingProc{
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean process(Supplier supp,Item item){
        System.out.println("zamowienie dla sklepu: " + name + " udalo sie zrealizowac ");
        return true;
    }
}
