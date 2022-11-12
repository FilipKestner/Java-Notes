package m1_basic_concepts.m1_assignments.a10_summation;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        int result = 0;
        int number;
        int amount = 0;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Enter a number (to stop enter 0): ");
        number = keyboard.nextInt();

        while (number  != 0) {
            result += number;
            System.out.print("Enter a number (to stop enter 0): ");
            number = keyboard.nextInt();
            amount += 1;
        }

        System.out.println("The sum of the " + amount + " numbers you wrote is: " + result);

    }
}
