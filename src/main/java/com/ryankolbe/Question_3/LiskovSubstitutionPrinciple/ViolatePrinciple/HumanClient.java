package com.ryankolbe.Question_3.LiskovSubstitutionPrinciple.ViolatePrinciple;

public class HumanClient {

    public static void main(String[] args) {


        /*
         * Program casted to Man and Woman respectively to ensure program runs.
         * Intended violation in comments below.
         * Man man = new Human("John","Doe",35);
         * Woman woman = new Human("Jane","Doe",28);
         */

        Man man = (Man) new Human("John", "Doe", 35);
        Woman woman = (Woman) new Human("Jane", "Doe", 28);
    }
}
