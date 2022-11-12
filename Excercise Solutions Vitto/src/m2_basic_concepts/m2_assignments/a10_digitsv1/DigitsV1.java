package m2_basic_concepts.m2_assignments.a10_digitsv1;

import java.util.Scanner;

public class DigitsV1 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int start = 0;
        int digit;
        int multiplier = 0;
        int finalNumber = 0;

        while(start != -1) {
            System.out.print("Please enter a digit between 1 and 9(-1 to stop the program): ");
            digit = keyboard.nextInt();
            start = digit;
            if(digit > 0 && digit <= 9) {
                digit = digit * (int)(Math.pow(10, multiplier));
                multiplier++;
                finalNumber += digit;
            }
            else{
                System.out.println("You entered an invalid digit.");
            }

        }
        System.out.println("The number is " + finalNumber);

    }
}
