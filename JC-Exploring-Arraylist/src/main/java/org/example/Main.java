package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Exercise 6: Clearing the List (clear)
        ArrayList<String> intel = new ArrayList<>();
        intel.add("Enemy position: Sector 4");
        intel.add("Weakness: Power generator");

        System.out.println("Intel count before mission: " + intel.size());
        System.out.println("Intel list: " + intel);

        intel.clear();

        System.out.println("\nIntel count after mission: " + intel.size());
        System.out.println("Is the intel list empty now? " + intel.isEmpty());
        System.out.println("Intel list: " + intel);
        
        //Prediction:
        /*
        * Intel count before mission: 2
        * Intel list: [Enemy position: Sector 4, Weakness: Power generator]
        *
        * Intel count after mission: 0
        * Is the intel list empty now? true
        * Intel list: []
         * */
        //Actual:

    }
}