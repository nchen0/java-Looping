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
    }
}
