package com.pluralsight;

public class Atm {
    public static void main(String[] args) {
        int fifty = 50;
        int twenty = 20;
        int ten = 10;
        int five = 5;
        int one = 1;
        System.out.println("Welcome to the ATM");
        int amount = 387;
        System.out.println("You are withdrawing $" + amount);

        int numFifty = amount / fifty;
        amount %= fifty;
        int numTwenty = amount / twenty;
        amount %= twenty;
        int numTen = amount / ten;
        amount %= ten;
        int numFive = amount / five;
        amount %= five;
        int numOne = amount;
        printCash(numFifty, String.valueOf(fifty));
        printCash(numTwenty, String.valueOf(twenty));
        printCash(numTen, String.valueOf(ten));
        printCash(numFive, String.valueOf(five));
        printCash(numOne, String.valueOf(one));
    }

    public static void printCash(int num, String cashType) {
        if (num == 1) {
            System.out.println("Withdrew " + num + " " + cashType + " euro bill");
        } else {
            System.out.println("Withdrew " + num + " " + cashType + " euro bills");
        }
    }
}
