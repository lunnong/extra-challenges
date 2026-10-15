package com.pluralsight;

import java.util.Scanner;
import static com.pluralsight.Utils.promptInt;

public class MovieMarathon {
    public static void main(String[] args) {

        // imported promptInt is not relevant to the puzzle
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This is a Movie Marathon Calculator");
        int movieOneMinutes = promptInt(myScanner, "Movie 1's Length");
        int movieTwoMinutes = promptInt(myScanner, "Movie 2's Length");
        int movieThreeMinutes = promptInt(myScanner, "Movie 3's Length");

        // Relevant to exercise
        int totalMinutes = movieOneMinutes + movieTwoMinutes + movieThreeMinutes;
        int hoursQuestionTwo = totalMinutes / 60;
        int minutesQuestionTwo  = totalMinutes % 60;
        System.out.println("After watching three movies lasting " + movieOneMinutes + " minutes, " + movieTwoMinutes + " minutes, and " + movieThreeMinutes +
                " minutes, I will be watching movies for " + hoursQuestionTwo + " hours and " +  minutesQuestionTwo + " minutes.");

        // imported promptInt is not relevant to the puzzle
        int currentHour = promptInt(myScanner, "the current hour");
        int currentMinute = promptInt(myScanner, "the current minute");
        System.out.println("The current time is " + currentHour + ":" + currentMinute);

        // Relevant to exercise
        currentMinute = currentMinute + minutesQuestionTwo;
        hoursQuestionTwo += (currentMinute / 60);
        currentMinute = currentMinute % 60;
        currentHour  = (currentHour + hoursQuestionTwo) % 24;
        System.out.println("After the movie marathon, the time will be " + currentHour + ":" + currentMinute);
    }
}
