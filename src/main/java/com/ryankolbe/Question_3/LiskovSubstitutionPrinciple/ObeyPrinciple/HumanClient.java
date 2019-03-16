package com.ryankolbe.Question_3.LiskovSubstitutionPrinciple.ObeyPrinciple;

public class HumanClient {

    public static void main(String[] args) {
        Human man = new Man("John", "Doe", 30, "Average");
        Human woman = new Woman("Jane", "Doe", 28, "Average");

        Man man2 = new Man("David", "Doe", 32, "Large");
        Woman woman2 = new Woman("Diane", "Doe", 26, "Large");
    }
}
