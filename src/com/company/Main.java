package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        // sout gives you System.out.println();
        System.out.println("Min integer is: " + Integer.MIN_VALUE);
        System.out.println("Max Integer is: " + Integer.MAX_VALUE);

        System.out.println("\nRandom Numbers");

        // fori
        for (int i = 0; i < 7; i++) {
            System.out.println("Random number " + rand.nextInt());
            System.out.println("Random number " + rand.nextInt(5));
        }

        System.out.println("\nRandom Doubles");
        // While Loop
        int i = 0;
        while (i < 7) {
            System.out.println("Random number " + rand.nextDouble());
            i++;
        }

        // do While Loop
        System.out.println(("\nRandom Integers until 0"));
        int myTest; // block scope. Do while loop always executes AT LEAST once, unlike whiles.
        do {
            myTest = rand.nextInt(7);
            System.out.println("Number " + myTest);
        } while (myTest != 0);

        // Conditions
        System.out.println("\nRandom Even Numbers");
        for (int j = 0; j < 10; j++) {
            int myTester = rand.nextInt(10);
            System.out.println("Testing " + myTester);
            if ((myTester % 2) == 0) {
                break;
            }
            System.out.println(myTester);
        }

        System.out.println("\nPrint Days");
        int randDay = rand.nextInt(7);
        if ((randDay == 0) || (randDay == 6)) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        System.out.println("\nPrint Days");
        randDay = rand.nextInt(3);
        if (randDay == 0) {
            System.out.println("Sunday");
        } else if (randDay == 1) {
            System.out.println("Monday");
        } else if (randDay == 2) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Error");
        }

        System.out.println("\nSwitch Days");
        switch(randDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Error");
        }

    }
}
