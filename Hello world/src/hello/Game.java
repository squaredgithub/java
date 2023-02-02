package hello;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome here");
        System.out.println("May i have your name");


        Scanner sr = new Scanner(System.in);
        String ae = sr.next();
        System.out.println("Hello " + ae);

        System.out.println("Shall we start");
        System.out.println("\t1. yes");
        System.out.println("\t2. No");

        int ger = sr.nextInt();

        while (ger !=1) {
            System.out.println("Shall we start");
            System.out.println("\t1. yes");
            System.out.println("\t2. No");

            ger = sr.nextInt();
        }

        Random rd = new Random();
        int x = rd.nextInt(20) +1;
        System.out.println("Please guess a number");
        int userInput = sr.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;

            if (timesTried<5) {
                if (userInput == x) {
                    hasWon = true;
                    shouldFinish = true;
                }else if (userInput > x) {
                    System.out.println("Guess lower");
                    userInput = sr.nextInt();

                }else {
                    System.out.println("Guess higher");
                    userInput = sr.nextInt();
                }

            }else {
                shouldFinish = true;
            }


        }
        if (hasWon) {
            System.out.println("Congratulations! you have guessed in your " +timesTried + "guess.");

        }else {
            System.out.println("Game Over! ");
            System.out.println("The number was " + x);
        }


    }
}
