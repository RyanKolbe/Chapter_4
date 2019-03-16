package com.ryankolbe.Question_3.DependencyInversionPrinciple.ViolatePrinciple;

public class Gelato extends IceCreamShop {
    private String gelato;

    public Gelato(String gelato) {
        this.gelato = gelato;
    }

    public Gelato(String serveIceCream, String gelato) {
        super(serveIceCream);
        this.gelato = gelato;
    }

    public String getGelato() {
        return gelato;
    }

    public void setGelato(String gelato) {
        this.gelato = gelato;
    }

    @Override
    public String toString() {
        return "Gelato{" +
                "serveIceCream='" + serveIceCream + '\'' +
                '}';
    }
}
