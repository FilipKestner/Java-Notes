package m1_basic_concepts.m1_assignments.a08_higherorlower;

import java.util.Scanner;

public class HigherLowerAdvanced {
    public static void main(String[] args) {
        int secret = 64;
        int guess;
        int tries = 0;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Guess the number: ");
        guess = keyboard.nextInt();
        tries += 1;

        while (guess != secret) {
            if (guess > secret) {
                System.out.println("Lower!");
                tries += 1;
                System.out.print("Try again: ");
                guess = keyboard.nextInt();
            }
            if (guess < secret) {
                System.out.println("Higher!");
                tries += 1;
                System.out.print("Try again: ");
                guess = keyboard.nextInt();
            }
        }
            System.out.print("Congratulations! You guessed the number in " + tries + " tries");

    }
}
