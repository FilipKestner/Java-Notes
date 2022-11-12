package m2_basic_concepts.m2_assignments.a05_numbersv3;

import java.util.Scanner;

public class NumbersV3 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        final double MINIMUM_DIVIDEND = 1_000_000_000_000.0;
        final double MINIMUM_DIVISOR = 10_000_000;

        double firstNumber, secondNumber;
        double quotient;
        int finalQuotient;

        System.out.println("Enter a 13-digit whole number: ");
        firstNumber = keyboard.nextDouble();
        if (firstNumber >= MINIMUM_DIVIDEND){
            System.out.println("Enter an 8-digit whole number: ");
            secondNumber = keyboard.nextDouble();
            if (secondNumber >= MINIMUM_DIVISOR){
                quotient = firstNumber / secondNumber;
                System.out.println("The quotient is: " + quotient);
                finalQuotient = (int)quotient;
                System.out.println("Without the fractional part it's " + finalQuotient);
            }
            else{
                System.out.println("The number is too small");
            }
        }
        else{
            System.out.println("The number is too small");
        }

    }
}
