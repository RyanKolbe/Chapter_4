package com.ryankolbe.Question_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aeroplane_Client {

    public static void main(String[] args) {
        List<Aeroplane> aeroplaneArrayList = new ArrayList<>();

        aeroplaneArrayList.add(new Aeroplane("Jet", "Firefox", 4, true,
                true, "Jet engine", 2, 1500));

        aeroplaneArrayList.add(new Aeroplane("Propeller", "Twin Spin", 3, true,
                true, "Propeller engine", 1, 750));

        for (Aeroplane aeroplane : aeroplaneArrayList) {
            JOptionPane.showMessageDialog(null, "The aeroplane's details is as follows: ");
            JOptionPane.showMessageDialog(null, aeroplane.toString());

            JOptionPane.showMessageDialog(null, "The engines fuel capacity in litres in order to refuel is: ");
            JOptionPane.showMessageDialog(null, aeroplane.refuelVehicle() + " Litres");
        }
    }
}
