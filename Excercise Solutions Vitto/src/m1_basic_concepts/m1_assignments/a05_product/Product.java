package m1_basic_concepts.m1_assignments.a05_product;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int product;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        firstNumber = keyboard.nextInt();

        System.out.print("Enter another number: ");
        secondNumber = keyboard.nextInt();

        System.out.print("Enter a final number: ");
        thirdNumber = keyboard.nextInt();

        product = firstNumber*secondNumber*thirdNumber;

        System.out.println("The product is: " + product);
    }
}
