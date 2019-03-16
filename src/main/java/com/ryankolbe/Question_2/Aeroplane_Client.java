package com.ryankolbe.Question_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Aeroplane_Client {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfig.class);
        InterfaceImplementation interfaceImplementation = (InterfaceImplementation) applicationContext.getBean("Refuel");

        int numberOfEngines = Integer.valueOf(JOptionPane.showInputDialog(null, "Please enter number of engines? "));
        int engineCapacity = Integer.valueOf(JOptionPane.showInputDialog(null, "Please enter engine capacity in litres? "));
        JOptionPane.showMessageDialog(null, interfaceImplementation.refuelVehicle(numberOfEngines, engineCapacity)
                + " Litres.", "Engine Capacity in Litres", JOptionPane.PLAIN_MESSAGE);
    }
}
