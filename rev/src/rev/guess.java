package rev;

import java.util.Random;
import java.util.Scanner;

public class guess{
    public static void main(String[] args) {
//        System.out.println("Please Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: + answer");
//        System.out.println("Enter your name: ");
//        String name =scanner.next();
//        System.out.println("Hello "+name);


//        Random random = new Random();
//        int number = random.nextInt(20) +1;
//        System.out.println("number: " + number);

        System.out.println("Welcome to Guess Empire");
        System.out.println("May aihave your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hello " + name);

        System.out.println("Shall we strart");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer !=1) {
            System.out.println("Shall we strart");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");


            beginAnswer = scanner.nextInt();
        }
        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;

            if(timesTried < 5) {
                if (userInput == x) {
                    hasWon = true;
                    shouldFinish = true;
                }else if (userInput > x) {
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();
                }else {
                    System.out.println("Guess Higher");
                    userInput = scanner.nextInt();
                }

            }else {
                shouldFinish = true;
            }
        }
        if(hasWon) {
            System.out.println("Congratulations! you have guessed in your "+timesTried+" guess");
        }else {
            System.out.println("Game Over");
            System.out.println("The number was: " + x);
        }

    }
}
