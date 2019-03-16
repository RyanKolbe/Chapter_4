package com.ryankolbe.Question_3.DependencyInversionPrinciple.ViolatePrinciple;

public class IceCreamShop {
    public String serveIceCream;

    public IceCreamShop() {

    }

    public IceCreamShop(String serveIceCream) {
        this.serveIceCream = serveIceCream;
    }

    public String getServeIceCream() {
        return serveIceCream;
    }

    public void setServeIceCream(String serveIceCream) {
        this.serveIceCream = serveIceCream;
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "serveIceCream='" + serveIceCream + '\'' +
                '}';
    }
}
