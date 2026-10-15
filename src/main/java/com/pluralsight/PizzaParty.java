package com.pluralsight;

import java.util.Scanner;
import static com.pluralsight.Utils.promptInt;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int people = promptInt(myScanner, "the number of people");
        int slicesPerPerson = promptInt(myScanner, "how many slices each person wants");
        int slicesPerPizza = promptInt(myScanner, "how many slices per pizza");

        int totalSlices = people * slicesPerPerson;
        // totalSlices + (slicesPerPizza - 1) rounds up to the nearest pizza,
        //      but doesn't add an extra pizza if at a round pizza count
        int pizzas = (totalSlices + slicesPerPizza - 1) / slicesPerPizza;
        int leftoverSlices = pizzas * slicesPerPizza - totalSlices;

        System.out.println("Total slices needed: " + totalSlices);
        System.out.println("Pizzas to order: " + pizzas);
        System.out.println("Slices left over: " + leftoverSlices);
    }
}
