package m2_basic_concepts.m2_assignments.a04_numbersv2;

import java.util.Scanner;

public class NumbersV2 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        final long MINIMUM = 100000L;
        final long MAXIMUM = 999999L;

        long firstNumber, secondNumber;

        long product;
        long finalFiveDigits;

        System.out.println("Enter a 6-digit whole number: ");
        firstNumber = keyboard.nextLong();
        if (firstNumber >= MINIMUM && firstNumber <= MAXIMUM) {
            System.out.println("Enter another 6-digit whole number: ");
            secondNumber = keyboard.nextLong();
            if (secondNumber >= MINIMUM && secondNumber <= MAXIMUM) {
                product = firstNumber * secondNumber;
                System.out.println("The product is: " + product);
                finalFiveDigits = product%100000;
                System.out.println("The 5 final digits are: " + finalFiveDigits);
            }
            else{
                System.out.println("The number entered is not a valid number!");
            }
        }
        else{
            System.out.println("The number entered is not a valid number!");
        }


    }
}
