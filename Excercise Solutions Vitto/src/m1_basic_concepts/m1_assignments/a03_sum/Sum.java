package m1_basic_concepts.m1_assignments.a03_sum;

import java.util.Scanner;

public class Sum {
    //Ask user for 2 numbers and then sum them together
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Enter a number:");
        firstNumber = keyboard.nextInt();
        System.out.print("Enter another number:");
        secondNumber = keyboard.nextInt();

        sum = firstNumber + secondNumber;
        System.out.println("The sum is:" + sum + "! Good job:)");
    }

}
