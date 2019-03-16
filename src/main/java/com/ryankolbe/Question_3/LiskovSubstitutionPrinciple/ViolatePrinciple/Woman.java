package com.ryankolbe.Question_3.LiskovSubstitutionPrinciple.ViolatePrinciple;

public class Woman extends Human {
    private String breasts;

    public Woman(String name, String surname, int age, String breasts) {
        super(name, surname, age);
        this.breasts = breasts;
    }

    public String getBreasts() {
        return breasts;
    }

    public void setBreasts(String breasts) {
        this.breasts = breasts;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "breasts='" + breasts + '\'' +
                '}';
    }
}
