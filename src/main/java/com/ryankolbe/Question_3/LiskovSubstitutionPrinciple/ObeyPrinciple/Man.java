package com.ryankolbe.Question_3.LiskovSubstitutionPrinciple.ObeyPrinciple;

public class Man extends Human {
    private String penis;

    public Man(String name, String surname, int age, String penis) {
        super(name, surname, age);
        this.penis = penis;
    }

    public String getPenis() {
        return penis;
    }

    public void setPenis(String penis) {
        this.penis = penis;
    }

    @Override
    public String toString() {
        return "Man{" +
                "penis='" + penis + '\'' +
                '}';
    }
}