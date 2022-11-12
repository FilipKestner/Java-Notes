package m1_basic_concepts.m1_assignments.a08_higherorlower;

import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        int secret = 64;
        int guess;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Can you guess the number? ");

        while(true) {
            System.out.print("Enter a number: ");
            guess = keyboard.nextInt();

            if(guess == secret) {
                System.out.println("Congratulations!");
                return;
            }
            if(guess < secret) {
                System.out.println("Higher");
            }
            if(guess > secret) {
                System.out.println("Lower");
            } // end if
        }//end while
    }//end main
}//end class
