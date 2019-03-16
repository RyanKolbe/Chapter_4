package com.ryankolbe.Question_3.DependencyInversionPrinciple.ViolatePrinciple;

public class Softserve extends IceCreamShop{
    private String softServe;
    public Softserve(String serveIceCream, String gelato, String softServe) {
        super(serveIceCream);
        this.softServe = softServe;
    }

    public String getSoftServe() {
        return softServe;
    }

    public void setSoftServe(String softServe) {
        this.softServe = softServe;
    }

    @Override
    public String toString() {
        return "Softserve{" +
                "serveIceCream='" + serveIceCream + '\'' +
                '}';
    }
}
