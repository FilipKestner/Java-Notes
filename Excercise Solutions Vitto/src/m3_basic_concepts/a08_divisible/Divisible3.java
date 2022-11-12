package m3_basic_concepts.a08_divisible;

import java.util.Scanner;

public class Divisible3 {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int firstNumber, secondNumber;
        int productNumber;
        boolean working = true;
        final int maximumValue = 1000;

        System.out.print("We'll print all numbers below 1000 that are divisible between 2 numbers of your choosing.");

        while (working){
            firstNumber = 0;
            secondNumber = 0;
            System.out.print("\nEnter the first divider (end program with 0): ");
            firstNumber = keyboard.nextInt();
            if (firstNumber < 0){
                System.out.println("Please enter positive numbers");
                continue;
            }
            else if (firstNumber == 0){
                return;
            }
            System.out.print("Enter the second divider (end program with 0): ");
            secondNumber = keyboard.nextInt();
            if (secondNumber < 0){
                System.out.println("Please enter positive numbers");
                continue;
            }
            else if (secondNumber == 0){
                return;
            }
            productNumber = firstNumber * secondNumber;
            for(int i = 1; i < maximumValue; i++) {
                if (i % productNumber == 0) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
