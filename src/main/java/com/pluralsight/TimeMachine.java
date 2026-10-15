package com.pluralsight;

import java.util.Scanner;
import static com.pluralsight.Utils.promptInt;

public class TimeMachine {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int hours = promptInt(myScanner, "the current hour");
        int minutes = promptInt(myScanner, "the current minute");
        System.out.println("The current time is " + hours + ":" + minutes);

        int minutesToAdd = promptInt(myScanner, "minutes to add");
        minutes = minutes + minutesToAdd;
        int hoursToAdd = minutes / 60;
        minutes = minutes % 60;
        hours = hours + hoursToAdd;
        hours = hours % 24;
        System.out.println("After " + minutesToAdd + " minutes, it is now " + hours + ":" + minutes);
    }
}
