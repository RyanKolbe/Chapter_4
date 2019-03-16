package com.ryankolbe.Question_3.DependencyInversionPrinciple.ObeyPrinciple;

public class IceCreamShop {
    public String flavour;

    public IceCreamShop(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "flavour='" + flavour + '\'' +
                '}';
    }
}
